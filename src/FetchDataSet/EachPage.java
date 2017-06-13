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
	
	static int count = 0;
	static ArrayList<String> names;
	
	private static void start(){
		
		try {
			Document doc = Jsoup.connect("https://www.set.or.th/set/companyhighlight.do?symbol=CHOTI&ssoPageId=5&language=th&country=TH").userAgent("mozilla/17.0").get();
			Elements temp = doc.select("table.table-info");
			
			for(Element ele:temp){
				
				System.out.println(count+ " "+ ele.getAllElements().first().text() );
				
				names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	private static void checkString(){
		System.out.println();
		System.out.println();
		for(int i = 0 ; i < names.size(); i++){
			if(names.get(i).equals("รายได้รวม")){
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
			
			else if (names.get(i).equals("กำไรสุทธิ")){
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
	
	public static void main(String[] args){
		start();
		checkString();
	}
}
