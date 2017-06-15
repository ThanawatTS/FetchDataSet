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
	static String Company = "����ѷ";
	static String blank = "",dat = "-",website ="";
	static ArrayList<String> names;
	
	
	private static void start(){
		

		if(pageNum == 0){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=CHOTI&ssoPageId=5&language=th&country=TH";	
		}
		else if (pageNum == 1){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=CHOTI&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 2){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=EE&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 3){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=GFPT&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 4){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=LEE&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 5){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=STA&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 6){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TLUXE&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 7){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TRUBB&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 8){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TWPC&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 9){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=UPOIC&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 10){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=UVAN&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 11){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=VPO&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 12){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=APURE&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 13){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=ASIAN&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 14){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=BR&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 15){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=BRR&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 16){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=CBG&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 17){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=CFRESH&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 18){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=CM&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 19){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=CPF&ssoPageId=5&language=th&country=TH";

		}else if (pageNum == 20){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=CPI&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 21){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=F%26D&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 22){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=HTC&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 23){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=ICHI&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 24){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=KBS&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 25){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=KSL&ssoPageId=5&language=th&country=TH";

		}
		
		else if (pageNum == 26){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=KTIS&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 27){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=LST&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 28){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=M&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 29){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=MALEE&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 30){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=MINT&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 31){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=OISHI&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 32){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=PB&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 33){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=PM&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 34){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=PR&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 35){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=PRG&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 36){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=SAPPE&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 37){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=SAUCE&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 38){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=SFP&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 39){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=SNP&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 40){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=SORKON&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 41){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=SSC&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 42){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=SSF&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 43){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=SST&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 44){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TC&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 45){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TF&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 46){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TFG&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 47){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TIPCO&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 48){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TKN&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 49){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TU&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 50){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TVO&ssoPageId=5&language=th&country=TH";

		}
		
		
		if(pageNum == 0){
			try {
				Document doc = Jsoup.connect(website).userAgent("mozilla/17.0").get();
				Elements temp = doc.select("table.table-info");
				
				
				for(Element ele:temp){
					
					//System.out.println(count+ " "+ ele.getAllElements().first().text() );
					
					names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));
					
					System.out.println();
					System.out.printf("%-45s"+"��������"+" "+names.get(5)+"%-10s"+"��������"+" "+names.get(7)+"%-10s"+"��������"+" "+names.get(9)+"%-10s"+"��������"+" "+names.get(11)+"%-10s"+"�������������1"+"%-10s"+"�������������2"+"%-10s"+"�������������3"+"%-10s"+"�������������4"+"%-10s"+"�����ط��"+" "+names.get(5)+"%-10s"+"�����ط��"+" "+names.get(7)+"%-10s"+"�����ط��"+" "+names.get(9)+"%-10s"+"�����ط��"+" "+names.get(11)+"%-10s"+"�����ط�������1"+"%-10s"+"�����ط�������2"+"%-10s"+"�����ط�������3"+"%-10s"+"�����ط�������4",Company,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank);
					System.out.println();
					System.out.print("�ɵ�����ص��ˡ�������� >> ��áԨ����ɵ�");
					
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		else if (pageNum > 0){
			try {
				Document doc = Jsoup.connect(website).userAgent("mozilla/17.0").get();
				Elements temp = doc.select("table.table-info");
				
				System.out.println();
				
				if(pageNum == 1){
					System.out.printf("%-18s","CHOTI");
				}
				else if(pageNum == 2){
					System.out.printf("%-18s","EE");
				}
				else if(pageNum == 3){
					System.out.printf("%-18s","GFPT");
				}
				else if(pageNum == 4){
					System.out.printf("%-18s","LEE");
				}
				else if(pageNum == 5){
					System.out.printf("%-18s","STA");
				}
				else if(pageNum == 6){
					System.out.printf("%-18s","TLUXE");
				}
				else if(pageNum == 7){
					System.out.printf("%-18s","TRUBB");
				}
				else if(pageNum == 8){
					System.out.printf("%-18s","TWPC");
				}
				else if(pageNum == 9){
					System.out.printf("%-18s","UPOIC");
				}
				else if(pageNum == 10){
					System.out.printf("%-18s","UVAN");
				}
				else if(pageNum == 11){
					System.out.printf("%-18s","VPO");
				}
				else if(pageNum == 12){
					System.out.printf("%-18s","APURE");
				}
				else if(pageNum == 13){
					System.out.printf("%-18s","ASIAN");
				}
				else if(pageNum == 14){
					System.out.printf("%-18s","BR");
				}
				else if(pageNum == 15){
					System.out.printf("%-18s","BRR");
				}
				else if(pageNum == 16){
					System.out.printf("%-18s","CBG");
				}
				else if(pageNum == 17){
					System.out.printf("%-18s","CFRESH");
				}
				else if(pageNum == 18){
					System.out.printf("%-18s","CM");
				}
				else if(pageNum == 19){
					System.out.printf("%-18s","CPF");
				}
				else if(pageNum == 20){
					System.out.printf("%-18s","CPI");
				}
				else if(pageNum == 21){
					System.out.printf("%-18s","F&D");
				}
				else if(pageNum == 22){
					System.out.printf("%-18s","HTC");
				}
				else if(pageNum == 23){
					System.out.printf("%-18s","ICHI");
				}
				else if(pageNum == 24){
					System.out.printf("%-18s","KBS");
				}
				else if(pageNum == 25){
					System.out.printf("%-18s","KSL");
				}
				else if(pageNum == 26){
					System.out.printf("%-18s","KTIS");
				}
				else if(pageNum == 27){
					System.out.printf("%-18s","LST");
				}
				else if(pageNum == 28){
					System.out.printf("%-18s","M");
				}
				else if(pageNum == 29){
					System.out.printf("%-18s","MALEE");
				}
				else if(pageNum == 30){
					System.out.printf("%-18s","MINT");
				}
				else if(pageNum == 31){
					System.out.printf("%-18s","OISHI");
				}
				else if(pageNum == 32){
					System.out.printf("%-18s","PB");
				}
				else if(pageNum == 33){
					System.out.printf("%-18s","PM");
				}
				else if(pageNum == 34){
					System.out.printf("%-18s","PR");
				}
				else if(pageNum == 35){
					System.out.printf("%-18s","PRG");
				}
				else if(pageNum == 36){
					System.out.printf("%-18s","SAPPE");
				}
				else if(pageNum == 37){
					System.out.printf("%-18s","SAUCE");
				}
				else if(pageNum == 38){
					System.out.printf("%-18s","SFP");
				}
				else if(pageNum == 39){
					System.out.printf("%-18s","SNP");
				}
				else if(pageNum == 40){
					System.out.printf("%-18s","SORKON");
				}
				else if(pageNum == 41){
					System.out.printf("%-18s","SSC");
				}
				else if(pageNum == 42){
					System.out.printf("%-18s","SSF");
				}
				else if(pageNum == 43){
					System.out.printf("%-18s","SST");
				}
				else if(pageNum == 44){
					System.out.printf("%-18s","TC");
				}
				else if(pageNum == 45){
					System.out.printf("%-18s","TF");
				}
				else if(pageNum == 46){
					System.out.printf("%-18s","TFG");
				}
				else if(pageNum == 47){
					System.out.printf("%-18s","TIPCO");
				}
				else if(pageNum == 48){
					System.out.printf("%-18s","TKN");
				}
				else if(pageNum == 49){
					System.out.printf("%-18s","TU");
				}
				else if(pageNum == 50){
					System.out.printf("%-18s","TVO");
				}
				
				
				
				for(Element ele:temp){
					
					names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));
					
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
//		if(pageNum == 0){
//			try {
//				Document doc = Jsoup.connect("https://www.set.or.th/set/companyhighlight.do?symbol=CHOTI&ssoPageId=5&language=th&country=TH").userAgent("mozilla/17.0").get();
//				Elements temp = doc.select("table.table-info");
//				
//				
//				for(Element ele:temp){
//					
//					//System.out.println(count+ " "+ ele.getAllElements().first().text() );
//					
//					names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));
//					
//					System.out.println();
//					System.out.printf("%-45s"+"��������"+" "+names.get(5)+"%-10s"+"��������"+" "+names.get(7)+"%-10s"+"��������"+" "+names.get(9)+"%-10s"+"��������"+" "+names.get(11)+"%-10s"+"�������������1"+"%-10s"+"�������������2"+"%-10s"+"�������������3"+"%-10s"+"�����ط��"+" "+names.get(5)+"%-10s"+"�����ط��"+" "+names.get(7)+"%-10s"+"�����ط��"+" "+names.get(9)+"%-10s"+"�����ط��"+" "+names.get(11)+"%-10s"+"�����ط�������1"+"%-10s"+"�����ط�������2"+"%-10s"+"�����ط�������3",Company,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank);
//					
//					
//				}
//				
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//		}
//		
//		else if (pageNum == 1){
//			
//			try {
//				Document doc = Jsoup.connect("https://www.set.or.th/set/companyhighlight.do?symbol=CHOTI&ssoPageId=5&language=th&country=TH").userAgent("mozilla/17.0").get();
//				Elements temp = doc.select("table.table-info");
//				
//				System.out.println();
//				System.out.printf("%-18s","CHOTI");
//				for(Element ele:temp){
//					
//					//System.out.println(count+ " "+ ele.getAllElements().first().text() );
//					
//					names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));
//				}
//				
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//		}
//			
//		else if(pageNum == 2){
//			try {
//				Document doc = Jsoup.connect("https://www.set.or.th/set/companyhighlight.do?symbol=EE&ssoPageId=5&language=th&country=TH").userAgent("mozilla/17.0").get();
//				Elements temp = doc.select("table.table-info");
//				
//				System.out.println();
//				System.out.println();
//				System.out.printf("%-18s","EE");
//				for(Element ele:temp){
//					
//					//System.out.println(count+ " "+ ele.getAllElements().first().text() );
//					
//					names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));
//				}
//				
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//		}
//		
//		else if(pageNum == 3){
//			try {
//				Document doc = Jsoup.connect("https://marketdata.set.or.th/mkt/stockquotation.do?symbol=GFPT&ssoPageId=1&language=th&country=TH").userAgent("mozilla/17.0").get();
//				Elements temp = doc.select("table.table-info");
//				
//				
//					
//				System.out.println();
//				System.out.println();
//				System.out.printf("%-18s","GFPT");
//				for(Element ele:temp){
//					
//					//System.out.println(count+ " "+ ele.getAllElements().first().text() );
//					
//					names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));
//				}
//				
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//		}
//		
		
	}
	
	private static void checkString(){
		
		if(pageNum > 0){
			for(int i = 0 ; i < names.size(); i++){
				if(names.get(i).equals("��������")){
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
					//System.out.println(names.get(5).substring(2));
					if(names.get(5).substring(2).equals("�ՠ57")){
						System.out.printf("%-21s",dat);
						for(int k = i+1 ; k < i+4 ; k++){
							System.out.printf("%-21s",names.get(k));
							follow = k;
						}
						if(names.get(11).substring(0, 7).equals("�����1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(11).substring(0, 7).equals("�����2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(11).substring(0, 7).equals("�����3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(11).substring(0, 7).equals("�����4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1));
						}
						
						
					}
					
					else if (names.get(5).substring(2).equals("�ՠ58")){
						System.out.printf("%-21s"+"%-21s",dat,dat);
						for(int k = i+1 ; k < i+3 ; k++){
							System.out.printf("%-21s",names.get(k));
							follow = k;
						}
						if(names.get(9).substring(0, 7).equals("�����1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("�����2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("�����3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(9).substring(0, 7).equals("�����4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1));
						}
					}
					
					else if (names.get(5).substring(2).equals("�ՠ59")){
						System.out.printf("%-21s"+"%-21s"+"%21s",dat,dat,dat);
						for(int k = i+1 ; k < i+2 ; k++){
							System.out.printf("%-21s",names.get(k));
							follow = k;
						}
						if(names.get(7).substring(0, 7).equals("�����1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("�����2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("�����3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(7).substring(0, 7).equals("�����4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1));
						}
					}
					else{
						for(int k = i+1 ; k < i+5 ; k++){
							System.out.printf("%-21s",names.get(k));
							follow = k;
						}
						if(names.get(13).substring(0, 7).equals("�����1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(13).substring(0, 7).equals("�����2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(13).substring(0, 7).equals("�����3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(13).substring(0, 7).equals("�����4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1));
						}
					}
					
						
					//System.out.print(names.get(13).substring(0, 7));
					
					
				}
				
				else if (names.get(i).equals("�����ط��")){
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
					if(names.get(5).substring(2).equals("�ՠ57")){
						System.out.printf("%-21s",dat);
						for(int k = i+1 ; k < i+4 ; k++){
							System.out.printf("%-21s",names.get(k));
							follow = k;
						}
						
						if(names.get(11).substring(0, 7).equals("�����1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(11).substring(0, 7).equals("�����2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(11).substring(0, 7).equals("�����3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(11).substring(0, 7).equals("�����4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1));
						}
						
					}
					
					else if (names.get(5).substring(2).equals("�ՠ58")){
						System.out.printf("%-21s"+"%-21s",dat,dat);
						for(int k = i+1 ; k < i+3 ; k++){
							System.out.printf("%-21s",names.get(k));
							follow = k;
						}
						if(names.get(9).substring(0, 7).equals("�����1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("�����2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("�����3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(9).substring(0, 7).equals("�����4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1));
						}
					}
					
					else if (names.get(5).substring(2).equals("�ՠ59")){
						System.out.printf("%-21s"+"%-21s"+"%-21s",dat,dat,dat);
						for(int k = i+1 ; k < i+2 ; k++){
							System.out.printf("%-21s",names.get(k));
							follow = k;
						}
						if(names.get(7).substring(0, 7).equals("�����1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("�����2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("�����3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(7).substring(0, 7).equals("�����4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1));
						}
					}
					else{
						for(int k = i+1 ; k < i+5 ; k++){
							System.out.printf("%-21s",names.get(k));
							follow = k;
						}	
						if(names.get(13).substring(0, 7).equals("�����1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(13).substring(0, 7).equals("�����2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(13).substring(0, 7).equals("�����3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(13).substring(0, 7).equals("�����4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1));
						}
					}
						
					out++;
				}
				
				else if (out > 0){
					break;
				}
				
			}
		}
		
	}
	
	public static void Category(int Co){
		switch (Co){
		
		case 0:
			
			for(int i = 0 ; i <= 11 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			break;
			
		case 1:
			System.out.println("�ɵ�����ص��ˡ�������� >> ������������ͧ����");
			for(int i = 12 ; i <= 50 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			
		}
		
	}
	
	public static void main(String[] args){
		
		for(int i = 0 ; i < 2 ; i++){
			Category(i);
		}
		
		
	}
}
