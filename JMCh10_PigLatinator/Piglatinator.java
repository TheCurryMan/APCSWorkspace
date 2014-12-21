import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Piglatinator extends JFrame implements ActionListener
{
    private JFrame thisWindow;
    private JTextArea original, translation;
    private JButton go;

    // Constructor
    public Piglatinator()
    {
        super("Piglatinator");
        thisWindow = this;

        setJMenuBar(new PiglatinatorMenu(this));
        setupGui();

        original.setText("Type or paste your text here or load it from a file");
        refresh();
    }

    public String getText()
    {
        return original.getText();
    }

    public void setText(String text)
    {
        original.setText(text);
    }

    public void refresh()
    {
        String text = original.getText();
        PiglatinAnalyzer analyzer = new PiglatinAnalyzer(text);
        translation.setText(analyzer.phraseToPigLatin());
    }

    // Called when the Refresh button is clicked
    public void actionPerformed(ActionEvent e)
    {
        refresh();
    }

    // **********************  GUI setup ********************************

    private void setupGui()
    {
        original = new JTextArea(10, 30);
        original.setLineWrap(true);
        original.setWrapStyleWord(true);
        JScrollPane originalPane = new JScrollPane(original,
            ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        translation = new JTextArea(10, 30);
        translation.setEditable(false);
        //    translate.setBackground(Color.LIGHT_GRAY);
        translation.setBackground(new Color(240, 248, 255));
        translation.setLineWrap(true);
        translation.setWrapStyleWord(true);
        JScrollPane markedPane = new JScrollPane(translation,
            ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        go = new JButton("Refresh");
        go.setAlignmentX(Component.CENTER_ALIGNMENT);
        go.addActionListener(this);

        Box box1 = Box.createVerticalBox();
        box1.add(Box.createVerticalStrut(10));
        box1.add(originalPane);
        box1.add(Box.createVerticalStrut(10));
        box1.add(markedPane);
        box1.add(Box.createVerticalStrut(10));
        box1.add(go);

        Container c = getContentPane();
        c.setLayout (new FlowLayout());
        c.add(box1);
    }

    public static void main(String[] args)
    {
        Piglatinator window = new Piglatinator();
        window.setBounds(100, 100, 480, 480);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
