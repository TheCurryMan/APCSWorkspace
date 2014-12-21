import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.AudioClip;

/**
   TODO Write a one-sentence summary of your class here.
   TODO Follow it with additional details about its purpose, what abstraction
   it represents, and how to use it.

   @author  TODO Your Name
   @version TODO Date

   @author  Period - TODO Your Period
   @author  Assignment - Lab 12.3: Fortune Teller

   @author  Sources - TODO list collaborators
 */
public class FortuneTeller extends JApplet implements ActionListener
{
    // Declare an array of "fortunes" (strings):
    ___________________________________________
    ...

    private JTextField display;
    private AudioClip ding;

    public void init()
    {
        ding = getAudioClip(getDocumentBase(), "ding.wav");

        display = new JTextField("  Press \"Next\" to see your fortune...", 30);
        display.setBackground(Color.WHITE);
        display.setEditable(false);

        JButton go = new JButton("Next");
        go.addActionListener(this);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(display);
        c.add(go);
    }

    public void actionPerformed(ActionEvent e)
    {
        ding.play();

        // Pick a random fortune:
        ___________________________________________
        ...
        display.setText("  " + ... );
    }
}

