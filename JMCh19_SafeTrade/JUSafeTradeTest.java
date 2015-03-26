import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.regex.*;

import org.junit.*;

import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;

/**
 * 
 * https://courses.cs.washington.edu/courses/cse143/11wi/eclipse-tutorial/junit.shtml
 * SafeTrade tests:
 *   TradeOrder
 *   PriceComparator
 *   Trader
 *   Brokerage
 *   StockExchange
 *   Stock
 *
 * @author TODO Name of principal author
 * @author TODO Name of group member
 * @author TODO Name of group member
 * @version TODO date
 * @author Assignment: JM Chapter 19 - SafeTrade
 * 
 * @author Sources: TODO sources
 *
 */
public class JUSafeTradeTest
{
    // --Test TradeOrder
    /**
     * TradeOrder tests:
     *   TradeOrderConstructor - constructs TradeOrder and then compare toString
     *   TradeOrderGetTrader - compares value returned to constructed value
     *   TradeOrderGetSymbol - compares value returned to constructed value
     *   TradeOrderIsBuy - compares value returned to constructed value
     *   TradeOrderIsSell - compares value returned to constructed value
     *   TradeOrderIsMarket - compares value returned to constructed value
     *   TradeOrderIsLimit - compares value returned to constructed value
     *   TradeOrderGetShares - compares value returned to constructed value
     *   TradeOrderGetPrice - compares value returned to constructed value
     *   TradeOrderSubtractShares - subtracts known value & compares result
     *     returned by getShares to expected value
     */
    private String symbol = "GGGL";
    private boolean buyOrder = true;
    private boolean marketOrder = true;
    private int numShares = 123;
    private int numToSubtract = 24;
    private double price = 123.45;

    @Test
    public void tradeOrderConstructor()
    {
        TradeOrder to = new TradeOrder( null, symbol, buyOrder, marketOrder,
            numShares, price );
        String toStr = to.toString();

        assertTrue( "<< Invalid TradeOrder Constructor >>",
                    toStr.contains( "TradeOrder[Trader trader:null" )
                        && toStr.contains( "java.lang.String symbol:" + symbol )
                        && toStr.contains( "boolean buyOrder:" + buyOrder )
                        && toStr.contains( "boolean marketOrder:" + marketOrder )
                        && toStr.contains( "int numShares:" + numShares )
                        && toStr.contains( "double price:" + price ) );
    }
    
    @Test
    public void TradeOrderToString()
    {
        TradeOrder to = new TradeOrder( null, symbol, buyOrder, marketOrder,
            numShares, price );
        assertNotNull( to.toString() );
    }

    @Test
    public void tradeOrderGetTrader()
    {
        TradeOrder to = new TradeOrder( null, symbol, buyOrder, marketOrder,
            numShares, price );
        assertNull( "<< TradeOrder: " + to.getTrader() + " should be null >>",
                    to.getTrader() );
    }

    @Test
    public void tradeOrderGetSymbol()
    {
        TradeOrder to = new TradeOrder( null, symbol, buyOrder, marketOrder,
            numShares, price );
        assertEquals( "<< TradeOrder: " + to.getTrader() + " should be "
            + symbol + " >>", symbol, to.getSymbol() );
    }

    @Test
    public void tradeOrderIsBuy()
    {
        TradeOrder to = new TradeOrder( null, symbol, buyOrder, marketOrder,
            numShares, price );

        assertTrue( "<< TradeOrder: " + to.isBuy() + " should be " + buyOrder
            + " >>", to.isBuy() );
    }

    @Test
    public void tradeOrderIsSell()
    {
        TradeOrder to = new TradeOrder( null, symbol, buyOrder, marketOrder,
            numShares, price );
        assertFalse( "<< TradeOrder: " + to.isSell() + " should be "
            + !buyOrder + " >>", to.isSell() );
    }

    @Test
    public void tradeOrderIsMarket()
    {
        TradeOrder to = new TradeOrder( null, symbol, buyOrder, marketOrder,
            numShares, price );
        assertTrue( "<< TradeOrder: " + to.isMarket() + " should be "
            + marketOrder + " >>", to.isMarket() );
    }

    @Test
    public void tradeOrderIsLimit()
    {
        TradeOrder to = new TradeOrder( null, symbol, buyOrder, marketOrder,
            numShares, price );

        assertFalse( "<< TradeOrder: " + to.isLimit() + " should be "
            + !marketOrder + ">>", to.isLimit() );
    }

    @Test
    public void tradeOrderGetShares()
    {
        TradeOrder to = new TradeOrder( null, symbol, buyOrder, marketOrder,
            numShares, price );
        assertTrue( "<< TradeOrder: " + to.getShares() + " should be "
            + numShares + ">>", numShares == to.getShares()
            || ( numShares - numToSubtract ) == to.getShares() );
    }

    @Test
    public void tradeOrderGetPrice()
    {
        TradeOrder to = new TradeOrder( null, symbol, buyOrder, marketOrder,
            numShares, price );
        assertEquals( "<< TradeOrder: " + to.getPrice() + " should be " + price
            + ">>", price, to.getPrice(), 0.0 );
    }

    @Test
    public void tradeOrderSubtractShares()
    {
        TradeOrder to = new TradeOrder( null, symbol, buyOrder, marketOrder,
            numShares, price );
        to.subtractShares( numToSubtract );
        assertEquals( "<< TradeOrder: subtractShares(" + numToSubtract
            + ") should be " + ( numShares - numToSubtract ) + ">>", numShares
            - numToSubtract, to.getShares() );
    }
    
    // --Test TraderWindow Stub
    @Test
    public void traderWindowConstructor()
    {
        TraderWindow tw = new TraderWindow( null );
        assertNotNull( tw );
    }

    @Test
    public void traderWindowShowMessage()
    {
        TraderWindow tw = new TraderWindow( null );
        assertNotNull( tw );
        tw.showMessage( null );
    }

    //  --Test PriceComparator
    @Test
    
    public void priceComparatorConstructor()
    {
        PriceComparator pc = new PriceComparator();
        String toStr = pc.toString();
        
        //assertTrue
        
    }
    
    /**
     * Trade tests:
     * 
     * 
     */
    private String screenName = "jessica";
    private String password = "jiang";
    private Queue<String> mailbox = null;
    private TraderWindow myWindow = null;
    private Trader other = null;
    private TradeOrder order = null;
    private String msg = "message";
    
    
    // --Test Trader
    @Test
    public void traderConstructor()
    {
        Trader trader = new Trader(null, screenName, password);
        String toStr = trader.toString();

        assertTrue( "<< Invalid Trader Constructor >>",
                    toStr.contains( "Trader[Brokerage brokerage: null" )
                        && toStr.contains( "java.lang.String screenName:" + screenName )
                        && toStr.contains( "java.lang.String password:" + password ));
                        //&& toStr.contains( "TraderWindow myWindow:" + myWindow )
                        //&& toStr.contains( "Queue<String> mailbox:" + mailbox);
    }
    
    
   @Test
   public void TraderToString()
   {
       Trader trader = new Trader(null, screenName, password);
       assertNotNull( trader.toString() );
   }
   
   @Test
   public void TraderGetName()
   {
       Trader trader = new Trader(null, screenName, password);
       assertNotNull("<<Trader name: " + trader.getName());
   }
   
   @Test
   public void TraderGetPassword()
   {
       Trader trader = new Trader(null, screenName, password);
       assertNotNull("<<Trader password: " + trader.getPassword());
   }
   
   @Test
   public void TraderGetQuote()
   {
       Trader trader = new Trader(null, screenName, password);
       trader.getQuote( symbol );
       assertNotNull("<<Trader quote: " + symbol);
   }
   
   @Test
   public void TraderCompareTo()
   {
       Trader trader = new Trader(null, screenName, password);
       
   }
   
   @Test
   public void TraderHasMessages()
   {
       Trader trader = new Trader(null, screenName, password);
       assertNull("<<Trader's mailbox is: " + trader.hasMessages());
       
   }
   
   @Test
   public void TraderOpenWindow()
   {
       Trader trader = new Trader(null, screenName, password);
       trader.openWindow();
       //assertNull("<<Trader's mailbox is: "+ trader.openWindow());
   }
   
   @Test
   public void TraderEquals()
   {
       Trader trader = new Trader(null, screenName, password);
       trader.equals( other );
       assertEquals( "<<Trader: equals " + other + ">>", other);
       
   }
   
   @Test
   public void TraderPlaceOrder()
   {
       Trader trader = new Trader(null, screenName, password);
       trader.placeOrder( order );
       assertNull("<<Trader: placeOrder " + order);
   }
   
   @Test
   public void TraderQuit()
   {
       Trader trader = new Trader(null, screenName, password);
       
       assertNull("<<Trader: quit " + trader.quit());
   }
   
   @Test
   public void TraderReceiveMessage()
   {
       Trader trader = new Trader(null, screenName, password);
       asserttrader.receiveMessage( msg );
       
   }
    
    // --Test Brokerage
    // TODO your tests here
    
    
    // --Test StockExchange
    
   public void stockExchangeTest()
   {
       StockExchange s = new StockExchange();
       s.listStock( "asdf", "QWERTY", .10 );
       s.toString();
       s.getQuote( "asdf" );

       /*Map<String, Stock> listedStocks = new HashMap<String, Stock>();
       listedStocks.put( "asdf", new Stock( "asdf", "QWERTY", .10 ) );

       assertFalse( listedStocks.equals( s.getListedStocks() ) );
       try
       {
           s.placeOrder( null );
       }
       catch ( Exception ex )
       {
       }
       */

   }
    
    // --Test Stock
    
   @Test
   public void Stock()
   {
       Stock a = new Stock( null, null, 0 );
       a.executeOrders();
       a.getCompanyName();
       a.getStockSymbol();
       a.getLastPrice();
       a.getVolume();
       a.toString();
       a.getLoPrice();
       a.getHiPrice();
       a.getBuyOrders();
       a.getSellOrders();
       a.getQuote();

       try
       {
           a.placeOrder( null );
       }
       catch ( Exception e )
       {

       }

   }
   
   /*
    * @Test
    public void Trader()
    {
        Trader t = new Trader( new Brokerage( new StockExchange() ),
            "a",
            "b" );
        Trader v = new Trader( new Brokerage( null ), "asdf", "b" );
        assertEquals( t.getName(), "a" );
        assertEquals( t.getPassword(), "b" );
        assertTrue( t.equals( t ) );
        assertEquals( t.compareTo( v ), "a".compareTo( "asdf" ) );
        t.toString();
        try
        {
            t.equals( new StockExchange() );
        }
        catch ( Exception ex )
        {
        }
        t.getQuote( null );
        t.openWindow();
        {
            try
            {
                t.placeOrder( null );
            }
            catch ( Exception e )
            {
            }
            assertFalse( t.hasMessages() );
 
            t.receiveMessage( "hi" );
 
            assertFalse( t.mailbox().equals( "a" ) );
 
            t.receiveMessage( "aeiou" );
            t.quit();
        }
    }
    */

    
    // Remove block comment below to run JUnit test in console
/*
    public static junit.framework.Test suite()
    {
        return new JUnit4TestAdapter( JUSafeTradeTest.class );
    }
    
    public static void main( String args[] )
    {
        org.junit.runner.JUnitCore.main( "JUSafeTradeTest" );
    }
*/
}

