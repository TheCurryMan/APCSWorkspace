import org.junit.*;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;

public class JUTestVendor
{
    private static final int FULL_STOCK = 5;
    private static final int ITEM_COST = 45;

    private Vendor machine1;

    @Before
    public void setUp()
    {
        machine1 = new Vendor(ITEM_COST, FULL_STOCK);
        //System.out.println("setUp - " + machine1);
    }

    @Test
    public void testVendorConstructor()
    {
        assertEquals(FULL_STOCK, machine1.getStock());
        assertEquals(0, machine1.getDeposit());
        assertEquals(0, machine1.getChange());
        assertEquals(0.0, Vendor.getTotalSales(), 0);
        //System.out.println("testVendorConstructor - " + machine1);
    }

    @Test
    public void testsetStock()
    {
        machine1.setStock(0);
        assertEquals(0, machine1.getStock());
        machine1.setStock(FULL_STOCK);
        assertEquals(FULL_STOCK, machine1.getStock());
        //System.out.println("testsetStock - " + machine1);
    }

    @Test
    public void testaddMoneyEmpty()
    {
        // can't add money when stock is 0
        machine1.setStock(0);
        assertEquals(0, machine1.getStock());
        machine1.addMoney(ITEM_COST);
        assertEquals(0, machine1.getDeposit());
        //System.out.println("testaddMoneyEmpty - " + machine1);
    }

    @Test
    public void testaddMoneyStocked()
    {
        // add money when has stock
        machine1.setStock(FULL_STOCK);
        machine1.addMoney(ITEM_COST);
        assertEquals(ITEM_COST, machine1.getDeposit());
        //System.out.println("testaddMoneyStocked - " + machine1);
    }

    @Test
    public void testmakeSaleEmpty()
    {
        double currentTotal = Vendor.getTotalSales();
        machine1.setStock(0);
        boolean result = machine1.makeSale();
        assertFalse("sale made with no stock", result);
        if (!result)
        {
            assertEquals(machine1.getDeposit(), machine1.getChange());
        }
        assertEquals(currentTotal, Vendor.getTotalSales(), 0);
        //System.out.println("testmakeSaleEmpty - " + machine1);
    }

    @Test
    public void testmakeSaleDepositToSmall()
    {
        double currentTotal = Vendor.getTotalSales();
        machine1.setStock(FULL_STOCK);
        machine1.addMoney(ITEM_COST-5);
        //System.out.println("testmakeSaleDepositToSmall - " + machine1);
        boolean result = machine1.makeSale();
        assertFalse("sale made with to little money", result);
        if (!result)
        {
            assertEquals(0, machine1.getDeposit());
            assertEquals(ITEM_COST-5, machine1.getChange());
        }
        assertEquals(currentTotal, Vendor.getTotalSales(), 0);
        //System.out.println("testmakeSaleDepositToSmall - " + machine1);
    }

    @Test
    public void testmakeSaleNoChange()
    {
        machine1.setStock(FULL_STOCK);
        machine1.addMoney(ITEM_COST);
        boolean result = machine1.makeSale();
        //System.out.println("testmakeSaleNoChange - " + machine1);
        assertTrue("no sale with stock and correct money", result);
        if (result)
        {
            assertEquals(FULL_STOCK-1, machine1.getStock());
            assertEquals(0, machine1.getDeposit());
            assertEquals(0, machine1.getChange());
        }
        assertEquals(ITEM_COST * 0.01, Vendor.getTotalSales(), 0);
        //System.out.println("testmakeSaleNoChange - " + machine1);
    }

    @Test
    public void testmakeSaleWithChange()
    {
        machine1.setStock(FULL_STOCK);
        int moneyToAdd = 2 * ITEM_COST + 5;
        machine1.addMoney(moneyToAdd);
        boolean result = machine1.makeSale();
        //System.out.println("testmakeSaleWithChange - " + machine1);
        assertTrue("no sale with stock and sufficient money", result);
        if (result)
        {
            assertEquals(FULL_STOCK-1, machine1.getStock());
            assertEquals(0, machine1.getDeposit());
            assertEquals(ITEM_COST + 5, machine1.getChange());
        }
        assertEquals(ITEM_COST * 0.01, Vendor.getTotalSales(), 0);
        //System.out.println("testmakeSaleWithChange - " + machine1);
    }

    @Test
    public void testmakeSaleX3()
    {
        machine1.setStock(FULL_STOCK);
        int numSales;
        for (numSales = 1; numSales <= 3 ; numSales++)
        {
            machine1.addMoney(ITEM_COST + numSales);
            boolean result = machine1.makeSale();
            //System.out.println("testmakeSaleWithChange - " + machine1);
            assertTrue("no sale with stock and sufficient money", result);
            if (result)
            {
                assertEquals(FULL_STOCK-numSales, machine1.getStock());
                assertEquals(0, machine1.getDeposit());
                assertEquals(numSales, machine1.getChange());
            }
        }
        //System.out.println("testmakeSaleX3 - " + machine1);
        assertEquals((numSales-1) * ITEM_COST * 0.01, Vendor.getTotalSales(), 0);
        //System.out.println("testmakeSaleX3 - " + machine1);
    }

    public static junit.framework.Test suite()
    {
        return new JUnit4TestAdapter( JUTestVendor.class );
    }

    public static void main( String args[] )
    {
        org.junit.runner.JUnitCore.main( "JUTestVendor" );
    }
}
