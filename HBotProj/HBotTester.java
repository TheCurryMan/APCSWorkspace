import kareltherobot.*;

/**
 *  Draws an 'H' on a blank 10 x 10 world by placing beepers.
 *
 *  @author  G, Peck
 *  @version 08/24/10e
 *  Period: 1-7
 *  Assignment: HBotProj
 *
 *  Sources: TODO list collaborators
 */
public class HBotTester implements Directions
{
   /**
    * Draws an 'H' on a blank 10 x 10 world by placing beepers.
    * @param args command-line arguments not used
    */
   public static void main( String args[] )
   {
      HBot h = new HBot( 1, 1, North, infinity );
      
      h.drawH();
      h.turnOff();
   }

   static
   {
      World.reset();
      World.readWorld( "10x10.wld" );  // put the file within this project's folder
      World.setDelay( 10 );
      World.setVisible( true );
   }
}