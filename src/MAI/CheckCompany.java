package MAI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CheckCompany {

	static ArrayList<String> names,checkchar,renames = new ArrayList<String>();
	static String join,join2;
	static char checkspace = ' ';
	static int skip=0,count = 0, i = 0, nextrow = 0, hasSym = 0, pass=0;
	static int countCo = 0, countCoall = 0;
	static ArrayList<Integer> NumCo;
	static String allnameCo="",allnameCo1="",allnameCo2="",allnameCo3="",allnameCo4="",allnameCo5="",allnameCo6="",allnameCo7="",allnameCo8="",allnameCo9="",allnameCo10="",allnameCo11="",allnameCo12="",allnameCo13="",allnameCo14="",allnameCo15="",allnameCo16="",allnameCo17="",allnameCo18="",allnameCo19="",allnameCo20="",allnameCo21="",allnameCo22="",allnameCo23="",allnameCo24="",allnameCo25="",allnameCo26="",allnameCo27="",allnameCo28="",allnameCo29="";
	static String allTitleCo1="",allTitleCo2="",allTitleCo3="",allTitleCo4="",allTitleCo5="",allTitleCo6="",allTitleCo7="",allTitleCo8="",allTitleCo9="",allTitleCo10="",allTitleCo11="",allTitleCo12="",allTitleCo13="",allTitleCo14="",allTitleCo15="",allTitleCo16="",allTitleCo17="",allTitleCo18="",allTitleCo19="",allTitleCo20="",allTitleCo21="",allTitleCo22="",allTitleCo23="",allTitleCo24="",allTitleCo25="",allTitleCo26="",allTitleCo27="",allTitleCo28="",allTitleCo29="";
	static String DataTime="";
	static String checkSym = "a b c d e f g h i j k l m n o r p s q u v w x y z";
	
	
	static String All="", Company = "หลักทรัพย์", blank = "-";
	
	public static void start(){
		addChar();
		NumCo = new ArrayList<Integer>();
		try {
			
			Document doc = Jsoup.connect("https://marketdata.set.or.th/mkt/sectorquotation.do?sector=mai&language=th&country=TH").userAgent("mozilla/17.0").get();
			Elements temp = doc.select("table.table-info");
			
			for(Element ele:temp){
				
				System.out.println(" "+ ele.getAllElements().first().text() );

				names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));
				
				skip++;
				if(skip == 2){
					
				}
				else{
					i++;
				}
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
							
							
								if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo3 += "- ";
									break;
								}
								
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
								if (hasSym == 11){
									
								}
								else if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo5 += "- ";
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
								
								if(!names.get(j+1).toLowerCase().contains(checkchar.get(check).toLowerCase()) && nextrow == 1){
									allnameCo6 += "- ";
									break;
								}
								
							}
						}
						if(nextrow >= 11){
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
					hasSym = 0;
					for(int j = 15 ; j < names.size(); j++){
						allnameCo8 += names.get(j)+ " ";
						nextrow++;
						if(j<names.size()-1){
							
							for(int check = 0 ; check < checkchar.size(); check++ ){
							
								if(hasSym ==1 ){
									
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
	
	
	public static void show(){
		System.out.println(DataTime);
		System.out.println();
		System.out.println(allTitleCo1);
		System.out.println(allnameCo1);
		
		System.out.println("เกษตรและอุตสาหกรรมอาหาร >> ธุรกิจการเกษตร");
		System.out.println(allTitleCo2);
		System.out.println(allnameCo2);
		
		
		System.out.println("เกษตรและอุตสาหกรรมอาหาร >> อาหารและเครื่องดื่ม");
		System.out.println(allnameCo3);
		
	}
	
	public static void main(String[] args){
		start();
		show();
	}
}
