import java.lang.reflect.*;

/**
   This class implements a vendor that sells one kind of item.
   A vendor carries out sales transactions.

   @author  Jessica Jiang
   @version September 30, 2014

   @author Period - 4
   @author Assignment - Java Methods Ch09 - SnackBar

   @author Sources - TODO list collaborators
 */
public class Vendor
{
    //TODO: change the fields
    int price = 0;
    int stock = 5;
    int items = 0;
    int cents = 0;
    
//  Parameters:
    //    int price of a single item in cents
    //    int number of items to place in stock
    Vendor vendor = new Vendor(price, s);
    {
        
        
    }

    //  Sets the quantity of items in stock.
    //  Parameters:
    //    int number of items to place in stock
    //  Return:
    //    None
    //TODO: make this code actually work LOL
    public void setStock( int items )
    {
        if (vendor.stock == 0)
        {
            items = 5;
        }
    }

    //  Returns the number of items currently in stock.
    //  Parameters:
    //    None
    //  Return:
    //    int number of items currently in stock
    public int getStock()
    {
        return vendor.stock;
    }

    /**  Adds a specified amount (in cents) to the deposited amount.
    //  @param int number of cents to add to the deposit
    //  @return none
    */
    public void addMoney ( int cents)
    {
        int money = price + cents;
    }

    /**  Returns the currently deposited amount (in cents).
    //  @param none
    //  @return int number of cents in the current deposit
    */
    public int getDeposit ()
    {
        return money;
    }

    //  Implements a sale.  If there are items in stock and
    //  the deposited amount is greater than or equal to
    //  the single item price, then adjusts the stock
    //  and calculates and sets change and returns true;
    //  otherwise refunds the whole deposit (moves it into change)
    //  and returns false.
    //  Parameters:
    //    None
    //  Return:
    //    boolean successful sale (true) or failure (false)
    public boolean makeSale ()
    {
        if (items > 0 && vendor.addMoney() >= this.price )
        {
            stock --;
            vendor.getChange();
            return true;
        }
        else
        {
            return false;
        }
    }

    //  Returns and zeroes out the amount of change (from the last
    //  sale or refund).
    //  Parameters:
    //    None
    //  Return:
    //    int number of cents in the current change
    public int getChange ()
    {
        
    }

    /**
        Intended only for debugging.
        
        <p>A generic toString implementation that uses reflection to print
        names and values of all fields <em>declared in this class</em>.
        Note that superclass fields are left out of this implementation.</p>
        
        @return  a string representation of this Vendor.
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
                str += separator + field.getName() + ":" + field.get( this );
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
