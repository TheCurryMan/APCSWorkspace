//import java.util.List;
import java.util.Stack;

/**
 *  access to browserview
 *
 *  @author  jessicajiang
 *  @version Jan 20, 2015
 *  @author  Period: TODO
 *  @author  Assignment: JMCh21_3Browsing
 *
 *  @author  Sources: TODO
 */
public class BrowserModel
{
    private BrowserView view;
    private Stack<Integer> backStk;
    private Stack<Integer> forwardStk;
    private int topLine;

    /**
     * constructor Browserview
     *
     * @param view2
     *            a browser view
     */
    public BrowserModel(BrowserView view2) {
        backStk = new Stack<Integer>();
        forwardStk = new Stack<Integer>();
 
        view = view2;
        view.update(0);
 
    }
 
    /**
     * follows link
     *
     * @param n
     *            goes to n
     */
    public void followLink(int n) {
        Integer num = new Integer(topLine);
        backStk.push(num);
 
        topLine = n;
        view.update(topLine);
        forwardStk.removeAllElements();
 
    }
 
    /**
     * back boolean
     *
     * @return boolean stk
     */
    public boolean hasBack() {
 
        return !backStk.empty();
    }
 
    /**
     * forward boolean
     *
     * @return boolean stk
     */
    public boolean hasForward() {
 
        return !forwardStk.empty();
    }
 
    /** 
     * home returns void
     */
    public void home() {
        Integer num = new Integer(topLine);
        backStk.push(num);
 
        topLine = 0;
        view.update(topLine);
        forwardStk.removeAllElements();
 
    }
 
    /**
     * back returns void
     */
    public void back() {
        Integer n = new Integer(topLine);
        forwardStk.push(n);
 
        System.out.println("backA: " + topLine);
        if (hasBack()) {
 
            int num = backStk.pop().intValue();
            topLine = num;
        }
        view.update(topLine);
        System.out.println("backB: " + topLine);
    }
 
    /**
     * forward returns void
     */
    public void forward() 
    {
 
        Integer n = new Integer(topLine);
        backStk.push(n);
        if (hasForward()) {
 
            int num = forwardStk.pop().intValue();
            topLine = num;
            view.update(topLine);
        }
    }

    // The following are for test purposes only
    /**
     * get back
     * @return stack integer
     */
    protected Stack<Integer> getBackStk()
    {
        return backStk;
    }

    /**
     * get forward
     * @return stack integer
     */
    protected Stack<Integer> getForwardStk()
    {
        return forwardStk;
    }
    
    /**
     * get topline
     * @return just int
     */
    protected int getTopLine()
    {
        return topLine;
    }
}

