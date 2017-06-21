package FetchDataSet;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class GUI extends JFrame{

	private JPanel main;
	private JTextPane textData;
	private JScrollPane slide;
	
	
	public GUI(){
		iniCompo();
		setBounds(100,100,1100,510);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void iniCompo() {
		setLayout(new BorderLayout());
		
		main = new JPanel();
		add(main,BorderLayout.CENTER);
		main.setLayout(null);
		
		
		textData = new JTextPane();
		main.add(textData);
		add(textData);
		
		slide = new JScrollPane(textData);
		main.add(slide);
		add(slide);
		
	}

	public static void main(String[] args){
		GUI gui = new GUI();
		gui.setVisible(true);
		
	}
	
}
