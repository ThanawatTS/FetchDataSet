package MAI;

import java.awt.BorderLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CheckCompany extends JFrame{
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
	
	
	public CheckCompany(){
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

	
	public static void start(){
		addChar();
		NumCo = new ArrayList<Integer>();
		try {
			
			Document doc = Jsoup.connect("https://marketdata.set.or.th/mkt/sectorquotation.do?sector=mai&language=th&country=TH").userAgent("mozilla/17.0").get();
			Elements temp = doc.select("table.table-info");
			
			for(Element ele:temp){
				
				//System.out.println(" "+ ele.getAllElements().first().text() );

				names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));
				
				i++;
				
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
					
					
					countCo=0;
					break;
				case 3:
					hasSym=0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo3 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
							
							
								if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo3 += "- ";
									break;
								}
								
							}
						}
						
						if(nextrow >= 11){
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
								
								if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo4 += "- ";
									break;
								}
								
							}
						}
						
						 if(nextrow >= 11){
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
								if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo5 += "- ";
									break;
								}
								
							}
						}
						
						
						if(nextrow >= 11){
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
								if(hasSym == 11){
									
								}
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo6 += "- ";
									break;
								}
								
							}
						}
						if(hasSym == 11){
							if(nextrow == 14){
								nextrow = 0;
								allnameCo5 += "\n";
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
					hasSym =0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo7 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
								if(hasSym == 1){
									
								}
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo7 += "- ";
									break;
								}
								
							}
						}
						if(hasSym == 1){
							if(nextrow == 14){
								nextrow = 0;
								allnameCo7 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(nextrow == 11){
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
					hasSym = 0;
					
					for(int j = 15 ; j < names.size(); j++){
						allnameCo8 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
							
								if(hasSym == 1 ){
									
								}
								
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo8 += "- ";
									break;
								}
								
							}
						}
						if(hasSym == 1){
							if(nextrow == 14){
								nextrow = 0;
								allnameCo8 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(nextrow == 11){
							allnameCo8 += "\n";
							nextrow = 0;
							countCo++;
							hasSym++;
						}
					}
					NumCo.add(countCo);
					countCoall += countCo;
					countCo=0;
					break;
					
				case 9:
					hasSym = 0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo9 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
							
								if(hasSym == 0 || hasSym == 7){
									
								}
							
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo9 += "- ";
									break;
								}
								
							}
						}
						if(hasSym == 0 || hasSym == 7){
							if(nextrow == 13){
								nextrow = 0;
								allnameCo9 += "\n";
								hasSym++;
								countCo++;
							}
						}
						else if(nextrow == 11){
							allnameCo9 += "\n";
							nextrow = 0;
							countCo++;
							hasSym++;
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
								if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo10 += "- ";
									break;
								}
								
							}
						}
						
						
						if(nextrow >= 11){
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

			}	
			}
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public static void addChar(){
		checkchar = new ArrayList<>(Arrays.asList(checkSym.split(" ")));
	}
	
	
	public static void Show(){
		System.out.println(DataTime);
		System.out.println();
		System.out.println(allTitleCo1);
		System.out.println(allnameCo1);
		All += "จำนวนหลักทรัพย์ทั้งหมดในประเทศไทย(อัพเดท)"+"\n";
		All += "-----------------------"+"\n";
		System.out.println("เกษตรและอุตสาหกรรมอาหาร");
		System.out.println(allnameCo3);
		All += "เกษตรและอุตสาหกรรมอาหาร: " +NumCo.get(0); 
		
		System.out.println("สินค้าอุปโภคบริโภค");
		System.out.println(allnameCo4);
		All += "\n สินค้าอุปโภคบริโภค: " + NumCo.get(1);
		
		System.out.println("ธุรกิจการเงิน");
		System.out.println(allnameCo5);
		All += "\n ธุรกิจการเงิน: "+ NumCo.get(2);
		
		System.out.println("สินค้าอุตสาหกรรม");
		System.out.println(allnameCo6);
		All += "\n สินค้าอุตสาหกรรม: " + NumCo.get(3);
		
		System.out.println("อสังหาริมทรัพย์และก่อสร้าง");
		System.out.println(allnameCo7);
		All += "\n อสังหาริมทรัพย์และก่อสร้าง: "+ NumCo.get(4);
		
		System.out.println("ทรัพยากร");
		System.out.println(allnameCo8);
		All += "\n ทรัพยากร: "+ NumCo.get(5);
		
		System.out.println("บริการ");
		System.out.println(allnameCo9);
		All += "\n บริการ: " + NumCo.get(6);
		
		System.out.println("เทคโนโลยี");
		System.out.println(allnameCo10);
		All += "\n เทคโนโลยี: "+ NumCo.get(7);
		
		All += "\n ToTal: " + countCoall;
		
		textData.setText(All);
	}
	
	public static void main(String[] args){
		start();

		CheckCompany check = new CheckCompany();
		check.setVisible(true);
		Show();
		
	}
}
