package FetchDataSet;

import java.io.IOException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class EachPage {
	
	static int pageNum = 0;
	static int count = 0;
	static String Company = "����ѷ";
	static ArrayList<String> names;
	
	private static void start(){
		
		if(pageNum == 0){
			try {
				Document doc = Jsoup.connect("https://www.set.or.th/set/companyhighlight.do?symbol=CHOTI&ssoPageId=5&language=th&country=TH").userAgent("mozilla/17.0").get();
				Elements temp = doc.select("table.table-info");
				
				
				for(Element ele:temp){
					
					//System.out.println(count+ " "+ ele.getAllElements().first().text() );
					
					names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));
					
					System.out.println();
					System.out.printf("%-45s"+"��������"+" "+names.get(5)+"     "+"��������"+" "+names.get(7)+"     "+"��������"+" "+names.get(9)+"     "+"��������"+" "+names.get(11)+"     "+"�����ط��"+" "+names.get(5)+"     "+"�����ط��"+" "+names.get(7)+"     "+"�����ط��"+" "+names.get(9)+"     "+"�����ط��"+" "+names.get(11),Company);
					
					
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		else if (pageNum == 1){
			
			try {
				Document doc = Jsoup.connect("https://www.set.or.th/set/companyhighlight.do?symbol=CHOTI&ssoPageId=5&language=th&country=TH").userAgent("mozilla/17.0").get();
				Elements temp = doc.select("table.table-info");
				
				System.out.println();
				System.out.println();
				System.out.println("CHOTI");
				for(Element ele:temp){
					
					//System.out.println(count+ " "+ ele.getAllElements().first().text() );
					
					names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
			
		else if(pageNum == 2){
			try {
				Document doc = Jsoup.connect("https://www.set.or.th/set/companyhighlight.do?symbol=EE&ssoPageId=5&language=th&country=TH").userAgent("mozilla/17.0").get();
				Elements temp = doc.select("table.table-info");
				
				System.out.println();
				System.out.println();
				System.out.println("EE");
				for(Element ele:temp){
					
					//System.out.println(count+ " "+ ele.getAllElements().first().text() );
					
					names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	private static void checkString(){
		System.out.println();
		if(pageNum > 0){
			for(int i = 0 ; i < names.size(); i++){
				if(names.get(i).equals("��������")){
					for(int j = i ; j < i+7 ; j++){
						count++;
						if(count == 1){
							System.out.print(names.get(j)+" ");
						}
						else if(count <= 6){
							System.out.print(names.get(j));
						}
						else{
							count = 0;
							System.out.println();
						}
						
					}
					
					
				}
				
				else if (names.get(i).equals("�����ط��")){
					for(int j = i ; j < i+7 ; j++){
						count++;
						if(count == 1){
							System.out.print(names.get(j)+" ");
						}
						else if(count <= 6){
							System.out.print(names.get(j));
						}
						else{
							count = 0;
						}
						
					}
					
				}
				
			}
		}
		
	}
	
	public static void main(String[] args){
		
		for(int i = 0 ; i <= 2 ; i++){
			start();
			checkString();
			pageNum++;
		}
		
	}
}
