package FetchDataSet;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Test extends JFrame {
	
	static ArrayList<String> names,checkchar,renames = new ArrayList<String>();
	static String join,join2;
	static char checkspace = ' ';
	static int count = 0, i = 0, nextrow = 0, hasSym = 0, pass=0;
	static int countCo = 0, countCoall = 0;
	static ArrayList<Integer> NumCo;
	static String allnameCo="",allnameCo1="",allnameCo2="",allnameCo3="",allnameCo4="",allnameCo5="",allnameCo6="",allnameCo7="",allnameCo8="",allnameCo9="",allnameCo10="",allnameCo11="",allnameCo12="",allnameCo13="",allnameCo14="",allnameCo15="",allnameCo16="",allnameCo17="",allnameCo18="",allnameCo19="",allnameCo20="",allnameCo21="",allnameCo22="",allnameCo23="",allnameCo24="",allnameCo25="",allnameCo26="",allnameCo27="",allnameCo28="",allnameCo29="",All ="";
	static String allTitleCo1="",allTitleCo2="",allTitleCo3="",allTitleCo4="",allTitleCo5="",allTitleCo6="",allTitleCo7="",allTitleCo8="",allTitleCo9="",allTitleCo10="",allTitleCo11="",allTitleCo12="",allTitleCo13="",allTitleCo14="",allTitleCo15="",allTitleCo16="",allTitleCo17="",allTitleCo18="",allTitleCo19="",allTitleCo20="",allTitleCo21="",allTitleCo22="",allTitleCo23="",allTitleCo24="",allTitleCo25="",allTitleCo26="",allTitleCo27="",allTitleCo28="",allTitleCo29="";
	static String DataTime="";
	static String checkSym = "a b c d e f g h i j k l m n o r p s q u v w x y z";
	private JPanel main;
	private static JTextPane textData;
	private JScrollPane slide,slideRight;
	private JScrollBar bar,barHo;
	String Test= "";
	
	public Test(){
		iniCompo();
		
		setBounds(100,100,1100,510);
		pack();
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
		
		bar = new JScrollBar(JScrollBar.VERTICAL, 30, 40, 0, 500);
		barHo =new JScrollBar(JScrollBar.HORIZONTAL, 30, 20, 0, 500);
		
		class MyAdjustmentListener implements AdjustmentListener {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                repaint();
            }
        }
		
		bar.addAdjustmentListener(new MyAdjustmentListener());
		barHo.addAdjustmentListener(new MyAdjustmentListener());
		
		
		add(bar,BorderLayout.EAST);
		add(barHo,BorderLayout.SOUTH);
		
		
	}


	public static void addChar(){
		checkchar = new ArrayList<>(Arrays.asList(checkSym.split(" ")));
	}
	
	public static void Start(){
		addChar();
		NumCo = new ArrayList<Integer>();
		
		
		try {
			Document doc = Jsoup.connect("https://marketdata.set.or.th/mkt/commonstocklistresult.do?market=SET&type=S").userAgent("mozilla/17.0").get();
			Elements temp = doc.select("table.table-info");
			
			
			for(Element ele:temp){
				i++;
				//System.out.println(i+ " "+ ele.getAllElements().first().text() );
				
				names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));
			
				switch (i){
				case 1:
					for(int k = 4 ; k < 7; k++){
						DataTime += names.get(k)+ " ";
					}
					for(int L = 7 ; L < 18 ; L++){
						allTitleCo1 += names.get(L)+ " ";
					}
					for(int j = 18 ; j < names.size(); j++){
						allnameCo1 += names.get(j)+ " ";
						
					}
					break;
				case 2:
					hasSym=0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo2 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
							
								if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo2 += "- ";
									break;
								}
								
							}
						}
						if(nextrow == 11){
							allnameCo2 += "\n";
							nextrow = 0;
							countCo++;
						}
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
				case 3:
					hasSym=0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo3 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
							
								if(hasSym == 3){
									
								}
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo3 += "- ";
									break;
								}
								
							}
						}
						if(hasSym == 3){
							if(nextrow == 12){
								nextrow = 0;
								allnameCo3 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(nextrow >= 11){
							allnameCo3 += "\n";
							nextrow = 0;
							hasSym++;
							countCo++;
						}
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
				case 4:
					hasSym=0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo4 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
								if (hasSym == 18){
									
								}
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo4 += "- ";
									break;
								}
								
							}
						}
						
						if(hasSym == 18){
							if(nextrow == 13){
								nextrow = 0;
								allnameCo4 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(nextrow >= 11){
							allnameCo4 += "\n";
							hasSym++;
							nextrow = 0;
							countCo++;
						}
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 5:
					hasSym=0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo5 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
								if (hasSym == 1){
									
								}
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo5 += "- ";
									break;
								}
								
							}
						}
						
						if(hasSym == 1){
							if(nextrow == 12){
								nextrow = 0;
								allnameCo5 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(nextrow >= 11){
							allnameCo5 += "\n";
							hasSym++;
							nextrow = 0;
							countCo++;
						}
						
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
				case 6:
					hasSym=0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo6 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
								
								if(hasSym == 3){
									if(nextrow == 3){
										allnameCo6 += "- ";
										break;
									}
								}
								else if (hasSym == 4){
									
								}
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo6 += "- ";
									break;
								}
								
							}
						}
						if(hasSym == 3){
							if(nextrow == 13){
								nextrow = 0;
								allnameCo6 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(hasSym == 4){
							if(nextrow == 13){
								nextrow = 0;
								allnameCo6 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(nextrow >= 11){
							allnameCo6 += "\n";
							hasSym++;
							nextrow = 0;
							countCo++;
						}
						
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 7:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo7 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
							
								if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo7 += "- ";
									break;
								}
								
							}
						}
						if(nextrow == 11){
							allnameCo7 += "\n";
							nextrow = 0;
							countCo++;
						}
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 8:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo8 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
							
								if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo8 += "- ";
									break;
								}
								
							}
						}
						if(nextrow == 11){
							allnameCo8 += "\n";
							nextrow = 0;
							countCo++;
						}
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 9:
					hasSym=0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo9 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
								
								if(hasSym == 3){
									
								}
								
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo9 += "- ";
									break;
								}
								
							}
						}
						if(hasSym == 3){
							if(nextrow == 13){
								nextrow = 0;
								allnameCo9 += "\n";
								hasSym++;
								countCo++;
							}
						}
						
						else if(nextrow >= 11){
							allnameCo9 += "\n";
							hasSym++;
							nextrow = 0;
							countCo++;
						}
						
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 10:
					hasSym=0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo10 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
								
								if(hasSym == 1){
									
								}
								else if (hasSym == 17){
									
								}
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo10 += "- ";
									break;
								}
								
							}
						}
						if(hasSym == 1){
							if(nextrow == 12){
								nextrow = 0;
								allnameCo10 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(hasSym == 17){
							if(nextrow == 14){
								nextrow = 0;
								allnameCo10 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(nextrow >= 11){
							allnameCo10 += "\n";
							hasSym++;
							nextrow = 0;
							countCo++;
						}
						
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 11:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo11 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
							
								if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo11 += "- ";
									break;
								}
								
							}
						}
						if(nextrow == 11){
							allnameCo11 += "\n";
							nextrow = 0;
							countCo++;
						}
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 12:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo12 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
							
								if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo12 += "- ";
									break;
								}
								
							}
						}
						if(nextrow == 11){
							allnameCo12 += "\n";
							nextrow = 0;
							countCo++;
						}
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 13:
					hasSym=0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo13 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
								
								
								if (hasSym == 14){
									
								}
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo13 += "- ";
									break;
								}
								
							}
						}
						
						if(hasSym == 14){
							if(nextrow == 13){
								nextrow = 0;
								allnameCo13 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(nextrow >= 11){
							allnameCo13 += "\n";
							hasSym++;
							nextrow = 0;
							countCo++;
						}
						
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 14:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo14 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
							
								if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo14 += "- ";
									break;
								}
								
							}
						}
						if(nextrow == 11){
							allnameCo14 += "\n";
							nextrow = 0;
							countCo++;
						}
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 15:
					hasSym=0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo15 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
								
								if(hasSym == 14){
									
								}
								else if (hasSym == 17){
									
								}
								else if (hasSym == 24){
									
								}
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo15 += "- ";
									break;
								}
								
							}
						}
						if(hasSym == 14){
							if(nextrow == 13){
								nextrow = 0;
								allnameCo15 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(hasSym == 17){
							if(nextrow == 14){
								nextrow = 0;
								allnameCo15 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(hasSym == 24){
							if(nextrow == 14){
								nextrow = 0;
								allnameCo15 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(nextrow >= 11){
							allnameCo15 += "\n";
							hasSym++;
							nextrow = 0;
							countCo++;
						}
						
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 16:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo16 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
							
								if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo16 += "- ";
									break;
								}
								
							}
						}
						if(nextrow == 11){
							allnameCo16 += "\n";
							nextrow = 0;
							countCo++;
						}
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 17:
					hasSym=0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo17 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
								
								if(hasSym == 6){
									
								}
								else if (hasSym == 17){
									
								}
								else if (hasSym == 33){
									
								}
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo17 += "- ";
									break;
								}
								
							}
						}
						if(hasSym == 6){
							if(nextrow == 13){
								nextrow = 0;
								allnameCo17 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(hasSym == 17){
							if(nextrow == 13){
								nextrow = 0;
								allnameCo17 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(hasSym == 33){
							if(nextrow == 13){
								nextrow = 0;
								allnameCo17 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(nextrow >= 11){
							allnameCo17 += "\n";
							hasSym++;
							nextrow = 0;
							countCo++;
						}
						
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 18:
					hasSym=0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo18 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
								
							
								if (hasSym == 36){
									
								}
								else if (hasSym == 52){
									
								}
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo18 += "- ";
									break;
								}
								
							}
						}
						
						if(hasSym == 36){
							if(nextrow == 12){
								nextrow = 0;
								allnameCo18 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(hasSym == 52){
							if(nextrow == 12){
								nextrow = 0;
								allnameCo18 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(nextrow >= 11){
							allnameCo18 += "\n";
							hasSym++;
							nextrow = 0;
							countCo++;
						}
						
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 19:
					hasSym=0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo19 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
								
								if(hasSym == 6){
									
								}
								
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo19 += "- ";
									break;
								}
								
							}
						}
						if(hasSym == 6){
							if(nextrow == 14){
								nextrow = 0;
								allnameCo19 += "\n";
								hasSym++;
								countCo++;
							}
						}
						
						else if(nextrow >= 11){
							allnameCo19 += "\n";
							hasSym++;
							nextrow = 0;
							countCo++;
						}
						
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 20:
					hasSym=0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo20 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
								
								if(hasSym == 1){
									
								}
								else if (hasSym == 6){
									
								}
								else if (hasSym == 19){
									
								}
								else if (hasSym == 20){
									
								}
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo20 += "- ";
									break;
								}
								
							}
						}
						if(hasSym == 1){
							if(nextrow == 14){
								nextrow = 0;
								allnameCo20 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(hasSym == 6){
							if(nextrow == 12){
								nextrow = 0;
								allnameCo20 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(hasSym == 19){
							if(nextrow == 13){
								nextrow = 0;
								allnameCo20 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(hasSym == 20){
							if(nextrow == 13){
								nextrow = 0;
								allnameCo20 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(nextrow >= 11){
							allnameCo20 += "\n";
							hasSym++;
							nextrow = 0;
							countCo++;
						}
						
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 21:
					hasSym=0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo21 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
								
								if(hasSym == 1){
									
								}
								
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo21 += "- ";
									break;
								}
								
							}
						}
						if(hasSym == 1){
							if(nextrow == 13){
								nextrow = 0;
								allnameCo21 += "\n";
								hasSym++;
								countCo++;
							}
						}
						
						else if(nextrow >= 11){
							allnameCo21 += "\n";
							hasSym++;
							nextrow = 0;
							countCo++;
						}
						
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 22:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo22 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
							
								if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo22 += "- ";
									break;
								}
								
							}
						}
						if(nextrow == 11){
							allnameCo22 += "\n";
							nextrow = 0;
							countCo++;
						}
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 23:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo23 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
							
								if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo23 += "- ";
									break;
								}
								
							}
						}
						if(nextrow == 11){
							allnameCo23 += "\n";
							nextrow = 0;
							countCo++;
						}
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 24:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo24 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
							
								if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo24 += "- ";
									break;
								}
								
							}
						}
						if(nextrow == 11){
							allnameCo24 += "\n";
							nextrow = 0;
							countCo++;
						}
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 25:
					hasSym=0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo25 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
								
								if(hasSym == 2){
									
								}
								
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo25 += "- ";
									break;
								}
								
							}
						}
						if(hasSym == 2){
							if(nextrow == 13){
								nextrow = 0;
								allnameCo25 += "\n";
								hasSym++;
								countCo++;
							}
						}
						
						else if(nextrow >= 11){
							allnameCo25 += "\n";
							hasSym++;
							nextrow = 0;
							countCo++;
						}
						
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 26:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo26 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
							
								if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo26 += "- ";
									break;
								}
								
							}
						}
						if(nextrow == 11){
							allnameCo26 += "\n";
							nextrow = 0;
							countCo++;
						}
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 27:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo27 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
							
								if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo27 += "- ";
									break;
								}
								
							}
						}
						if(nextrow == 11){
							allnameCo27 += "\n";
							nextrow = 0;
							countCo++;
						}
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 28:
					hasSym=0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo28 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
								
								if(hasSym == 3){
									
								}
								
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo28 += "- ";
									break;
								}
								
							}
						}
						if(hasSym == 3){
							if(nextrow == 12){
								nextrow = 0;
								allnameCo28 += "\n";
								hasSym++;
								countCo++;
							}
						}
						
						else if(nextrow >= 11){
							allnameCo28 += "\n";
							hasSym++;
							nextrow = 0;
							countCo++;
						}
						
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 29:
					hasSym=0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo29 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
								
								if(hasSym == 3){
									
								}
								
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo29 += "- ";
									break;
								}
								
							}
						}
						if(hasSym == 3){
							if(nextrow == 14){
								nextrow = 0;
								allnameCo29 += "\n";
								hasSym++;
								countCo++;
							}
						}
						
						else if(nextrow >= 11){
							allnameCo29 += "\n";
							hasSym++;
							nextrow = 0;
							countCo++;
						}
						
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
				
					
				}
			}
	
			
				join = String.join(" ", names.get(10),names.get(11));
				join2 = String.join(" ",names.get(12),names.get(13), names.get(14));
			
			
			for(int re = 0 ; re <10 ; re++){
				renames.add(names.get(re));
			}
			renames.add(join);
			renames.add(join2);
			
			
			for(int allname = renames.size() ; allname < names.size() ; allname++){
			
				if(allname > 14)
				allnameCo += names.get(allname)+ " ";			
			}
			
			
			
			
			
			System.out.println("");
			System.out.println("------------");
			System.out.println("");
			System.out.println("------------");
			System.out.println("");
			System.out.println("------------");
			
			
			for(int j = 0 ; j < allnameCo.length(); j++){
				if(allnameCo.charAt(j)!= checkspace){
					count = 0;
				}
				else if(allnameCo.charAt(j) == checkspace){
					count++;
					allnameCo = allnameCo.substring(0,j)+' '+allnameCo.substring(j+1);
				}
	
				
			}
			System.out.println(DataTime);
			System.out.println();
			System.out.println(allTitleCo1);
			System.out.println(allnameCo1);
			
			System.out.println("�ɵ�����ص��ˡ�������� >> ��áԨ����ɵ�");
			System.out.println(allTitleCo2);
			System.out.println(allnameCo2);
			
			
			System.out.println("�ɵ�����ص��ˡ�������� >> ������������ͧ����");
			System.out.println(allnameCo3);
			
			System.out.println("�Թ����ػ��������� >> Ὺ��");
			System.out.println(allnameCo4);
			
			System.out.println("�Թ����ػ��������� >> �ͧ��㹤������͹����ӹѡ�ҹ");
			System.out.println(allnameCo5);
			
			System.out.println("�Թ����ػ��������� >> �ͧ����ǹ�������Ǫ�ѳ��");
			System.out.println(allnameCo6);
			
			System.out.println("��áԨ����Թ >> ��Ҥ��");
			System.out.println(allnameCo7);
			
			System.out.println("��áԨ����Թ >> �Թ�ع�����ѡ��Ѿ��");
			System.out.println(allnameCo8);
			
			System.out.println("��áԨ����Թ >> ��Сѹ�����л�Сѹ���Ե");
			System.out.println(allnameCo9);
			
			System.out.println("�Թ����ص��ˡ��� >> �ҹ¹��");
			System.out.println(allnameCo10);
			
			System.out.println("�Թ����ص��ˡ��� >> ��ʴ��ص��ˡ����������ͧ�ѡ�");
			System.out.println(allnameCo11);
			
			System.out.println("�Թ����ص��ˡ��� >> ��д�������ʴء�þ����");
			System.out.println(allnameCo12);
			
			System.out.println("�Թ����ص��ˡ��� >> ��������������ѳ��");
			System.out.println(allnameCo13);
			
			System.out.println("�Թ����ص��ˡ��� >> ��è��ѳ��");
			System.out.println(allnameCo14);
			
			System.out.println("�Թ����ص��ˡ��� >> ����");
			System.out.println(allnameCo15);
			
			System.out.println("��ѧ�������Ѿ����С�����ҧ >> ��ʴء�����ҧ");
			System.out.println(allnameCo16);
			
			System.out.println("��ѧ�������Ѿ����С�����ҧ >> �Ѳ����ѧ�������Ѿ��");
			System.out.println(allnameCo17);
			
			System.out.println("��ѧ�������Ѿ����С�����ҧ >> �ͧ�ع�����ѧ�������Ѿ����Сͧ���ʵ����͡��ŧ�ع���ѧ�������Ѿ��");
			System.out.println(allnameCo18);
			
			System.out.println("��ѧ�������Ѿ����С�����ҧ >> ��ԡ���Ѻ���ҡ�����ҧ");
			System.out.println(allnameCo19);
			
			System.out.println("��Ѿ�ҡ� >> ��ѧ�ҹ����Ҹ�óٻ���");
			System.out.println(allnameCo20);
			
			System.out.println("��Ѿ�ҡ� >> ����ͧ���");
			System.out.println(allnameCo21);
			
			System.out.println("��ԡ�� >> �ҳԪ��");
			System.out.println(allnameCo22);
			
			System.out.println("��ԡ�� >> ���ᾷ��");
			System.out.println(allnameCo23);
			
			System.out.println("��ԡ�� >> ���������觾����");
			System.out.println(allnameCo24);
			
			System.out.println("��ԡ�� >> ��ԡ��੾�СԨ");
			System.out.println(allnameCo25);
			
			System.out.println("��ԡ�� >> ��÷�ͧ���������ѹ��ҡ��");
			System.out.println(allnameCo26);
			
			System.out.println("��ԡ�� >> ��������Ũ�ʵԡ��");
			System.out.println(allnameCo27);
			
			System.out.println("෤����� >> �����ǹ����硷�͹ԡ��");
			System.out.println(allnameCo28);
			
			System.out.println("෤����� >> ෤��������ʹ����С���������");
			System.out.println(allnameCo29);
			
			
			All = DataTime+"\n \n";
			
			System.out.println();
			System.out.println("�ӹǹ��ѡ��Ѿ�������㹻������(�Ѿഷ)");
			All += "�ӹǹ��ѡ��Ѿ�������㹻������(�Ѿഷ)"+"\n";
			System.out.println("-----------------------");
			All += "-----------------------"+"\n";
			System.out.println("�ɵ�����ص��ˡ�������� >> ��áԨ����ɵ�: "+NumCo.get(0));
			All += "�ɵ�����ص��ˡ�������� >> ��áԨ����ɵ�: "+NumCo.get(0)+"\n";
			
			System.out.println("�ɵ�����ص��ˡ�������� >> ������������ͧ����: "+NumCo.get(1));
			All += "�ɵ�����ص��ˡ�������� >> ������������ͧ����: "+NumCo.get(1)+"\n";
			
			System.out.println("�Թ����ػ��������� >> Ὺ��: "+NumCo.get(2));
			All += "�Թ����ػ��������� >> Ὺ��: "+NumCo.get(2)+"\n";
			
			System.out.println("�Թ����ػ��������� >> �ͧ��㹤������͹����ӹѡ�ҹ: "+NumCo.get(3));
			All += "�Թ����ػ��������� >> �ͧ��㹤������͹����ӹѡ�ҹ: "+NumCo.get(3)+"\n";
			
			System.out.println("�Թ����ػ��������� >> �ͧ����ǹ�������Ǫ�ѳ��: "+NumCo.get(4));
			All += "�Թ����ػ��������� >> �ͧ����ǹ�������Ǫ�ѳ��: "+NumCo.get(4)+"\n";
			
			System.out.println("��áԨ����Թ >> ��Ҥ��: "+NumCo.get(5));
			All += "��áԨ����Թ >> ��Ҥ��: "+NumCo.get(5)+"\n";
			
			System.out.println("��áԨ����Թ >> �Թ�ع�����ѡ��Ѿ��: "+NumCo.get(6));
			All += "��áԨ����Թ >> �Թ�ع�����ѡ��Ѿ��: "+NumCo.get(6)+"\n";
			
			System.out.println("��áԨ����Թ >> ��Сѹ�����л�Сѹ���Ե: "+NumCo.get(7));
			All += "��áԨ����Թ >> ��Сѹ�����л�Сѹ���Ե: "+NumCo.get(7)+"\n";
			
			System.out.println("�Թ����ص��ˡ��� >> �ҹ¹��: "+NumCo.get(8));
			All += "�Թ����ص��ˡ��� >> �ҹ¹��: "+NumCo.get(8)+"\n";
			
			System.out.println("�Թ����ص��ˡ��� >> ��ʴ��ص��ˡ����������ͧ�ѡ�: "+NumCo.get(9));
			All += "�Թ����ص��ˡ��� >> ��ʴ��ص��ˡ����������ͧ�ѡ�: "+NumCo.get(9)+"\n";
			
			System.out.println("�Թ����ص��ˡ��� >> ��д�������ʴء�þ����: "+NumCo.get(10));
			All += "�Թ����ص��ˡ��� >> ��д�������ʴء�þ����: "+NumCo.get(10)+"\n";
			
			System.out.println("�Թ����ص��ˡ��� >> ��������������ѳ��: "+NumCo.get(11));
			All += "�Թ����ص��ˡ��� >> ��������������ѳ��: "+NumCo.get(11)+"\n";
			
			System.out.println("�Թ����ص��ˡ��� >> ��è��ѳ��: "+NumCo.get(12));
			All += "�Թ����ص��ˡ��� >> ��è��ѳ��: "+NumCo.get(12)+"\n";
			
			System.out.println("�Թ����ص��ˡ��� >> ����: "+NumCo.get(13));
			All += "�Թ����ص��ˡ��� >> ����: "+NumCo.get(13)+"\n";
			
			System.out.println("��ѧ�������Ѿ����С�����ҧ >> ��ʴء�����ҧ: "+NumCo.get(14));
			All += "��ѧ�������Ѿ����С�����ҧ >> ��ʴء�����ҧ: "+NumCo.get(14)+"\n";
			
			System.out.println("��ѧ�������Ѿ����С�����ҧ >> �Ѳ����ѧ�������Ѿ��: "+NumCo.get(15));
			All += "��ѧ�������Ѿ����С�����ҧ >> �Ѳ����ѧ�������Ѿ��: "+NumCo.get(15)+"\n";
			
			System.out.println("��ѧ�������Ѿ����С�����ҧ >> �ͧ�ع�����ѧ�������Ѿ����Сͧ���ʵ����͡��ŧ�ع���ѧ�������Ѿ��: "+NumCo.get(16));
			All += "��ѧ�������Ѿ����С�����ҧ >> �ͧ�ع�����ѧ�������Ѿ����Сͧ���ʵ����͡��ŧ�ع���ѧ�������Ѿ��: "+NumCo.get(16)+"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa \n";
			
			System.out.println("��ѧ�������Ѿ����С�����ҧ >> ��ԡ���Ѻ���ҡ�����ҧ: "+NumCo.get(17));
			All += "��ѧ�������Ѿ����С�����ҧ >> ��ԡ���Ѻ���ҡ�����ҧ: "+NumCo.get(17)+"\n";
			
			System.out.println("��Ѿ�ҡ� >> ��ѧ�ҹ����Ҹ�óٻ���: "+ NumCo.get(18));
			All += "��Ѿ�ҡ� >> ��ѧ�ҹ����Ҹ�óٻ���: "+ NumCo.get(18)+"\n";
			
			System.out.println("��Ѿ�ҡ� >> ����ͧ���: "+NumCo.get(19));
			All += "��Ѿ�ҡ� >> ����ͧ���: "+NumCo.get(19)+"\n";
			
			System.out.println("��ԡ�� >> �ҳԪ��: "+ NumCo.get(20));
			All += "��ԡ�� >> �ҳԪ��: "+ NumCo.get(20)+"\n";
			
			System.out.println("��ԡ�� >> ���ᾷ��: "+ NumCo.get(21));
			All += "��ԡ�� >> ���ᾷ��: "+ NumCo.get(21)+"\n";
			
			System.out.println("��ԡ�� >> ���������觾����: "+NumCo.get(22));
			All += "��ԡ�� >> ���������觾����: "+NumCo.get(22)+"\n";
			
			System.out.println("��ԡ�� >> ��ԡ��੾�СԨ: "+NumCo.get(23));
			All += "��ԡ�� >> ��ԡ��੾�СԨ: "+NumCo.get(23)+"\n";
			
			System.out.println("��ԡ�� >> ��÷�ͧ���������ѹ��ҡ��: "+NumCo.get(24));
			All += "��ԡ�� >> ��÷�ͧ���������ѹ��ҡ��: "+NumCo.get(24)+"\n";
			
			System.out.println("��ԡ�� >> ��������Ũ�ʵԡ��: "+ NumCo.get(25));
			All += "��ԡ�� >> ��������Ũ�ʵԡ��: "+ NumCo.get(25)+"\n";
			
			System.out.println("෤����� >> �����ǹ����硷�͹ԡ��: "+NumCo.get(26));
			All += "෤����� >> �����ǹ����硷�͹ԡ��: "+NumCo.get(26)+"\n";
			
			System.out.println("෤����� >> ෤��������ʹ����С���������: "+NumCo.get(27));
			All += "෤����� >> ෤��������ʹ����С���������: "+NumCo.get(27)+"\n";
			
			System.out.println("-----------------------");
			All += "-----------------------"+"\n";
			
			System.out.println("ToTal: "+countCoall);
			All += "ToTal: "+countCoall+"\n";
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void Showdata(){
		
		textData.setText(All);
	}
	
	public static void main(String[] args){
		Start();
		Test test = new Test();
		test.setVisible(true);
		Showdata();
		
	}
	
	
	
}
