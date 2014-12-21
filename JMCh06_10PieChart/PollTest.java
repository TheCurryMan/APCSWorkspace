/**
 *  TODO Write a one-sentence summary of your class here.
 *
 *  @author  TODO your name
 *  @version TODO date
 *  @author  Period: TODO your period
 *  @author  Assignment: JMCh06_10PieChart
 *
 *  @author  Sources: TODO list collaborators
 */
public class PollTest
{
    public static void main(String[] args) 
    { 
    PollDisplayPanel votingMachine = 
    new PollDisplayPanel("Tami", "Brian", "Liz"); 
    votingMachine.vote1(); 
    votingMachine.vote2(); 
    votingMachine.vote2(); 
    System.out.println(votingMachine); 
    } 
}
