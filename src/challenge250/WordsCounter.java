package challenge250;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.UIManager;
public class WordsCounter {

	private JFrame wordComparer;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordsCounter window = new WordsCounter();
					window.wordComparer.setVisible(true);
				} catch (Exception exc) {
					exc.printStackTrace();
				}
			}
		});
	}

	private WordsCounter() {
		initialize();
	}

	private void initialize() {
		wordComparer = new JFrame();
		wordComparer.setBackground(UIManager.getColor("FileChooser.background"));
		wordComparer.setPreferredSize(new Dimension(700, 480));
		wordComparer.setMinimumSize(new Dimension(780, 560));
		wordComparer.setResizable(false);
		wordComparer.setSize(new Dimension(780, 480));
		wordComparer.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		wordComparer.setTitle("Word Comparer");
		wordComparer.setBounds(100, 100, 450, 300);
		wordComparer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		wordComparer.getContentPane().setLayout(springLayout);
		
		// Labels
		JLabel wordsToCountLabel = new JLabel("WORDS TO COUNT");
		springLayout.putConstraint(SpringLayout.NORTH, wordsToCountLabel, 10, SpringLayout.NORTH, wordComparer.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, wordsToCountLabel, -321, SpringLayout.EAST, wordComparer.getContentPane());
		wordsToCountLabel.setFont(new Font("Ubuntu", Font.BOLD, 15));
		wordComparer.getContentPane().add(wordsToCountLabel);
		
		JLabel wordsInTextLabel = new JLabel("Words in text");
		springLayout.putConstraint(SpringLayout.EAST, wordsInTextLabel, -340, SpringLayout.EAST, wordComparer.getContentPane());
		wordsInTextLabel.setFont(new Font("Ubuntu", Font.BOLD, 15));
		wordComparer.getContentPane().add(wordsInTextLabel);
		
		
		// Field for text/words
		JTextPane wordsPane = new JTextPane();
		springLayout.putConstraint(SpringLayout.SOUTH, wordsPane, 231, SpringLayout.NORTH, wordComparer.getContentPane());
		wordsPane.setFont(new Font("Ubuntu Mono", Font.PLAIN, 18));
		springLayout.putConstraint(SpringLayout.NORTH, wordsPane, 51, SpringLayout.NORTH, wordComparer.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, wordsPane, 50, SpringLayout.WEST, wordComparer.getContentPane());
		wordsPane.setPreferredSize(new Dimension(680, 140));
		wordsPane.setMinimumSize(new Dimension(380, 240));
		wordsPane.setMaximumSize(new Dimension(380, 240));
		wordsPane.setSize(new Dimension(380, 240));
		wordComparer.getContentPane().add(wordsPane);
		
		
		// field for counter
		JTextPane numberOfWordsPane = new JTextPane();
		springLayout.putConstraint(SpringLayout.NORTH, numberOfWordsPane, 317, SpringLayout.NORTH, wordComparer.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, numberOfWordsPane, -168, SpringLayout.SOUTH, wordComparer.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, wordsInTextLabel, -19, SpringLayout.NORTH, numberOfWordsPane);
		springLayout.putConstraint(SpringLayout.EAST, numberOfWordsPane, -246, SpringLayout.EAST, wordComparer.getContentPane());
		numberOfWordsPane.setSize(new Dimension(380, 240));
		numberOfWordsPane.setPreferredSize(new Dimension(280, 38));
		numberOfWordsPane.setMinimumSize(new Dimension(380, 240));
		numberOfWordsPane.setMaximumSize(new Dimension(380, 240));
		numberOfWordsPane.setFont(new Font("Ubuntu Mono", Font.PLAIN, 18));
		wordComparer.getContentPane().add(numberOfWordsPane);
		
		
		// Counts words from bigger field and print them on smaller field
		JButton buttonCount = new JButton("COUNT");
		buttonCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String getWords = wordsPane.getText();
				int i, counter = 0;
				
				if(!(" ".equals(getWords.substring(0, 1))) || !(" ".equals(getWords.substring(getWords.length())))) {
					for(i = 0; i < getWords.length(); i++) {
						if(getWords.charAt(i) == ' ') {
							counter++;
						}
					}
					
					numberOfWordsPane.setText(" " + counter);
				}
				
			}
		});
		
		springLayout.putConstraint(SpringLayout.NORTH, buttonCount, 25, SpringLayout.SOUTH, numberOfWordsPane);
		springLayout.putConstraint(SpringLayout.WEST, buttonCount, 0, SpringLayout.WEST, numberOfWordsPane);
		springLayout.putConstraint(SpringLayout.SOUTH, buttonCount, -97, SpringLayout.SOUTH, wordComparer.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, buttonCount, -406, SpringLayout.EAST, wordComparer.getContentPane());
		wordComparer.getContentPane().add(buttonCount);
		
		
		// Clear fields
		JButton buttonClear = new JButton("CLEAR");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				wordsPane.setText("");
				numberOfWordsPane.setText("");
			}
		});
		
		springLayout.putConstraint(SpringLayout.NORTH, buttonClear, 0, SpringLayout.NORTH, buttonCount);
		springLayout.putConstraint(SpringLayout.WEST, buttonClear, 40, SpringLayout.EAST, buttonCount);
		springLayout.putConstraint(SpringLayout.SOUTH, buttonClear, 0, SpringLayout.SOUTH, buttonCount);
		springLayout.putConstraint(SpringLayout.EAST, buttonClear, 0, SpringLayout.EAST, numberOfWordsPane);
		wordComparer.getContentPane().add(buttonClear);
	}
}
