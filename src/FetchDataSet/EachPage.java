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
	static int count = 0, out = 0, follow = 0;
	static String Company = "บริษัท";
	static String blank = "",dat = "-";
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
					System.out.printf("%-45s"+"รายได้รวม"+" "+names.get(5)+"%-10s"+"รายได้รวม"+" "+names.get(7)+"%-10s"+"รายได้รวม"+" "+names.get(9)+"%-10s"+"รายได้รวม"+" "+names.get(11)+"%-10s"+"รายได้รวมไตรมาส1"+"%-10s"+"รายได้รวมไตรมาส2"+"%-10s"+"รายได้รวมไตรมาส3"+"%-10s"+"กำไรสุทธิ"+" "+names.get(5)+"%-10s"+"กำไรสุทธิ"+" "+names.get(7)+"%-10s"+"กำไรสุทธิ"+" "+names.get(9)+"%-10s"+"กำไรสุทธิ"+" "+names.get(11)+"%-10s"+"กำไรสุทธิไตรมาส1"+"%-10s"+"กำไรสุทธิไตรมาส2"+"%-10s"+"กำไรสุทธิไตรมาส3",Company,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank);
					
					
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
				System.out.printf("%-18s","CHOTI");
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
				System.out.printf("%-18s","EE");
				for(Element ele:temp){
					
					//System.out.println(count+ " "+ ele.getAllElements().first().text() );
					
					names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		else if(pageNum == 3){
			try {
				Document doc = Jsoup.connect("https://www.set.or.th/set/companyhighlight.do?symbol=OISHI&ssoPageId=5&language=th&country=TH").userAgent("mozilla/17.0").get();
				Elements temp = doc.select("table.table-info");
				
				System.out.println();
				System.out.println();
				System.out.printf("%-18s","OISHI");
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
		
		if(pageNum > 0){
			for(int i = 0 ; i < names.size(); i++){
				if(names.get(i).equals("รายได้รวม")){
//					for(int j = i+1 ; j < i+6 ; j++){
//						count++;
//						if(count < 6){
//							System.out.printf("%-17s",names.get(j));
//						}
//						else{
//							count = 0;
//							
//						}
//						
//					}
					for(int k = i+1 ; k < i+5 ; k++){
						System.out.printf("%-21s",names.get(k));
						follow = k;
					}
						
					
					if(names.get(13).substring(0, 7).equals("ไตรมาส1")){
						System.out.printf("%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat);
					}
					else if(names.get(13).substring(0, 7).equals("ไตรมาส2")){
						System.out.printf("%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat);
					}
					else if(names.get(13).substring(0, 7).equals("ไตรมาส3")){
						System.out.printf("%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1));
					}
				}
				
				else if (names.get(i).equals("กำไรสุทธิ")){
//					for(int j = i+1 ; j < i+6 ; j++){
//						count++;
//						if(count < 6){
//							System.out.printf("%-17s",names.get(j));
//						}
//						else{
//							count = 0;
//						}
//						
//					}
					for(int j = i+1 ; j < i+5 ; j++){
						System.out.printf("%-21s",names.get(j));
						follow = j;
					}
					
					if(names.get(13).substring(0, 7).equals("ไตรมาส1")){
						System.out.printf("%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat);
					}
					else if(names.get(13).substring(0, 7).equals("ไตรมาส2")){
						System.out.printf("%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat);
					}
					else if(names.get(13).substring(0, 7).equals("ไตรมาส3")){
						System.out.printf("%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1));
					}
					
					out++;
				}
				
				else if (out > 0){
					break;
				}
				
			}
		}
		
	}
	
	public static void main(String[] args){
		
		for(int i = 0 ; i <= 3 ; i++){
			start();
			checkString();
			pageNum++;
			out--;
		}
		
	}
}
