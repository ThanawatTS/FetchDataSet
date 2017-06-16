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
	
	static int pageNum = 0, webNum = 0;
	static int count = 0, out = 0, follow = 0;
	static String Company = "บริษัท", Companyweb = "";
	static String blank = "",dat = "-",website ="";
	static String[] Vehi = {"AH", "APCS","BAT-3K", "CWT", "EASON", "GYT", "HFT", "IHL", "IRC", "PCSGH", "SAT", "SPG", "STANLY", "TKT", "TNPC", "TRU", "TSC", "YNP"};
	static String[] FacAndMach = {"ALLA", "ASEFA", "CRANE", "CTW", "FMT", "KKC", "PK", "SNC", "TCJ", "VARO"};
	static String[] PaperAndPrint = {"UTP"};
	static String[] PitoAndChemi = {"GC", "GGC", "GIFT", "IVL", "PATO", "PMTA", "PTTGC", "SUTHA", "TCB", "TCCC", "TPA", "UP", "VNT", "WG", "YCI" };
	static String[] Container = {"AJ", "ALUCON", "CSC", "NEP", "NPP", "PTL", "SITHAI", "SLP", "SMPC", "SPACK", "TCOAT", "TFI", "THIP", "TMD", "TOPP","TPBI","TPP"};
	static String[] Steel = {"AMC", "BSBM", "CEN", "CITY", "CSP", "GJS", "GSTEL", "INOX", "LHK", "MAX", "MCS", "MILL", "PAP", "PERM", "RICH", "SAM", "SMIT", "SSI", "SSSC", "TGPRO", "THE", "TIW", "TMT", "TSTH", "TUCC", "TWP", "TYCN"};
	static String[] ConstructionMaterial = {"CCP", "DCC", "DCON", "DRT", "EPG", "GEL", "PPP", "Q-CON", "RCI", "SCC", "SCCC", "SCP", "TASCO", "TCMC", "TGCI", "TPIPL", "UMI", "VNG", "WIIK"};
	static ArrayList<String> nameWeb = new ArrayList<String>();
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
		else if (pageNum == 51){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=ABC&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 52){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=AFC&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 53){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=BTNC&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 54){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=CPH&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 55){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=CPL&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 56){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=ICC&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 57){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=LTX&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 58){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=NC&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 59){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=PAF&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 60){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=PG&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 61){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=PRANDA&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 62){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=SABINA&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 63){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=SAWANG&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 64){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=SUC&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 65){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TNL&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 66){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TPCORP&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 67){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TR&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 68){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TTI&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 69){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TTL&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 70){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TTTM&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 71){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=UPF&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 72){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=UT&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 73){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=WACOAL&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 74){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=ACC&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 75){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=AJA&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 76){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=DTCI&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 77){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=FANCY&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 78){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=KYE&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 79){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=L%26E&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 80){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=MODERN&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 81){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=OGC&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 82){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=ROCK&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 83){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=SIAM&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 84){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TSR&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 85){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=DSGT&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 86){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=JCT&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 87){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=OCC&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 88){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=S+%26+J&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 89){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=STHAI&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 90){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TNR&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 91){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TOG&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 92){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=BAY&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 93){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=BBL&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 94){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=CIMBT&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 95){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=KBANK&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 96){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=KKP&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 97){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=KTB&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 98){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=LHBANK&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 99){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=SCB&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 100){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TCAP&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 101){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TISCO&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 102){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TMB&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 103){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=AEC&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 104){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=AEONTS&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 105){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=AMANAH&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 106){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=ASAP&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 107){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=ASK&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 108){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=ASP&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 109){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=BFIT&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 110){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=CGH&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 111){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=CNS&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 112){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=ECL&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 113){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=FNS&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 114){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=FSS&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 115){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=GBX&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 116){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=GL&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 117){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=IFS&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 118){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=JMT&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 119){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=KCAR&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 120){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=KGI&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 121){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=KTC&ssoPageId=5&language=th&country=TH";

		}
		
		else if (pageNum == 122){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=MBKET&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 123){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=MFC&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 124){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=ML&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 125){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=MTLS&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 126){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=PE&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 127){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=PL&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 128){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=S11&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 129){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=SAWAD&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 130){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=THANI&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 131){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TK&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 132){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TNITY&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 133){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=UOBKH&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 134){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=ZMICO&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 135){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=AYUD&ssoPageId=5&language=th&country=TH";

		}
		
		else if (pageNum == 136){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=BKI&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 137){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=BLA&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 138){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=BUI&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 139){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=CHARAN&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 140){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=INSURE&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 141){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=MTI&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 142){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=NKI&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 143){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=NSI&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 144){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=SMK&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 145){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=THRE&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 146){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=THREL&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 147){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TIC&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 148){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TIP&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 149){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TSI&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum == 150){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=TVI&ssoPageId=5&language=th&country=TH";

		}
		else if (pageNum > 150 && pageNum <= 168){
			
			for(int i = 0 ; i < Vehi.length ; i++){
				nameWeb.add(Vehi[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		
		
		}
		else if (pageNum > 168 && pageNum <= 178){

			for(int i = 0 ; i < FacAndMach.length ; i++){
				nameWeb.add(FacAndMach[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;


		}
		else if (pageNum > 178 && pageNum <= 179){
			for(int i = 0 ; i < PaperAndPrint.length ; i++){
				nameWeb.add(PaperAndPrint[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		else if (pageNum > 179 && pageNum <= 194){
			for(int i = 0 ; i < PitoAndChemi.length ; i++){
				nameWeb.add(PitoAndChemi[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		else if (pageNum > 194 && pageNum <= 211){
			for(int i = 0 ; i < Container.length ; i++){
				nameWeb.add(Container[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		else if (pageNum > 211 && pageNum <= 238){
			for(int i = 0 ; i < Steel.length ; i++){
				nameWeb.add(Steel[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		else if (pageNum > 238 && pageNum <= 257){
			for(int i = 0 ; i < ConstructionMaterial.length ; i++){
				nameWeb.add(ConstructionMaterial[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		
		
		
		
		
		
		if(pageNum == 0){
			try {
				
				Document doc = Jsoup.connect(website).userAgent("mozilla/17.0").get();
				Elements temp = doc.select("table.table-info");
				
				
				for(Element ele:temp){
					
					//System.out.println(count+ " "+ ele.getAllElements().first().text() );
					
					names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));
					
					System.out.println();
					System.out.printf("%-45s"+"รายได้รวม"+" "+names.get(5)+"%-10s"+"รายได้รวม"+" "+names.get(7)+"%-10s"+"รายได้รวม"+" "+names.get(9)+"%-10s"+"รายได้รวม"+" "+names.get(11)+"%-10s"+"รายได้รวมไตรมาส1"+"%-10s"+"รายได้รวมไตรมาส2"+"%-10s"+"รายได้รวมไตรมาส3"+"%-10s"+"รายได้รวมไตรมาส4"+"%-10s"+"รายได้รวม"+" "+"งบปี 60"+"%-10s"+"กำไรสุทธิ"+" "+names.get(5)+"%-10s"+"กำไรสุทธิ"+" "+names.get(7)+"%-10s"+"กำไรสุทธิ"+" "+names.get(9)+"%-10s"+"กำไรสุทธิ"+" "+names.get(11)+"%-10s"+"กำไรสุทธิไตรมาส1"+"%-10s"+"กำไรสุทธิไตรมาส2"+"%-10s"+"กำไรสุทธิไตรมาส3"+"%-10s"+"กำไรสุทธิไตรมาส4"+"%-10s"+"กำไรสุทธิ"+" "+"งบปี 60",Company,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank);
					System.out.println();
					System.out.print("เกษตรและอุตสาหกรรมอาหาร >> ธุรกิจการเกษตร");
					
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		else if (pageNum > 0){
			
			try {
				if(pageNum == 21){
					website = "https://www.set.or.th/set/companyhighlight.do?symbol=F%26D&ssoPageId=5&language=th&country=TH";
					
				}
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
				else if(pageNum == 51){
					System.out.printf("%-18s","ABC");
				}
				else if(pageNum == 52){
					System.out.printf("%-18s","AFC");
				}
				else if(pageNum == 53){
					System.out.printf("%-18s","BTNC");
				}
				else if(pageNum == 54){
					System.out.printf("%-18s","CPH");
				}
				else if(pageNum == 55){
					System.out.printf("%-18s","CPL");
				}
				else if(pageNum == 56){
					System.out.printf("%-18s","ICC");
				}
				else if(pageNum == 57){
					System.out.printf("%-18s","LTX");
				}
				else if(pageNum == 58){
					System.out.printf("%-18s","NC");
				}
				else if(pageNum == 59){
					System.out.printf("%-18s","PAF");
				}
				else if(pageNum == 60){
					System.out.printf("%-18s","PG");
				}
				else if(pageNum == 61){
					System.out.printf("%-18s","PRANDA");
				}
				else if(pageNum == 62){
					System.out.printf("%-18s","SABINA");
				}
				else if(pageNum == 63){
					System.out.printf("%-18s","SAWANG");
				}
				else if(pageNum == 64){
					System.out.printf("%-18s","SUC");
				}
				else if(pageNum == 65){
					System.out.printf("%-18s","TNL");
				}
				else if(pageNum == 66){
					System.out.printf("%-18s","TPCORP");
				}
				else if(pageNum == 67){
					System.out.printf("%-18s","TR");
				}
				else if(pageNum == 68){
					System.out.printf("%-18s","TTI");
				}
				else if(pageNum == 69){
					System.out.printf("%-18s","TTL");
				}
				else if(pageNum == 70){
					System.out.printf("%-18s","TTTM");
				}
				else if(pageNum == 71){
					System.out.printf("%-18s","UPF");
				}
				else if(pageNum == 72){
					System.out.printf("%-18s","UT");
				}
				else if(pageNum == 73){
					System.out.printf("%-18s","WACOAL");
				}
				else if(pageNum == 74){
					System.out.printf("%-18s","ACC");
				}
				else if(pageNum == 75){
					System.out.printf("%-18s","AJA");
				}
				else if(pageNum == 76){
					System.out.printf("%-18s","DTCI");
				}
				else if(pageNum == 77){
					System.out.printf("%-18s","FANCY");
				}
				else if(pageNum == 78){
					System.out.printf("%-18s","KYE");
				}
				else if(pageNum == 79){
					System.out.printf("%-18s","L&E");
				}
				else if(pageNum == 80){
					System.out.printf("%-18s","MODERN");
				}
				else if(pageNum == 81){
					System.out.printf("%-18s","OGC");
				}
				else if(pageNum == 82){
					System.out.printf("%-18s","ROCK");
				}
				else if(pageNum == 83){
					System.out.printf("%-18s","SIAM");
				}
				else if(pageNum == 84){
					System.out.printf("%-18s","TSR");
				}
				else if(pageNum == 85){
					System.out.printf("%-18s","DSGT");
				}
				else if(pageNum == 86){
					System.out.printf("%-18s","JCT");
				}
				else if(pageNum == 87){
					System.out.printf("%-18s","OCC");
				}
				else if(pageNum == 88){
					System.out.printf("%-18s","S & J");
				}
				else if(pageNum == 89){
					System.out.printf("%-18s","STHAI");
				}
				else if(pageNum == 90){
					System.out.printf("%-18s","TNR");
				}
				else if(pageNum == 91){
					System.out.printf("%-18s","TOG");
				}
				else if(pageNum == 92){
					System.out.printf("%-18s","BAY");
				}
				else if(pageNum == 93){
					System.out.printf("%-18s","BBL");
				}
				else if(pageNum == 94){
					System.out.printf("%-18s","CIMBT");
				}
				else if(pageNum == 95){
					System.out.printf("%-18s","KBANK");
				}
				else if(pageNum == 96){
					System.out.printf("%-18s","KKP");
				}
				else if(pageNum == 97){
					System.out.printf("%-18s","KTB");
				}
				else if(pageNum == 98){
					System.out.printf("%-18s","LHBANK");
				}
				else if(pageNum == 99){
					System.out.printf("%-18s","SCB");
				}
				else if(pageNum == 100){
					System.out.printf("%-18s","TCAP");
				}
				else if(pageNum == 101){
					System.out.printf("%-18s","TISCO");
				}
				else if(pageNum == 102){
					System.out.printf("%-18s","TMB");
				}
				else if(pageNum == 103){
					System.out.printf("%-18s","AEC");
				}
				else if(pageNum == 104){
					System.out.printf("%-18s","AEONTS");
				}
				else if(pageNum == 105){
					System.out.printf("%-18s","AMANAH");
				}
				else if(pageNum == 106){
					System.out.printf("%-18s","ASAP");
				}
				else if(pageNum == 107){
					System.out.printf("%-18s","ASK");
				}
				else if(pageNum == 108){
					System.out.printf("%-18s","ASP");
				}
				else if(pageNum == 109){
					System.out.printf("%-18s","BFIT");
				}
				else if(pageNum == 110){
					System.out.printf("%-18s","CGH");
				}
				else if(pageNum == 111){
					System.out.printf("%-18s","CNS");
				}
				else if(pageNum == 112){
					System.out.printf("%-18s","ECL");
				}
				else if(pageNum == 113){
					System.out.printf("%-18s","FNS");
				}
				else if(pageNum == 114){
					System.out.printf("%-18s","FSS");
				}
				else if(pageNum == 115){
					System.out.printf("%-18s","GBX");
				}
				else if(pageNum == 116){
					System.out.printf("%-18s","GL");
				}
				else if(pageNum == 117){
					System.out.printf("%-18s","IFS");
				}
				else if(pageNum == 118){
					System.out.printf("%-18s","JMT");
				}
				else if(pageNum == 119){
					System.out.printf("%-18s","KCAR");
				}
				else if(pageNum == 120){
					System.out.printf("%-18s","KGI");
				}
				else if(pageNum == 121){
					System.out.printf("%-18s","KTC");
				}
				else if(pageNum == 122){
					System.out.printf("%-18s","MBKET");
				}
				else if(pageNum == 123){
					System.out.printf("%-18s","MFC");
				}
				else if(pageNum == 124){
					System.out.printf("%-18s","ML");
				}
				else if(pageNum == 125){
					System.out.printf("%-18s","MTLS");
				}
				else if(pageNum == 126){
					System.out.printf("%-18s","PE");
				}
				else if(pageNum == 127){
					System.out.printf("%-18s","PL");
				}
				else if(pageNum == 128){
					System.out.printf("%-18s","S11");
				}
				else if(pageNum == 129){
					System.out.printf("%-18s","SAWAD");
				}
				else if(pageNum == 130){
					System.out.printf("%-18s","THANI");
				}
				else if(pageNum == 131){
					System.out.printf("%-18s","TK");
				}
				else if(pageNum == 132){
					System.out.printf("%-18s","TNITY");
				}
				else if(pageNum == 133){
					System.out.printf("%-18s","UOBKH");
				}
				else if(pageNum == 134){
					System.out.printf("%-18s","ZMICO");
				}
				else if(pageNum == 135){
					System.out.printf("%-18s","AYUD");
				}
				else if(pageNum == 136){
					System.out.printf("%-18s","BKI");
				}
				else if(pageNum == 137){
					System.out.printf("%-18s","BLA");
				}
				else if(pageNum == 138){
					System.out.printf("%-18s","BUI");
				}
				else if(pageNum == 139){
					System.out.printf("%-18s","CHARAN");
				}
				else if(pageNum == 140){
					System.out.printf("%-18s","INSURE");
				}
				else if(pageNum == 141){
					System.out.printf("%-18s","MTI");
				}
				else if(pageNum == 142){
					System.out.printf("%-18s","NKI");
				}
				else if(pageNum == 143){
					System.out.printf("%-18s","NSI");
				}
				else if(pageNum == 144){
					System.out.printf("%-18s","SMK");
				}
				else if(pageNum == 145){
					System.out.printf("%-18s","THRE");
				}
				else if(pageNum == 146){
					System.out.printf("%-18s","THREL");
				}
				else if(pageNum == 147){
					System.out.printf("%-18s","TIC");
				}
				else if(pageNum == 148){
					System.out.printf("%-18s","TIP");
				}
				else if(pageNum == 149){
					System.out.printf("%-18s","TSI");
				}
				else if(pageNum == 150){
					System.out.printf("%-18s","TVI");
				}
				else if (pageNum > 150 && pageNum <= 168){
					System.out.printf("%-18s",Companyweb);
				}
				else if (pageNum > 168 && pageNum <= 178){
					System.out.printf("%-18s", Companyweb);
				}
				else if (pageNum > 178 && pageNum <= 179){
					System.out.printf("%-18s", Companyweb);
				}
				else if (pageNum > 179 && pageNum <= 194){
					System.out.printf("%-18s", Companyweb);
				}
				else if (pageNum > 194 && pageNum <= 211){
					System.out.printf("%-18s", Companyweb);
				}
				else if (pageNum > 211 && pageNum <= 238){
					System.out.printf("%-18s", Companyweb);
				}
				else if (pageNum > 238 && pageNum <= 257){
					System.out.printf("%-18s", Companyweb);
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
//					System.out.printf("%-45s"+"รายได้รวม"+" "+names.get(5)+"%-10s"+"รายได้รวม"+" "+names.get(7)+"%-10s"+"รายได้รวม"+" "+names.get(9)+"%-10s"+"รายได้รวม"+" "+names.get(11)+"%-10s"+"รายได้รวมไตรมาส1"+"%-10s"+"รายได้รวมไตรมาส2"+"%-10s"+"รายได้รวมไตรมาส3"+"%-10s"+"กำไรสุทธิ"+" "+names.get(5)+"%-10s"+"กำไรสุทธิ"+" "+names.get(7)+"%-10s"+"กำไรสุทธิ"+" "+names.get(9)+"%-10s"+"กำไรสุทธิ"+" "+names.get(11)+"%-10s"+"กำไรสุทธิไตรมาส1"+"%-10s"+"กำไรสุทธิไตรมาส2"+"%-10s"+"กำไรสุทธิไตรมาส3",Company,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank);
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
				if(pageNum == 21 || pageNum == 75 || pageNum == 88 || pageNum == 181 || pageNum == 236){
					if(pageNum == 21 || pageNum == 88)
						System.out.print("cann't pull data");
					else if (pageNum == 75)
						System.out.print("Cann't print all correctly");
					else if (pageNum == 181 || pageNum == 236)
						System.out.print("Didn't have any information yet");
					
					break;	
				}
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
					//System.out.println(names.get(5).substring(2));
					if(names.get(5).substring(2).equals("ปี 57")){
						System.out.printf("%-21s",dat);
						for(int k = i+1 ; k < i+4 ; k++){
							System.out.printf("%-21s",names.get(k));
							follow = k;
						}
						if(names.get(11).substring(0, 7).equals("ไตรมาส1") || names.get(11).substring(0, 7).equals("ไตรมาส2") || names.get(11).substring(0, 7).equals("ไตรมาส3") || names.get(11).substring(0, 7).equals("ไตรมาส4") || names.get(11).substring(0, 7).equals("งบปี 60")){
							if(names.get(11).substring(0, 7).equals("ไตรมาส1")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
							}
							else if(names.get(11).substring(0, 7).equals("ไตรมาส2")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
							}
							else if(names.get(11).substring(0, 7).equals("ไตรมาส3")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
							}
							else if(names.get(11).substring(0, 7).equals("ไตรมาส4")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
							}
							else if(names.get(11).substring(0, 7).equals("งบปี 60")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
							}
						}
						
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
						}
						
						
					}
					
					else if (names.get(5).substring(2).equals("ปี 58")){
						System.out.printf("%-21s"+"%-21s",dat,dat);
						for(int k = i+1 ; k < i+3 ; k++){
							System.out.printf("%-21s",names.get(k));
							follow = k;
						}
						if(names.get(9).substring(0, 7).equals("ไตรมาส1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("ไตรมาส2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("ไตรมาส3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("ไตรมาส4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(9).substring(0, 7).equals("งบปี 60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
						}
					}
					
					else if (names.get(5).substring(2).equals("ปี 59")){
						System.out.printf("%-21s"+"%-21s"+"%-21s",dat,dat,dat);
						for(int k = i+1 ; k < i+2 ; k++){
							System.out.printf("%-21s",names.get(k));
							follow = k;
						}
						if(names.get(7).substring(0, 7).equals("ไตรมาส1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(7).substring(0, 7).equals("งบปี 60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
						}
					}
					else if (names.get(5).substring(0,7).equals("ไตรมาส1")){
						System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat,dat,dat);
						for(int k = i+1 ; k <= i+1 ; k++){
							System.out.printf("%-21s",names.get(k));
							follow = k;
						}
						if(names.get(7).substring(0, 7).equals("ไตรมาส1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(7).substring(0, 7).equals("งบปี 60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
						}
					}
					
					else{
						for(int k = i+1 ; k < i+5 ; k++){
							System.out.printf("%-21s",names.get(k));
							follow = k;
						}
						if(names.get(14).equals("บัญชีทางการเงินที่สำคัญ")){
							
						}
						else if(names.get(13).substring(0, 7).equals("ไตรมาส1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(13).substring(0, 7).equals("ไตรมาส2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(13).substring(0, 7).equals("ไตรมาส3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(13).substring(0, 7).equals("ไตรมาส4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(13).substring(0, 7).equals("งบปี 60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
						}
					}
					
						
					//System.out.print(names.get(13).substring(0, 7));
					
					
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
					if(names.get(5).substring(2).equals("ปี 57")){
						System.out.printf("%-21s",dat);
						for(int k = i+1 ; k < i+4 ; k++){
							System.out.printf("%-21s",names.get(k));
							follow = k;
						}
						
						if(names.get(11).substring(0, 7).equals("ไตรมาส1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(11).substring(0, 7).equals("ไตรมาส2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(11).substring(0, 7).equals("ไตรมาส3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(11).substring(0, 7).equals("ไตรมาส4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(11).substring(0, 7).equals("งบปี 60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
						}
						
					}
					
					else if (names.get(5).substring(2).equals("ปี 58")){
						System.out.printf("%-21s"+"%-21s",dat,dat);
						for(int k = i+1 ; k < i+3 ; k++){
							System.out.printf("%-21s",names.get(k));
							follow = k;
						}
						if(names.get(9).substring(0, 7).equals("ไตรมาส1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("ไตรมาส2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("ไตรมาส3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("ไตรมาส4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(9).substring(0, 7).equals("งบปี 60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
						}
					}
					
					else if (names.get(5).substring(2).equals("ปี 59")){
						System.out.printf("%-21s"+"%-21s"+"%-21s",dat,dat,dat);
						for(int k = i+1 ; k < i+2 ; k++){
							System.out.printf("%-21s",names.get(k));
							follow = k;
						}
						if(names.get(7).substring(0, 7).equals("ไตรมาส1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(7).substring(0, 7).equals("งบปี 60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
						}
					}
					else if (names.get(5).substring(0,7).equals("ไตรมาส1")){
						System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat,dat,dat);
						for(int k = i+1 ; k <= i+1 ; k++){
							System.out.printf("%-21s",names.get(k));
							follow = k;
						}
						if(names.get(7).substring(0, 7).equals("ไตรมาส1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("ไตรมาส4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(7).substring(0, 7).equals("งบปี 60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
						}
					}
					else{
						for(int k = i+1 ; k < i+5 ; k++){
							System.out.printf("%-21s",names.get(k));
							follow = k;
						}	

						if(names.get(14).equals("บัญชีทางการเงินที่สำคัญ")){

						}
						else if(names.get(13).substring(0, 7).equals("ไตรมาส1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(13).substring(0, 7).equals("ไตรมาส2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(13).substring(0, 7).equals("ไตรมาส3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(13).substring(0, 7).equals("ไตรมาส4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(13).substring(0, 7).equals("งบปี 60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
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
			System.out.println();
			break;
			
		case 1:
			System.out.print("เกษตรและอุตสาหกรรมอาหาร >> อาหารและเครื่องดื่ม");
			for(int i = 12 ; i <= 50 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			break;
		case 2:
			System.out.print("สินค้าอุปโภคบริโภค >> แฟชั่น");
			for(int i = 51 ; i <= 73 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			break;
			
		case 3:
			System.out.print("สินค้าอุปโภคบริโภค >> ของใช้ในครัวเรือนและสำนักงาน");
			for(int i = 74 ; i <= 84 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			break;
			
		case 4:
			System.out.print("สินค้าอุปโภคบริโภค >> ของใช้ส่วนตัวและเวชภัณฑ์");
			for(int i = 85 ; i <= 91 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			break;
			
		case 5:
			System.out.print("ธุรกิจการเงิน >> ธนาคาร");
			for(int i = 92 ; i <= 102 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			break;
			
			
		case 6:
			System.out.print("ธุรกิจการเงิน >> เงินทุนและหลักทรัพย์");
			for(int i = 103 ; i <= 134 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			break;
		
		case 7:
			System.out.print("ธุรกิจการเงิน >> ประกันภัยและประกันชีวิต");
			for(int i = 135 ; i <= 150 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			break;
		
		case 8:
			System.out.print("สินค้าอุตสาหกรรม >> ยานยนต์");
			for(int i = 151 ; i <= 168 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			webNum=0;
			nameWeb.clear();
			break;
			
		case 9:
			System.out.print("สินค้าอุตสาหกรรม >> วัสดุอุตสาหกรรมและเครื่องจักร");
			for(int i = 169 ; i <= 178 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			webNum=0;
			nameWeb.clear();
			break;
			
		case 10:
			System.out.print("สินค้าอุตสาหกรรม >> กระดาษและวัสดุการพิมพ์");
			for(int i = 179 ; i <= 179 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			webNum=0;
			nameWeb.clear();
			break;
			
		case 11:
			System.out.print("สินค้าอุตสาหกรรม >> ปิโตรเคมีและเคมีภัณฑ์");
			for(int i = 180 ; i <= 194 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			webNum=0;
			nameWeb.clear();
			break;
			
		case 12:
			System.out.print("สินค้าอุตสาหกรรม >> บรรจุภัณฑ์");
			for(int i = 195 ; i <= 211 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			webNum=0;
			nameWeb.clear();
			break;
		case 13:
			System.out.print("สินค้าอุตสาหกรรม >> เหล็ก");
			for(int i = 212 ; i <= 238 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			webNum=0;
			nameWeb.clear();
			break;
		case 14:
			System.out.print("อสังหาริมทรัพย์และก่อสร้าง >> วัสดุก่อสร้าง");
			for(int i = 239 ; i <= 257 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			webNum=0;
			nameWeb.clear();
			break;
			
		}
	}
	
	public static void main(String[] args){
		pageNum=212;
		for(int i = 13 ; i < 15 ; i++){
			Category(i);
		}
		
		
	}
}
