package challenge030;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Note extends JFrame implements ActionListener {
    private TextArea textArea;
    private JFileChooser FileChooser;
    private JMenuBar menuBar = new JMenuBar();
    private JMenu file, edit, font, background;
    private JMenuItem neew, open, save, saveas, copy, paste, clear, exit, print, printpreview;

    public Note() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Note");
        setLocation(500, 180);
        setSize(600, 520);
        setResizable(false);

        file = new JMenu("File");
        menuBar.add(file);

        file = new JMenu("New");
        menuBar.add(neew);

        file = new JMenu("Open");
        menuBar.add(open);

        file = new JMenu("Save");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
