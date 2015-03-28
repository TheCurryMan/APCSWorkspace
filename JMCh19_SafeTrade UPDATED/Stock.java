import java.util.*;
import java.lang.reflect.*;
import java.text.DecimalFormat;


/**
 * Represents a stock in the SafeTrade project
 */
public class Stock
{
    public static DecimalFormat money = new DecimalFormat( "0.00" );

    private String stockSymbol;

    private String companyName;

    private double loPrice, hiPrice, lastPrice;

    private int volume;

    private PriorityQueue<TradeOrder> buyOrders, sellOrders;


    public Stock( String symbol, String name, double price )
    {
        stockSymbol = symbol;
        companyName = name;
        loPrice = price;
        hiPrice = price;
        lastPrice = price;
        volume = 0;
        sellOrders = new PriorityQueue<TradeOrder>( 10, new PriceComparator() );
        buyOrders = new PriorityQueue<TradeOrder>( 10,
            new PriceComparator( false ) );
    }


    public void executeOrders()
    {
        if ( buyOrders.isEmpty() || sellOrders.isEmpty() )
        {
            return;
        }

        TradeOrder buy = buyOrders.peek();
        TradeOrder sell = sellOrders.peek();

        Trader buyer = buy.getTrader();
        Trader seller = sell.getTrader();

        double price = 0;

        if ( buy.isLimit() && sell.isLimit()
            && buy.getPrice() >= sell.getPrice() )
        {
            price = sell.getPrice();
        }

        else if ( buy.isLimit() && sell.isMarket() )
        {
            price = buy.getPrice();
        }

        else if ( buy.isMarket() && sell.isLimit() )
        {
            price = sell.getPrice();
        }

        else if ( buy.isMarket() && sell.isMarket() )
        {
            price = lastPrice;
        }

        // sell price > buy price
        else
        {
            return; // does nothing
        }

        int nShares = Math.min( buy.getShares(), sell.getShares() );

        buy.subtractShares( nShares );
        sell.subtractShares( nShares );

        if ( buy.getShares() == 0 )
        {
            buyOrders.remove( buy );
        }
        
        if ( sell.getShares() == 0 )
        {
            sellOrders.remove( sell );
        }

        if ( price < loPrice )
        {
            loPrice = price;
        }

        if ( price > hiPrice )
        {
            hiPrice = price;
        }

        volume += nShares;
        lastPrice = price;

        buyer.receiveMessage( "You bought: " + nShares + " " + stockSymbol
            + " at " + money.format( price ) + " amt "
            + money.format( nShares * price ) );
        seller.receiveMessage( "You sold: " + nShares + " " + stockSymbol
            + " at " + money.format( price ) + " amt "
            + money.format( nShares * price ) );

        if ( !buyOrders.isEmpty() && !sellOrders.isEmpty() )
        {
            executeOrders();
        }
    }


    public String getQuote()
    {
        String quote = companyName + " (" + stockSymbol + ")" + "\n"
            + "Price: " + lastPrice + " hi: " + hiPrice + " lo: " + loPrice
            + " vol: " + volume + "\n";
        String ask = "Ask: none";
        String bid = "Bid: none";
        if ( sellOrders.peek() != null )
        {
            ask = "Ask: " + sellOrders.peek().getPrice() + " size: "
                + sellOrders.peek().getShares();
        }
        if ( buyOrders.peek() != null )
        {
            bid = "Bid: " + buyOrders.peek().getPrice() + " size: "
                + buyOrders.peek().getShares();
        }
        return quote + ask + " " + bid;

    }


    public void placeOrder( TradeOrder order )
    {
        String str = "New Order: ";
        if ( order == null )
        {
            //TODO probably print a stock not found error or something.
            return;
        }
        if ( order.isBuy() )
        {
            buyOrders.add( order );
            str += "Buy " + order.getSymbol() + " (" + this.companyName + 
                            ")" + "\n" + order.getShares() + " shares at ";
            if ( !order.isMarket() )
            {
                str += money.format(order.getPrice());
            }
            else
            {
                str += "market";
            }
        }
        else
        {
            sellOrders.add( order );
            str += "Sell " + order.getSymbol() + " (" + this.companyName + ") "
                + "\n" + order.getShares() + " shares at ";
            if ( !order.isMarket() )
            {
                str += money.format(order.getPrice());
            }
            else
            {
                str += "market";
            }
        }

        order.getTrader().receiveMessage( str );
        executeOrders();
    }


    //
    // The following are for test purposes only
    //

    protected String getStockSymbol()
    {
        return stockSymbol;
    }


    protected String getCompanyName()
    {
        return companyName;
    }


    protected double getLoPrice()
    {
        return loPrice;
    }


    protected double getHiPrice()
    {
        return hiPrice;
    }


    protected double getLastPrice()
    {
        return lastPrice;
    }


    protected int getVolume()
    {
        return volume;
    }


    protected PriorityQueue<TradeOrder> getBuyOrders()
    {
        return buyOrders;
    }


    protected PriorityQueue<TradeOrder> getSellOrders()
    {
        return sellOrders;
    }


    /**
     * <p>
     * A generic toString implementation that uses reflection to print names and
     * values of all fields <em>declared in this class</em>. Note that
     * superclass fields are left out of this implementation.
     * </p>
     * 
     * @return a string representation of this Stock.
     */
    public String toString()
    {
        String str = this.getClass().getName() + "[";
        String separator = "";

        Field[] fields = this.getClass().getDeclaredFields();

        for ( Field field : fields )
        {
            try
            {
                str += separator + field.getType().getName() + " "
                    + field.getName() + ":" + field.get( this );
            }
            catch ( IllegalAccessException ex )
            {
                System.out.println( ex );
            }

            separator = ", ";
        }

        return str + "]";
    }

}
