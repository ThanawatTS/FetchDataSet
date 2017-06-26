package MAI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import FetchDataSet.EachPageJar;

public class mai {

	private JPanel  main;
	private static JTextArea textArea;
	private JScrollPane slideDown;

	static String[] AGRO = {"ABICO", "AU", "FC", "HOTPOT", "KASET", "MM", "TACC", "TMILL", "XO"};
	static String[] CONSUMP = {"APCO", "BGT" ,"BIZ", "ECF", "HPT", "JUBILE", "MOONG", "NPK", "OCEAN", "TM"};
	static String[] FINCIAL = {"ACAP", "AF", "AIRA", "ASN", "BROOK", "GCAP", "LIT", "SGF"};
	static String[] INDUS = {"2S", "BM", "CHO", "CHOW", "CIG", "COLOR", "CPR", "FPI", "GTB", "HTECH", "KCM", "LVT", "MBAX", "MGT", "NDR", "PDG", "PIMO", "PJW", "PPM", "RWI", "SALEE", "SANKO", "SELIC", "SWC", "TAPAC", "TMC", "TMI", "TMW", "TPAC", "UAC", "UBIS", "UEC", "UKEM", "UREKA", "YUASA"};
	static String[] PROPCON = {"ARROW", "BKD", "BSM", "BTW", "CHEWA", "DIMET", "FOCUS", "HYDRO", "JSP", "K", "NVD", "PPS", "SMART", "STAR", "T", "THANA", "VTE"};
	static String[] RESOURC = {"AGE", "AIE", "PSTC", "QTC", "SEAOIL", "SR", "TAKUNI", "TPCH", "TRT", "TSE", "UMS", "UWC"};
	static String[] SERVICE = {"ADAM", "AKP", "AMA", "ARIP", "ATP30", "AUCT" ,"BOL", "CHUO", "CMO", "D", "DCORP", "DNA" ,"EFORL", "ETE", "FSMART", "FVC", "HARN", "KIAT", "KOOL", "LDC", "MPG", "NBC", "NCL", "NINE", "OTO", "PHOL", "PICO", "QLT", "RP", "SE", "SPA", "TNDT", "TNH", "TNP", "TSF", "TVD", "TVT", "WINNER"};
	static String[] TECH = {"CCN", "COMAN", "IRCP", "ITEL", "NETBAY", "NEWS", "PCA", "SIMAT", "SPVI", "UPA"};

	static ArrayList<String> nameWeb = new ArrayList<String>();
	static ArrayList<String> names;

	static int out = 0,pageNum = 0,webNum = 0, cal = 0, follow = 0;
	static String website = "", CompanyWeb= "", blank = " ", Company = "หลักทรัพย์";
	static String All = "", dat = "-";

	private static void start(){
	
		if (pageNum > 0 && pageNum <= AGRO.length){

			for(int i = 0 ; i < AGRO.length ; i++){
				nameWeb.add(AGRO[i]);
			}
			CompanyWeb = nameWeb.get(webNum);
			
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+CompanyWeb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		
		else if (pageNum > AGRO.length && pageNum < CONSUMP.length+AGRO.length){
			for(int i = 0 ; i < CONSUMP.length ; i++){
				nameWeb.add(CONSUMP[i]);
			}
			CompanyWeb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+CompanyWeb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		
		else if (pageNum >= CONSUMP.length+AGRO.length  && pageNum < FINCIAL.length+CONSUMP.length+AGRO.length){
			
			for(int i = 0 ; i < FINCIAL.length ; i++){
				nameWeb.add(FINCIAL[i]);
				
			}
			CompanyWeb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+CompanyWeb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		else if (pageNum >= FINCIAL.length+CONSUMP.length+AGRO.length  && pageNum <INDUS.length+FINCIAL.length+CONSUMP.length+AGRO.length ){
			
			for(int i = 0 ; i < INDUS.length ; i++){
				nameWeb.add(INDUS[i]);
				
			}
			CompanyWeb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+CompanyWeb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		else if (pageNum >= INDUS.length+FINCIAL.length+CONSUMP.length+AGRO.length  && pageNum < PROPCON.length+INDUS.length+FINCIAL.length+CONSUMP.length+AGRO.length ){
			
			for(int i = 0 ; i < PROPCON.length ; i++){
				nameWeb.add(PROPCON[i]);
				
			}
			CompanyWeb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+CompanyWeb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		else if (pageNum >= PROPCON.length+INDUS.length+FINCIAL.length+CONSUMP.length+AGRO.length  && pageNum < RESOURC.length+PROPCON.length+INDUS.length+FINCIAL.length+CONSUMP.length+AGRO.length ){
			
			for(int i = 0 ; i < RESOURC.length ; i++){
				nameWeb.add(RESOURC[i]);
				
			}
			CompanyWeb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+CompanyWeb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		else if (pageNum >= RESOURC.length+PROPCON.length+INDUS.length+FINCIAL.length+CONSUMP.length+AGRO.length  && pageNum < SERVICE.length+RESOURC.length+PROPCON.length+INDUS.length+FINCIAL.length+CONSUMP.length+AGRO.length ){
			
			for(int i = 0 ; i < SERVICE.length ; i++){
				nameWeb.add(SERVICE[i]);
				
			}
			CompanyWeb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+CompanyWeb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		
		else if (pageNum >= SERVICE.length+RESOURC.length+PROPCON.length+INDUS.length+FINCIAL.length+CONSUMP.length+AGRO.length  && pageNum < TECH.length+SERVICE.length+RESOURC.length+PROPCON.length+INDUS.length+FINCIAL.length+CONSUMP.length+AGRO.length+1 ){
			
			for(int i = 0 ; i < TECH.length ; i++){
				nameWeb.add(TECH[i]);
				
			}
			CompanyWeb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+CompanyWeb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		

		if(pageNum == 0){
			
			try {
				
				Document doc = Jsoup.connect("https://www.set.or.th/set/companyhighlight.do?symbol=ABICO&ssoPageId=5&language=th&country=TH").userAgent("mozilla/17.0").get();
				Elements temp = doc.select("table.table-info");
				
				for(Element ele:temp){
					
					//System.out.print("เกษตรและอุตสาหกรรมอาหาร");
					//System.out.println(" "+ ele.getAllElements().first().text() );

					names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));
					System.out.printf("%-45s"+"รายได้รวม"+names.get(5)+"%-10s"+"รายได้รวม"+names.get(7)+"%-10s"+"รายได้รวม"+names.get(9)+"%-10s"+"รายได้รวม"+names.get(11)+"%-10s"+"รายได้รวมไตรมาส1"+"%-10s"+"รายได้รวมไตรมาส2"+"%-10s"+"รายได้รวมไตรมาส3"+"%-10s"+"รายได้รวมไตรมาส4"+"%-10s"+"รายได้รวม"+"งบปี60"+"%-10s"+"กำไรสุทธิ"+names.get(5)+"%-10s"+"กำไรสุทธิ"+names.get(7)+"%-10s"+"กำไรสุทธิ"+names.get(9)+"%-10s"+"กำไรสุทธิ"+names.get(11)+"%-10s"+"กำไรสุทธิไตรมาส1"+"%-10s"+"กำไรสุทธิไตรมาส2"+"%-10s"+"กำไรสุทธิไตรมาส3"+"%-10s"+"กำไรสุทธิไตรมาส4"+"%-10s"+"กำไรสุทธิ"+"งบปี60",Company,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank);
					
					
					System.out.println();
					System.out.print("เกษตรและอุตสาหกรรมอาหาร");
					

				}	
				All = String.format("%-45s"+"รายได้รวม"+names.get(5)+"%-10s"+"รายได้รวม"+names.get(7)+"%-10s"+"รายได้รวม"+names.get(9)+"%-10s"+"รายได้รวม"+names.get(11)+"%-10s"+"รายได้รวมไตรมาส1"+"%-10s"+"รายได้รวมไตรมาส2"+"%-10s"+"รายได้รวมไตรมาส3"+"%-10s"+"รายได้รวมไตรมาส4"+"%-10s"+"รายได้รวม"+"งบปี 60"+"%-10s"+"กำไรสุทธิ"+names.get(5)+"%-10s"+"กำไรสุทธิ"+names.get(7)+"%-10s"+"กำไรสุทธิ"+names.get(9)+"%-10s"+"กำไรสุทธิ"+names.get(11)+"%-10s"+"กำไรสุทธิไตรมาส1"+"%-10s"+"กำไรสุทธิไตรมาส2"+"%-10s"+"กำไรสุทธิไตรมาส3"+"%-10s"+"กำไรสุทธิไตรมาส4"+"%-10s"+"กำไรสุทธิ"+"งบปี60",Company,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank);
				All += "\n"+"เกษตรและอุตสาหกรรมอาหาร";
				
			} catch (IOException e){
				e.printStackTrace();
			}

		}

		else if (pageNum > 0 ){

			try {

				Document doc = Jsoup.connect(website).userAgent("mozilla/17.0").get();
				Elements temp = doc.select("table.table-info");

				System.out.println();

				All += "\n";
				
				if (pageNum >= 1 && pageNum <= 584){
					System.out.printf("%-18s",CompanyWeb);
					
					if(CompanyWeb.length()>=5){
						All += String.format("%-55s",CompanyWeb);
					}
					else if(CompanyWeb.length()<5){
						cal = 5 - CompanyWeb.length();
						cal += 55;
						All += String.format("%-"+cal+"s", CompanyWeb);
					}

				}

				for(Element ele:temp){
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
				if(pageNum == 6 || pageNum == 101){
					if (pageNum == 6 || pageNum == 101){
						System.out.print("Didn't have any information yet");
						All += String.format("Didn't have any information yet");
					}


					break;	
				}
				if(names.get(i).equals("รายได้รวม")){

					if(names.get(5).substring(2).equals("ปี 57")){
						System.out.printf("%-21s",dat);
						All += String.format("%-40s",dat);
						for(int k = i+1 ; k < i+4 ; k++){
							System.out.printf("%-21s",names.get(k));
							cal = 0;

							if(names.get(k).length() == 10){
								All += String.format("%-35s",names.get(k));
							}
							else if (names.get(k).length() > 10){
								cal = 35;
								cal -= names.get(k).length() - 10 ;

								All += String.format("%-"+cal+"s", names.get(k));
							}
							else if (names.get(k).length() < 10){
								cal = 35;
								cal += 10 - names.get(k).length() ;
								All += String.format("%-"+cal+"s",names.get(k));
							}

							follow = k;
						}
						if(names.get(11).substring(0, 7).equals("ไตรมาส1") || names.get(11).substring(0, 7).equals("ไตรมาส2") || names.get(11).substring(0, 7).equals("ไตรมาส3") || names.get(11).substring(0, 7).equals("ไตรมาส4") || names.get(11).substring(0, 7).equals("งบปี 60")){
							if(names.get(11).substring(0, 7).equals("ไตรมาส1")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
								All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s", names.get(follow+1),dat,dat,dat,dat);
							}
							else if(names.get(11).substring(0, 7).equals("ไตรมาส2")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
								All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, names.get(follow+1),dat,dat,dat);
							}
							else if(names.get(11).substring(0, 7).equals("ไตรมาส3")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
								All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, names.get(follow+1),dat,dat);
							}
							else if(names.get(11).substring(0, 7).equals("ไตรมาส4")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
								All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, names.get(follow+1),dat);
							}
							else if(names.get(11).substring(0, 7).equals("งบปี 60")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
								All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, dat, names.get(follow+1));
							}
						}

						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
							All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-35s",dat, dat, dat, dat, dat);
						}


					}


					else if (names.get(5).substring(2).equals("ปี 58")){
						System.out.printf("%-21s"+"%-21s",dat,dat);
						All += String.format("%-45s"+"%-40s",dat,dat);

						for(int k = i+1 ; k < i+3 ; k++){
							System.out.printf("%-21s",names.get(k));
							cal = 0;

							if(names.get(k).length() == 10){
								All += String.format("%-35s",names.get(k));
							}
							else if (names.get(k).length() > 10){
								cal = 35;
								cal -= names.get(k).length() - 10 ;

								All += String.format("%-"+cal+"s", names.get(k));
							}
							else if (names.get(k).length() < 10){
								cal = 35;
								cal += 10 - names.get(k).length() ;
								All += String.format("%-"+cal+"s",names.get(k));
							}

							follow = k;
						}
						if(names.get(9).substring(0, 7).equals("ไตรมาส1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("ไตรมาส2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("ไตรมาส3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("ไตรมาส4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(9).substring(0, 7).equals("งบปี 60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
							All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-35s",dat, dat, dat, dat, dat);
						}
					}

					else if (names.get(5).substring(2).equals("ปี 59")){
						System.out.printf("%-21s"+"%-21s"+"%-21s",dat,dat,dat);
						All += String.format("%-45s"+"%-45s"+"%-40s",dat,dat,dat);
						for(int k = i+1 ; k < i+2 ; k++){
							System.out.printf("%-21s",names.get(k));
							cal = 0;

							if(names.get(k).length() == 10){
								All += String.format("%-35s",names.get(k));
							}
							else if (names.get(k).length() > 10){
								cal = 35;
								cal -= names.get(k).length() - 10 ;

								All += String.format("%-"+cal+"s", names.get(k));
							}
							else if (names.get(k).length() < 10){
								cal = 35;
								cal += 10 - names.get(k).length() ;
								All += String.format("%-"+cal+"s",names.get(k));
							}

							follow = k;
						}
						if(names.get(7).substring(0, 7).equals("ไตรมาส1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(7).substring(0, 7).equals("งบปี 60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
							All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-35s",dat, dat, dat, dat, dat);
						}
					}
					else if (names.get(5).substring(0,7).equals("ไตรมาส1")){
						System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat,dat,dat);
						All += String.format("%-45s"+"%-45s"+"%-45s"+"%-40s",dat, dat,dat,dat);
						for(int k = i+1 ; k <= i+1 ; k++){
							System.out.printf("%-21s",names.get(k));
							cal = 0;

							if(names.get(k).length() == 10){
								All += String.format("%-35s",names.get(k));
							}
							else if (names.get(k).length() > 10){
								cal = 35;
								cal -= names.get(k).length() - 10 ;

								All += String.format("%-"+cal+"s", names.get(k));
							}
							else if (names.get(k).length() < 10){
								cal = 35;
								cal += 10 - names.get(k).length() ;
								All += String.format("%-"+cal+"s",names.get(k));
							}

							follow = k;
						}
						if(names.get(7).substring(0, 7).equals("ไตรมาส1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(7).substring(0, 7).equals("งบปี 60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, names.get(follow+1),dat);
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
							All += String.format("%-48s"+"%-48s"+"%-48s"+"%-30s", dat, dat, dat, dat);
						}
					}

					else{
						for(int k = i+1 ; k < i+5 ; k++){
							System.out.printf("%-21s",names.get(k));
							cal = 0;

							if(names.get(k).length() == 10){
								All += String.format("%-35s",names.get(k));
							
							}
							else if (names.get(k).length() > 10){
								cal = 35;
								cal -= names.get(k).length() - 10 ;

								All += String.format("%-"+cal+"s", names.get(k));
							}
							else if (names.get(k).length() < 10){
								cal = 35;
								cal += 10 - names.get(k).length() ;
								All += String.format("%-"+cal+"s",names.get(k));
							}

							follow = k;
						}
						if (pageNum == 19){
							if(names.get(14).equals("บัญชีทางการเงินที่สำคัญ") || names.get(14).equals("บัญชีทางการเงินที่สำคัญ")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
								All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-35s",dat, dat, dat, dat, dat);
							}
							else if(names.get(13).substring(0, 7).equals("ไตรมาส1")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
								All += String.format("%-42s"+"%-42s"+"%-42s"+"%-45s"+"%-35s", names.get(follow+1),dat,dat,dat,dat);
							}
							else if(names.get(13).substring(0, 7).equals("ไตรมาส2")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
								All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, names.get(follow+1),dat,dat,dat);
							}
							else if(names.get(13).substring(0, 7).equals("ไตรมาส3")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
								All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, names.get(follow+1),dat,dat);
							}
							else if(names.get(13).substring(0, 7).equals("ไตรมาส4")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
								All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, names.get(follow+1),dat);
							}
							else if(names.get(13).substring(0, 7).equals("งบปี 60")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
								All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, dat, names.get(follow+1));
							}

							else{
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
								All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-35s",dat, dat, dat, dat, dat);
							}
						}
						else{
							if(names.get(14).equals("บัญชีทางการเงินที่สำคัญ") || names.get(14).equals("บัญชีทางการเงินที่สำคัญ")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
								All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-35s",dat, dat, dat, dat, dat);
							}
							else if(names.get(13).substring(0, 7).equals("ไตรมาส1")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
								All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s", names.get(follow+1),dat,dat,dat,dat);
							}
							else if(names.get(13).substring(0, 7).equals("ไตรมาส2")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
								All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, names.get(follow+1),dat,dat,dat);
							}
							else if(names.get(13).substring(0, 7).equals("ไตรมาส3")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
								All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, names.get(follow+1),dat,dat);
							}
							else if(names.get(13).substring(0, 7).equals("ไตรมาส4")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
								All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, names.get(follow+1),dat);
							}
							else if(names.get(13).substring(0, 7).equals("งบปี 60")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
								All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, dat, names.get(follow+1));
							}

							else{
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
								All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-35s",dat, dat, dat, dat, dat);
							}
						}

					}

				}
				//------------------------------------------------------------------
				//------------------------------------------------------------------
				else if (names.get(i).equals("กำไรสุทธิ")){

					if(names.get(5).substring(2).equals("ปี 57")){
						System.out.printf("%-21s",dat);
						All += String.format("%-40s",dat);
						for(int k = i+1 ; k < i+4 ; k++){
							System.out.printf("%-21s",names.get(k));
							cal = 0;

							if(names.get(k).length() == 10){
								All += String.format("%-30s",names.get(k));
							}
							else if (names.get(k).length() > 10){
								cal = 30;
								cal -= names.get(k).length() - 10 ;

								All += String.format("%-"+cal+"s", names.get(k));
							}
							else if (names.get(k).length() < 10){
								cal = 30;
								cal += 10 - names.get(k).length() ;
								All += String.format("%-"+cal+"s",names.get(k));
							}

							follow = k;
						}

						if(names.get(11).substring(0, 7).equals("ไตรมาส1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(11).substring(0, 7).equals("ไตรมาส2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(11).substring(0, 7).equals("ไตรมาส3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(11).substring(0, 7).equals("ไตรมาส4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(11).substring(0, 7).equals("งบปี 60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
							All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-45s",dat, dat, dat, dat, dat);
						}

					}

					else if (names.get(5).substring(2).equals("ปี 58")){
						System.out.printf("%-21s"+"%-21s",dat,dat);
						All += String.format("%-40s"+"%-35s",dat,dat);
						for(int k = i+1 ; k < i+3 ; k++){
							System.out.printf("%-21s",names.get(k));
							cal = 0;

							if(names.get(k).length() == 10){
								All += String.format("%-30s",names.get(k));
							}
							else if (names.get(k).length() > 10){
								cal = 30;
								cal -= names.get(k).length() - 10 ;

								All += String.format("%-"+cal+"s", names.get(k));
							}
							else if (names.get(k).length() < 10){
								cal = 30;
								cal += 10 - names.get(k).length() ;
								All += String.format("%-"+cal+"s",names.get(k));
							}

							follow = k;
						}
						if(names.get(9).substring(0, 7).equals("ไตรมาส1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("ไตรมาส2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("ไตรมาส3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("ไตรมาส4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(9).substring(0, 7).equals("งบปี 60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
							All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-45s",dat, dat, dat, dat, dat);
						}
					}

					else if (names.get(5).substring(2).equals("ปี 59")){
						System.out.printf("%-21s"+"%-21s"+"%-21s",dat,dat,dat);
						All += String.format("%-40s"+"%-40s"+"%-35s",dat,dat,dat);
						for(int k = i+1 ; k < i+2 ; k++){
							System.out.printf("%-21s",names.get(k));
							cal = 0;

							if(names.get(k).length() == 10){
								All += String.format("%-30s",names.get(k));
							}
							else if (names.get(k).length() > 10){
								cal = 30;
								cal -= names.get(k).length() - 10 ;

								All += String.format("%-"+cal+"s", names.get(k));
							}
							else if (names.get(k).length() < 10){
								cal = 30;
								cal += 10 - names.get(k).length() ;
								All += String.format("%-"+cal+"s",names.get(k));
							}

							follow = k;
						}
						if(names.get(7).substring(0, 7).equals("ไตรมาส1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(7).substring(0, 7).equals("งบปี 60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
							All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-45s",dat, dat, dat, dat, dat);
						}
					}
					else if (names.get(5).substring(0,7).equals("ไตรมาส1")){
						System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat,dat,dat);
						All += String.format("%-40s"+"%-40s"+"%-40s"+"%-35s",dat, dat,dat,dat);
						for(int k = i+1 ; k <= i+1 ; k++){
							System.out.printf("%-21s",names.get(k));
							cal = 0;

							if(names.get(k).length() == 10){
								All += String.format("%-30s",names.get(k));
							}
							else if (names.get(k).length() > 10){
								cal = 30;
								cal -= names.get(k).length() - 10 ;

								All += String.format("%-"+cal+"s", names.get(k));
							}
							else if (names.get(k).length() < 10){
								cal = 35;
								cal += 10 - names.get(k).length() ;
								All += String.format("%-"+cal+"s",names.get(k));
							}

							follow = k;
						}
						if(names.get(7).substring(0, 7).equals("ไตรมาส1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(7).substring(0, 7).equals("งบปี 60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
							All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s", dat, dat, dat, dat);
						}
					}
					else{
						for(int k = i+1 ; k < i+5 ; k++){
							System.out.printf("%-21s",names.get(k));
							cal = 0;

							if(names.get(k).length() == 10){
								All += String.format("%-30s",names.get(k));
							}
							else if (names.get(k).length() > 10){
								cal = 30;
								cal -= names.get(k).length() - 10 ;

								All += String.format("%-"+cal+"s", names.get(k));
							}
							else if (names.get(k).length() < 10){
								cal = 30;
								cal += 10 - names.get(k).length() ;
								All += String.format("%-"+cal+"s",names.get(k));
							}

							follow = k;
						}	

						if(names.get(14).equals("บัญชีทางการเงินที่สำคัญ") || names.get(14).equals("บัญชีทางการเงินที่สำคัญ")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
							All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-35s",dat, dat, dat, dat, dat);
						}
						else if(names.get(13).substring(0, 7).equals("ไตรมาส1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(13).substring(0, 7).equals("ไตรมาส2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(13).substring(0, 7).equals("ไตรมาส3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(13).substring(0, 7).equals("ไตรมาส4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(13).substring(0, 7).equals("งบปี 60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
							All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-35s",dat, dat, dat, dat, dat);
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
	
	public static void count (){
		System.out.println(AGRO.length);
		All += "AGRO:"+ AGRO.length;
		System.out.println(CONSUMP.length);
		All += "CONSUMP:" + CONSUMP.length; 
		System.out.println(FINCIAL.length);
		All += "FINCIAL:" + FINCIAL.length;
		System.out.println(INDUS.length);
		All += "INDUS:" + INDUS.length;
		System.out.println(PROPCON.length);
		All += "PROPCON:" + PROPCON.length;
		System.out.println(RESOURC.length);
		All += "RESOURC:" + RESOURC.length;
		System.out.println(SERVICE.length);
		All += "SERVICE:" + SERVICE.length;
		System.out.println(TECH.length);
		All += "TECH:"+TECH.length;
	}
	
	public static void Category (int Co){
		switch (Co){
		
		case 0:
			
			for(int i = 0; i <= AGRO.length; i++){
				
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum = 0;
			nameWeb.clear();
			break;
			
		case 1:
			System.out.print("สินค้าอุปโภคบริโภค");
			All += "สินค้าอุปโภคบริโภค";
			for(int i = 0; i < CONSUMP.length; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum = 0;
			nameWeb.clear();
			break;
		
		case 2:
			System.out.print("ธุรกิจการเงิน");
			All += "ธุรกิจการเงิน";
			for(int i = 0 ; i < FINCIAL.length; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum = 0;
			nameWeb.clear();
			break;
		
		case 3:
			System.out.print("สินค้าอุตสาหกรรม");
			All += "สินค้าอุตสาหกรรม";
			for(int i = 0; i < INDUS.length; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum = 0;
			nameWeb.clear();
			break;
			
		case 4:
			System.out.print("อสังหาริมทรัพย์และก่อสร้าง");
			All += "อสังหาริมทรัพย์และก่อสร้าง";
			for(int i = 0; i < PROPCON.length; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum = 0;
			nameWeb.clear();
			break;

		case 5:
			System.out.print("ทรัพยากร");
			All += "ทรัพยากร";
			for(int i = 0; i < RESOURC.length; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum = 0;
			nameWeb.clear();
			break;
			
		case 6:
			System.out.print("บริการ");
			All += "บริการ";
			for(int i = 0; i < SERVICE.length; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum = 0;
			nameWeb.clear();
			break;
			
		case 7:
			System.out.print("เทคโนโลยี");
			All += "เทคโนโลยี";
			for(int i = 0; i < TECH.length; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum = 0;
			nameWeb.clear();
			break;
			
			
		}
		
		}
		
		public static void main (String[] args){

			EachPageJar epj = new EachPageJar();
			epj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			final JTextArea textArea = new JTextArea(10,20);
			JScrollPane scroll = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			
			textArea.setText(All);
			textArea.setWrapStyleWord(true);
			
			epj.add(scroll);
			epj.setSize(500,500);
			epj.setVisible(true);
			epj.setLocationRelativeTo(null);
			
			
			try{
				
				for(int i = 0 ; i < 8	 ; i++){
					
					Category(i);
					textArea.setText(All);
					
					
				}
			}
			catch(Exception e){
				All += "\n \n \n"+"-------------------   ERROR!!! IT WILL STOP FETCHING -------------- \n \n  THANAWAT GAM ^-^  \\(0)(0)/ \n \n \n ----------------------BYE---------------------- \n \n \n";
				All += e;
				
				textArea.setText(All);
			}
			
			
			textArea.setText(All);
			
		}
	
	

}
