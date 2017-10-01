package challenge050;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class NotepadUI extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JFileChooser FileChooser;
    private JMenuBar menuBar = new JMenuBar();
    private JMenu file, edit, font, background;
    private JMenuItem neew, open, save, saveas, copy, paste, clear, exit, print, printpreview;

    public NotepadUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Note");
        setLocation(500, 180);
        setSize(600, 520);
        setResizable(false);

//        file = new JMenu("File");
//        menuBar.add(file);
//
//        file = new JMenu("New");
//        menuBar.add(neew);
//        neew.addActionListener(this);
//
//        file = new JMenu("Open");
//        menuBar.add(open);
//A
//        file = new JMenu("Save");
//        menuBar.add(save);
//
//        file = new JMenu("Save as");
//        menuBar.add(saveas);

    }

    private void CreateMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        // ImageIcon imageIcon = new ImageIcon();

        JMenu menuFile = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == neew) {
            int nuask = JOptionPane.showConfirmDialog(NotepadUI.this, "Are you sure? This will make erase any unsaved documents");
            if(nuask == JOptionPane.YES_NO_OPTION) { textArea.setText(""); }
        }
    }
}
