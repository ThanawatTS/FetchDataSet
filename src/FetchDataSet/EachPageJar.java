package FetchDataSet;

import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class EachPageJar extends JFrame {

	private JPanel  main;
	private static JTextArea textArea;
	private JScrollPane slideDown;
	static int pageNum = 0, webNum = 0 , cal = 0;
	static int count = 0, out = 0, follow = 0, countCoall = 0;
	static String All = "";
	static String Company = "��ѡ��Ѿ��", Companyweb = "";
	static String blank = "",dat = "-",website ="";
	static String[] Agriculture = {"CHOTI", "EE", "GFPT", "LEE", "STA", "TLUXE", "TRUBB", "TWPC", "UPOIC", "UVAN", "VPO"};
	static String[] FoodAndDrink = {"APURE", "ASIAN", "BR", "BRR", "CBG", "CFRESH", "CM", "CPF", "CPI", "F&D", "HTC", "ICHI", "KBS", "KSL", "KTIS", "LST", "M", "MALEE", "MINT", "OISHI", "PB", "PM", "PR", "PRG", "SAPPE", "SAUCE", "SFP", "SNP", "SORKON", "SSC", "SSF", "SST", "TC", "TF", "TFG", "TIPCO", "TKN", "TU", "TVO"};
	static String[] Fashion = {"ABC", "AFC", "BTNC", "CPH", "CPL", "ICC", "LTX", "NC", "PAF", "PG", "PRANDA", "SABINA", "SAWANG", "SUC", "TNL", "TPCORP", "TR", "TTI", "TTL", "TTTM", "UPF", "UT", "WACOAL"};
	static String[] Office = {"ACC", "AJA", "DTCI", "FANCY", "KYE", "L&E", "MODERN", "OGC", "ROCK", "SIAM", "TSR"};
	static String[] MedicalSupplies = {"DSGT", "JCT", "OCC", "S & j", "STHAI", "TNR", "TOG"};
	static String[] Bank = {"BAY", "BBL", "CIMBT", "KBANK", "KKP", "KTB", "LHBANK", "SCB", "TCAP", "TISCO", "TMB"};
	static String[] Fund = {"AEC", "AEONTS", "AMANAH", "ASAP", "ASK", "ASP", "BFIT", "CGH", "CNS", "ECL", "FNS", "FSS", "GBX", "GL", "IFS", "JMT", "KCAR", "KGI", "KTC", "MBKET", "MFC", "ML", "MTLS", "PE", "PL", "S11", "SAWAD", "THANI", "TK", "TNITY", "UOBKH", "ZMICO"};
	static String[] Insurance = {"AYUD", "BKI", "BLA", "BUI", "CHARAN", "INSURE", "MTI", "NKI", "NSI", "SMK", "THRE", "THREL", "TIC", "TIP", "TSI", "TVI"};

	static String[] Vehi = {"AH", "APCS","BAT-3K", "CWT", "EASON", "GYT", "HFT", "IHL", "IRC", "PCSGH", "SAT", "SPG", "STANLY", "TKT", "TNPC", "TRU", "TSC", "YNP"};
	static String[] FacAndMach = {"ALLA", "ASEFA", "CRANE", "CTW", "FMT", "KKC", "PK", "SNC", "TCJ", "VARO"};
	static String[] PaperAndPrint = {"UTP"};
	static String[] PitoAndChemi = {"GC", "GGC", "GIFT", "IVL", "PATO", "PMTA", "PTTGC", "SUTHA", "TCB", "TCCC", "TPA", "UP", "VNT", "WG", "YCI" };
	static String[] Container = {"AJ", "ALUCON", "CSC", "NEP", "NPP", "PTL", "SITHAI", "SLP", "SMPC", "SPACK", "TCOAT", "TFI", "THIP", "TMD", "TOPP","TPBI","TPP"};
	static String[] Steel = {"AMC", "BSBM", "CEN", "CITY", "CSP", "GJS", "GSTEL", "INOX", "LHK", "MAX", "MCS", "MILL", "PAP", "PERM", "RICH", "SAM", "SMIT", "SSI", "SSSC", "TGPRO", "THE", "TIW", "TMT", "TSTH", "TUCC", "TWP", "TYCN"};
	static String[] ConstructionMaterial = {"CCP", "DCC", "DCON", "DRT", "EPG", "GEL", "PPP", "Q-CON", "RCI", "SCC", "SCCC", "SCP", "TASCO", "TCMC", "TGCI", "TPIPL", "UMI", "VNG", "WIIK"};
	static String[] Estate = {"A", "AMATA", "AMATAV", "ANAN", "AP", "APX", "AQ", "BLAND", "BROCK", "CGD", "CI", "CPN", "ESTAR", "EVER", "GLAND", "GOLD", "J", "KC", "KWG", "LALIN", "LH", "LPN", "MBK", "MJD", "MK", "NCH", "NNCL", "NOBLE", "NUSA", "ORI", "PACE", "PF", "PLAT", "POLAR", "PRECHA", "PRIN", "PRINC", "PSH", "QH", "RICHY", "RML", "ROJNA", "S", "SAMCO", "SC", "SENA", "SF", "SIRI", "SPALI", "TFD", "TICON", "U", "UV", "WHA", "WIN"};
	static String[] CoEstate = {"AMATAR", "BKKCP", "CPNCG", "CPNRF", "CPTGF", "CRYSTAL", "CTARAF", "DTCPF", "ERWPF", "FUTUREPF", "GLANDRT", "GOLDPF", "GVREIT", "HPF", "HREIT", "IMPACT", "JCP", "KPNPF", "LHHOTEL", "LHPF", "LHSC", "LUXF", "M-II", "M-PAT", "M-STOR", "MIPF", "MIT", "MJLF", "MINIT", "MINIT2", "MNRF", "MONTRI", "POPF", "PPF", "QHHR", "QHOP", "QHPF", "SBPF", "SIRIP", "SPF", "SRIPANWA", "SSPF", "SSTPF", "SSTSS", "TCIF", "TFUND", "TGROWTH", "THIF", "TIF1", "TLGF", "TLHPF", "TLOGIS", "TNPF", "TPRIME", "TREIT", "TRIF", "TTLPF", "TU-PF", "UNIPF", "URBNPF", "WHABT", "WHAPF", "WHART"};
	static String[] Constructors = {"BJCHI", "CK", "CNT", "EMC", "ITD", "NWR", "PAE", "PLE", "PREB", "PYLON", "SEAFCO", "SQ", "SRICHA", "STEC", "STPI", "SYNTEC", "TPOLY", "TRC", "TTCL", "UNIQ"};
	static String[] EnergyAndCus = {"ABPIF", "AI", "AKR", "BAFS", "BANPU", "BCP", "BCPG", "BPP", "CKP", "DEMCO", "EA", "EARTH", "EASTW", "EGATIF", "EGCO", "ESSO", "GLOW", "GPSC", "GUNKUL", "IEC", "IFEC", "IRPC", "LANNA", "MDX", "PTG", "PTT" ,"PTTEP", "RATCH", "RPC", "SCG", "SCI", "SCN", "SGP", "SOLAR", "SPCG", "SUPER", "SUSCO", "TAE", "TCC", "TOP", "TPIPP", "TTW", "WHAUP" };
	static String[] Mineral = {"PDI", "THL"};
	static String[] Commercial = {"BEAUTY", "BIG", "BIGC", "BJC", "COL", "COM7", "CPALL", "CSS", "FN", "GLOBAL", "HMPRO", "IT", "KAMART", "LOXLEY", "MAKRO", "MC", "MEGA", "MIDA", "ROBINS", "SINGER", "SPC", "SPI"};
	static String[] Medical = {"AHC", "BCH" ,"BDMS" ,"BH", "CHG", "CMR", "EKH", "KDH", "LPH", "M-CHAI" ,"NEW", "NTV", "RAM", "RJH", "RPH", "SKR", "SVH", "VIBHA", "VIH"};
	static String[] MediaAndPrint = {"AMARIN", "AQUA", "AS", "BEC", "EPCO", "FE", "GRAMMY", "MACO", "MAJOR", "MATCH", "MATI", "MCOT", "MONO", "MPIC", "NMG", "PLANB", "POST", "PRAKIT", "RS", "SE-ED", "SMM", "SPORT", "TBSP", "TH", "TKS", "TRITN", "VGI", "WAVE" ,"WORK"};
	static String[] Service = {"BWG", "GENCO", "PRO"};
	static String[] TravleAndRecreation = {"ASIA", "CENTEL", "CSR", "DTC", "ERW", "GRAND", "GREEN", "LRH", "MANRIN", "OHTL", "ROH", "SHANG"};
	static String[] Logistic = {"AAV", "AOT", "ASIMAR", "BA", "BEM", "BTC", "BTS", "BTSGIF", "JUTHA", "JWD", "KWC", "NOK", "NYT", "PSL", "RCL", "THAI", "TSTE", "TTA", "WICE"};
	static String[] Electronic = {"CCET", "DELTA", "DRACO", "EIC", "HANA", "KCE", "METCO", "SMT", "SPPT", "SVI", "TEAM"};
	static String[] TechnologyAndMedia = {"ADVANCE", "AIT", "ALT", "BLISS", "CSL", "DIF", "DTAC", "FER", "FORTH", "ILINK", "INET", "INTUCH", "JAS", "JASIF", "JMART", "JTS", "MFEC", "MSC", "PT", "SAMART", "SAMTEL", "SIM", "SIS", "SVOA", "SYMC", "SYNEX", "THCOM", "TRUE", "TWZ"};
	static ArrayList<String> nameWeb = new ArrayList<String>();
	static ArrayList<String> names;

	private static void count(){
		System.out.println("��������ѡ��Ѿ��");
		All += "��������ѡ��Ѿ��"+"\n";
		System.out.println("-----------------------");
		All += "-----------------------"+ "\n";
		System.out.println("�ɵ�����ص��ˡ�������� >> ��áԨ����ɵ�: "+Agriculture.length);
		All += "�ɵ�����ص��ˡ�������� >> ��áԨ����ɵ�: "+Agriculture.length + "\n";
		System.out.println("�ɵ�����ص��ˡ�������� >> ������������ͧ����: "+FoodAndDrink.length);
		All += "�ɵ�����ص��ˡ�������� >> ������������ͧ����: "+FoodAndDrink.length + "\n";
		System.out.println("�Թ����ػ��������� >> Ὺ��: "+Fashion.length);
		All += "�Թ����ػ��������� >> Ὺ��: "+Fashion.length + "\n";
		System.out.println("�Թ����ػ��������� >> �ͧ��㹤������͹����ӹѡ�ҹ: "+Office.length);
		All += "�Թ����ػ��������� >> �ͧ��㹤������͹����ӹѡ�ҹ: "+Office.length + "\n";
		System.out.println("�Թ����ػ��������� >> �ͧ����ǹ�������Ǫ�ѳ��: "+MedicalSupplies.length);
		All += "�Թ����ػ��������� >> �ͧ����ǹ�������Ǫ�ѳ��: "+MedicalSupplies.length + "\n";
		System.out.println("��áԨ����Թ >> ��Ҥ��: "+Bank.length);
		All += "��áԨ����Թ >> ��Ҥ��: "+Bank.length + "\n";
		System.out.println("��áԨ����Թ >> �Թ�ع�����ѡ��Ѿ��: "+Fund.length);
		All += "��áԨ����Թ >> �Թ�ع�����ѡ��Ѿ��: "+Fund.length + "\n";
		System.out.println("��áԨ����Թ >> ��Сѹ�����л�Сѹ���Ե: "+Insurance.length);
		All += "��áԨ����Թ >> ��Сѹ�����л�Сѹ���Ե: "+Insurance.length + "\n";
		System.out.println("�Թ����ص��ˡ��� >> �ҹ¹��: "+Vehi.length);
		All += "�Թ����ص��ˡ��� >> �ҹ¹��: "+Vehi.length + "\n";
		System.out.println("�Թ����ص��ˡ��� >> ��ʴ��ص��ˡ����������ͧ�ѡ�: "+FacAndMach.length);
		All += "�Թ����ص��ˡ��� >> ��ʴ��ص��ˡ����������ͧ�ѡ�: "+FacAndMach.length + "\n";
		System.out.println("�Թ����ص��ˡ��� >> ��д�������ʴء�þ����: "+PaperAndPrint.length);
		All += "�Թ����ص��ˡ��� >> ��д�������ʴء�þ����: "+PaperAndPrint.length + "\n";
		System.out.println("�Թ����ص��ˡ��� >> ��������������ѳ��: "+PitoAndChemi.length);
		All += "�Թ����ص��ˡ��� >> ��������������ѳ��: "+PitoAndChemi.length + "\n";
		System.out.println("�Թ����ص��ˡ��� >> ��è��ѳ��: "+Container.length);
		All += "�Թ����ص��ˡ��� >> ��è��ѳ��: "+Container.length + "\n";
		System.out.println("�Թ����ص��ˡ��� >> ����: "+Steel.length);
		All += "�Թ����ص��ˡ��� >> ����: "+Steel.length + "\n";
		System.out.println("��ѧ�������Ѿ����С�����ҧ >> ��ʴء�����ҧ: "+ConstructionMaterial.length);
		All += "��ѧ�������Ѿ����С�����ҧ >> ��ʴء�����ҧ: "+ConstructionMaterial.length + "\n";
		System.out.println("��ѧ�������Ѿ����С�����ҧ >> �Ѳ����ѧ�������Ѿ��: "+Estate.length);
		All += "��ѧ�������Ѿ����С�����ҧ >> �Ѳ����ѧ�������Ѿ��: "+Estate.length+ "\n";
		System.out.println("��ѧ�������Ѿ����С�����ҧ >> �ͧ�ع�����ѧ�������Ѿ����Сͧ���ʵ����͡��ŧ�ع���ѧ�������Ѿ��: "+CoEstate.length);
		All += "��ѧ�������Ѿ����С�����ҧ >> �ͧ�ع�����ѧ�������Ѿ����Сͧ���ʵ����͡��ŧ�ع���ѧ�������Ѿ��: "+CoEstate.length + "\n";
		System.out.println("��ѧ�������Ѿ����С�����ҧ >> ��ԡ���Ѻ���ҡ�����ҧ: "+Constructors.length);
		All += "��ѧ�������Ѿ����С�����ҧ >> ��ԡ���Ѻ���ҡ�����ҧ: "+Constructors.length + "\n";
		System.out.println("��Ѿ�ҡ� >> ��ѧ�ҹ����Ҹ�óٻ���: "+ EnergyAndCus.length);
		All += "��Ѿ�ҡ� >> ��ѧ�ҹ����Ҹ�óٻ���: "+ EnergyAndCus.length + "\n";
		System.out.println("��Ѿ�ҡ� >> ����ͧ���: "+Mineral.length);
		All += "��Ѿ�ҡ� >> ����ͧ���: "+Mineral.length + "\n";
		System.out.println("��ԡ�� >> �ҳԪ��: "+ Commercial.length);
		All += "��ԡ�� >> �ҳԪ��: "+ Commercial.length + "\n";
		System.out.println("��ԡ�� >> ���ᾷ��: "+ Medical.length);
		All += "��ԡ�� >> ���ᾷ��: "+ Medical.length + "\n";
		System.out.println("��ԡ�� >> ���������觾����: "+MediaAndPrint.length);
		All += "��ԡ�� >> ���������觾����: "+MediaAndPrint.length + "\n";
		System.out.println("��ԡ�� >> ��ԡ��੾�СԨ: "+Service.length);
		All += "��ԡ�� >> ��ԡ��੾�СԨ: "+Service.length + "\n";
		System.out.println("��ԡ�� >> ��÷�ͧ���������ѹ��ҡ��: "+TravleAndRecreation.length);
		All += "��ԡ�� >> ��÷�ͧ���������ѹ��ҡ��: "+TravleAndRecreation.length + "\n";
		System.out.println("��ԡ�� >> ��������Ũ�ʵԡ��: "+ Logistic.length);
		All += "��ԡ�� >> ��������Ũ�ʵԡ��: "+ Logistic.length + "\n";
		System.out.println("෤����� >> �����ǹ����硷�͹ԡ��: "+Electronic.length);
		All += "෤����� >> �����ǹ����硷�͹ԡ��: "+Electronic.length + "\n";
		System.out.println("෤����� >> ෤��������ʹ����С���������: "+TechnologyAndMedia.length);
		All += "෤����� >> ෤��������ʹ����С���������: "+TechnologyAndMedia.length + "\n";
		countCoall += (Agriculture.length + FoodAndDrink.length + Fashion.length + Office.length + MedicalSupplies.length);
		countCoall += (Bank.length + Fund.length + Insurance.length + Vehi.length + FacAndMach.length + PaperAndPrint.length);
		countCoall += (PitoAndChemi.length + Container.length + Steel.length + ConstructionMaterial.length + Estate.length + CoEstate.length);
		countCoall += (Constructors.length + EnergyAndCus.length + Mineral.length + Commercial.length + Medical.length + MediaAndPrint.length);
		countCoall += (Service.length + TravleAndRecreation.length + Logistic.length + Electronic.length + TechnologyAndMedia.length);
		System.out.println("-----------------------");
		All += "-----------------------" + "\n";
		System.out.println("ToTal: "+countCoall);
		All += "ToTal: "+countCoall;
		
	}

//	public EachPageJar(){
//		iniCompo();
//		
//		
//		pack();
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		
//	}
//	
//	private void iniCompo(){
//		
//		JScrollPane scroll = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//		
//		
//		add(scroll);
//		setSize(500,500);
//		setVisible(true);
//		setLocationRelativeTo(null);
//		
//	}
//	
	private static void start(){


		if(pageNum == 0){
			website = "https://www.set.or.th/set/companyhighlight.do?symbol=CHOTI&ssoPageId=5&language=th&country=TH";	
		}

		else if (pageNum > 0 && pageNum <= 11){

			for(int i = 0 ; i < Agriculture.length ; i++){
				nameWeb.add(Agriculture[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;


		}
		else if (pageNum > 11 && pageNum <= 50){

			for(int i = 0 ; i < FoodAndDrink.length ; i++){
				nameWeb.add(FoodAndDrink[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;


		}
		else if (pageNum > 50 && pageNum <= 73){

			for(int i = 0 ; i < Fashion.length ; i++){
				nameWeb.add(Fashion[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;


		}
		else if (pageNum > 73 && pageNum <= 84){

			for(int i = 0 ; i < Office.length ; i++){
				nameWeb.add(Office[i]);
			}
			
			Companyweb = nameWeb.get(webNum);
			
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;


		}
		else if (pageNum > 84 && pageNum <= 91){

			for(int i = 0 ; i < MedicalSupplies.length ; i++){
				nameWeb.add(MedicalSupplies[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;


		}
		else if (pageNum > 91 && pageNum <= 102){

			for(int i = 0 ; i < Bank.length ; i++){
				nameWeb.add(Bank[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;


		}
		else if (pageNum > 102 && pageNum <= 134){

			for(int i = 0 ; i < Fund.length ; i++){
				nameWeb.add(Fund[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;


		}
		else if (pageNum > 134 && pageNum <= 150){

			for(int i = 0 ; i < Insurance.length ; i++){
				nameWeb.add(Insurance[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;


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
		else if (pageNum > 257 && pageNum <= 312){
			for(int i = 0 ; i < Estate.length ; i++){
				nameWeb.add(Estate[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		else if (pageNum > 312 && pageNum <= 375){
			for(int i = 0 ; i < CoEstate.length ; i++){
				nameWeb.add(CoEstate[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		else if (pageNum > 375 && pageNum <= 395){
			for(int i = 0 ; i < Constructors.length ; i++){
				nameWeb.add(Constructors[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		else if (pageNum > 395 && pageNum <= 438){
			for(int i = 0 ; i < EnergyAndCus.length ; i++){
				nameWeb.add(EnergyAndCus[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		else if (pageNum > 438 && pageNum <= 440){
			for(int i = 0 ; i < Mineral.length ; i++){
				nameWeb.add(Mineral[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		else if (pageNum > 440 && pageNum <= 462){
			for(int i = 0 ; i < Commercial.length ; i++){
				nameWeb.add(Commercial[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		else if (pageNum > 462 && pageNum <= 481){
			for(int i = 0 ; i < Medical.length ; i++){
				nameWeb.add(Medical[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}

		else if (pageNum > 481 && pageNum <= 510){
			for(int i = 0 ; i < MediaAndPrint.length ; i++){
				nameWeb.add(MediaAndPrint[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}

		else if (pageNum > 510 && pageNum <= 513){
			for(int i = 0 ; i < Service.length ; i++){
				nameWeb.add(Service[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}

		else if (pageNum > 513 && pageNum <= 525){
			for(int i = 0 ; i < TravleAndRecreation.length ; i++){
				nameWeb.add(TravleAndRecreation[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}

		else if (pageNum > 525 && pageNum <= 544){
			for(int i = 0 ; i < Logistic.length ; i++){
				nameWeb.add(Logistic[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		else if (pageNum > 544 && pageNum <= 555){
			for(int i = 0 ; i < Electronic.length ; i++){
				nameWeb.add(Electronic[i]);
			}
			Companyweb = nameWeb.get(webNum);
			website = "https://www.set.or.th/set/companyhighlight.do?symbol="+Companyweb+"&ssoPageId=5&language=th&country=TH";
			webNum++;
		}
		else if (pageNum > 555 && pageNum <= 584){
			for(int i = 0 ; i < TechnologyAndMedia.length ; i++){
				nameWeb.add(TechnologyAndMedia[i]);
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
					System.out.printf("%-45s"+"��������"+" "+names.get(5)+"%-10s"+"��������"+" "+names.get(7)+"%-10s"+"��������"+" "+names.get(9)+"%-10s"+"��������"+" "+names.get(11)+"%-10s"+"�������������1"+"%-10s"+"�������������2"+"%-10s"+"�������������3"+"%-10s"+"�������������4"+"%-10s"+"��������"+" "+"���ՠ60"+"%-10s"+"�����ط��"+" "+names.get(5)+"%-10s"+"�����ط��"+" "+names.get(7)+"%-10s"+"�����ط��"+" "+names.get(9)+"%-10s"+"�����ط��"+" "+names.get(11)+"%-10s"+"�����ط�������1"+"%-10s"+"�����ط�������2"+"%-10s"+"�����ط�������3"+"%-10s"+"�����ط�������4"+"%-10s"+"�����ط��"+" "+"���ՠ60",Company,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank);
					System.out.println();
					System.out.print("�ɵ�����ص��ˡ�������� >> ��áԨ����ɵ�");

				}
				All = String.format("%-45s"+"��������"+" "+names.get(5)+"%-10s"+"��������"+" "+names.get(7)+"%-10s"+"��������"+" "+names.get(9)+"%-10s"+"��������"+" "+names.get(11)+"%-10s"+"�������������1"+"%-10s"+"�������������2"+"%-10s"+"�������������3"+"%-10s"+"�������������4"+"%-10s"+"��������"+" "+"���ՠ60"+"%-10s"+"�����ط��"+" "+names.get(5)+"%-10s"+"�����ط��"+" "+names.get(7)+"%-10s"+"�����ط��"+" "+names.get(9)+"%-10s"+"�����ط��"+" "+names.get(11)+"%-10s"+"�����ط�������1"+"%-10s"+"�����ط�������2"+"%-10s"+"�����ط�������3"+"%-10s"+"�����ط�������4"+"%-10s"+"�����ط��"+" "+"���ՠ60",Company,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank,blank);
				All += "\n"+"�ɵ�����ص��ˡ�������� >> ��áԨ����ɵ�";
				

				
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		else if (pageNum > 0){

			try {
				
				Document doc = Jsoup.connect(website).userAgent("mozilla/17.0").get();
				Elements temp = doc.select("table.table-info");

				System.out.println();
				All += "\n";
				
				if (pageNum >= 1 && pageNum <= 584){
					System.out.printf("%-18s",Companyweb);
					if(Companyweb.length()>=5){
						All += String.format("%-55s",Companyweb);
					}
					else if(Companyweb.length()<5){
						cal = 5 - Companyweb.length();
						cal += 55;
						All += String.format("%-"+cal+"s", Companyweb);
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
				if(pageNum == 21 || pageNum == 75 ||pageNum == 79 || pageNum == 88 || pageNum == 181 || pageNum == 236 || pageNum == 243 || (pageNum >= 313 && pageNum <= 375) || pageNum == 396 || pageNum == 409 || pageNum == 436 || pageNum == 438 || pageNum == 569){
					if(pageNum == 21 || pageNum == 79 || pageNum == 88){
						System.out.print("cann't pull data");
						All += String.format("cann't pull data");
					}
					else if (pageNum == 75 || pageNum == 243){
						System.out.print("Cann't print all correctly");
						All += String.format("Cann't print all correctly");
					}
						
					else if (pageNum == 181 || pageNum == 236 || (pageNum >= 313 && pageNum <= 376) || pageNum == 396 || pageNum == 409 || pageNum == 436 || pageNum == 438 || pageNum == 569){
						System.out.print("Didn't have any information yet");
						All += String.format("Didn't have any information yet");
					}
						

					break;	
				}
				if(names.get(i).equals("��������")){

					if(names.get(5).substring(2).equals("�ՠ57")){
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
						if(names.get(11).substring(0, 7).equals("�����1") || names.get(11).substring(0, 7).equals("�����2") || names.get(11).substring(0, 7).equals("�����3") || names.get(11).substring(0, 7).equals("�����4") || names.get(11).substring(0, 7).equals("���ՠ60")){
							if(names.get(11).substring(0, 7).equals("�����1")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
								All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s", names.get(follow+1),dat,dat,dat,dat);
							}
							else if(names.get(11).substring(0, 7).equals("�����2")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
								All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, names.get(follow+1),dat,dat,dat);
							}
							else if(names.get(11).substring(0, 7).equals("�����3")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
								All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, names.get(follow+1),dat,dat);
							}
							else if(names.get(11).substring(0, 7).equals("�����4")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
								All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, names.get(follow+1),dat);
							}
							else if(names.get(11).substring(0, 7).equals("���ՠ60")){
								System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
								All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, dat, names.get(follow+1));
							}
						}

						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
							All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-35s",dat, dat, dat, dat, dat);
						}


					}


					else if (names.get(5).substring(2).equals("�ՠ58")){
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
						if(names.get(9).substring(0, 7).equals("�����1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s", names.get(follow+1),dat,dat,dat,dat);
							}
						else if(names.get(9).substring(0, 7).equals("�����2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("�����3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("�����4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(9).substring(0, 7).equals("���ՠ60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
							All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-35s",dat, dat, dat, dat, dat);
						}
					}

					else if (names.get(5).substring(2).equals("�ՠ59")){
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
						if(names.get(7).substring(0, 7).equals("�����1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("�����2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("�����3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("�����4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(7).substring(0, 7).equals("���ՠ60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
							All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-35s",dat, dat, dat, dat, dat);
						}
					}
					else if (names.get(5).substring(0,7).equals("�����1")){
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
						if(names.get(7).substring(0, 7).equals("�����1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("�����2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("�����3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("�����4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(7).substring(0, 7).equals("���ՠ60")){
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
						if(names.get(14).equals("�ѭ�շҧ����Թ����Ӥѭ") || names.get(14).equals("�ѭ�շҧ����Թ����Ӥѭ")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
							All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-35s",dat, dat, dat, dat, dat);
						}
						else if(names.get(13).substring(0, 7).equals("�����1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(13).substring(0, 7).equals("�����2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(13).substring(0, 7).equals("�����3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(13).substring(0, 7).equals("�����4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(13).substring(0, 7).equals("���ՠ60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-35s",dat, dat, dat, dat, names.get(follow+1));
						}

						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
							All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-35s",dat, dat, dat, dat, dat);
						}
					}

				}
//------------------------------------------------------------------
//------------------------------------------------------------------
				else if (names.get(i).equals("�����ط��")){

					if(names.get(5).substring(2).equals("�ՠ57")){
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

						if(names.get(11).substring(0, 7).equals("�����1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(11).substring(0, 7).equals("�����2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(11).substring(0, 7).equals("�����3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(11).substring(0, 7).equals("�����4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(11).substring(0, 7).equals("���ՠ60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
							All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-45s",dat, dat, dat, dat, dat);
						}

					}

					else if (names.get(5).substring(2).equals("�ՠ58")){
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
						if(names.get(9).substring(0, 7).equals("�����1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("�����2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("�����3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(9).substring(0, 7).equals("�����4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(9).substring(0, 7).equals("���ՠ60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
							All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-45s",dat, dat, dat, dat, dat);
						}
					}

					else if (names.get(5).substring(2).equals("�ՠ59")){
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
						if(names.get(7).substring(0, 7).equals("�����1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("�����2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("�����3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("�����4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(7).substring(0, 7).equals("���ՠ60")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, names.get(follow+1));
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, dat, dat, names.get(follow+1));
						}
						else{
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
							All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-45s",dat, dat, dat, dat, dat);
						}
					}
					else if (names.get(5).substring(0,7).equals("�����1")){
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
						if(names.get(7).substring(0, 7).equals("�����1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("�����2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("�����3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(7).substring(0, 7).equals("�����4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(7).substring(0, 7).equals("���ՠ60")){
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

						if(names.get(14).equals("�ѭ�շҧ����Թ����Ӥѭ") || names.get(14).equals("�ѭ�շҧ����Թ����Ӥѭ")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, dat, dat);
							All += String.format("%-48s"+"%-48s"+"%-48s"+"%-48s"+"%-35s",dat, dat, dat, dat, dat);
						}
						else if(names.get(13).substring(0, 7).equals("�����1")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s", names.get(follow+1),dat,dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s", names.get(follow+1),dat,dat,dat,dat);
						}
						else if(names.get(13).substring(0, 7).equals("�����2")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, names.get(follow+1),dat,dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, names.get(follow+1),dat,dat,dat);
						}
						else if(names.get(13).substring(0, 7).equals("�����3")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, names.get(follow+1),dat,dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, names.get(follow+1),dat,dat);
						}
						else if(names.get(13).substring(0, 7).equals("�����4")){
							System.out.printf("%-21s"+"%-21s"+"%-21s"+"%-21s"+"%-21s",dat, dat, dat, names.get(follow+1),dat);
							All += String.format("%-45s"+"%-45s"+"%-45s"+"%-45s"+"%-45s",dat, dat, dat, names.get(follow+1),dat);
						}
						else if(names.get(13).substring(0, 7).equals("���ՠ60")){
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
			All += "\n \n"; 
			webNum=0;
			nameWeb.clear();
			break;

		case 1:
			System.out.print("�ɵ�����ص��ˡ�������� >> ������������ͧ����");
			All += "�ɵ�����ص��ˡ�������� >> ������������ͧ����";
			for(int i = 12 ; i <= 50 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 2:
			System.out.print("�Թ����ػ��������� >> Ὺ��");
			All += "�Թ����ػ��������� >> Ὺ��";
			for(int i = 51 ; i <= 73 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 3:
			System.out.print("�Թ����ػ��������� >> �ͧ��㹤������͹����ӹѡ�ҹ");
			All += "�Թ����ػ��������� >> �ͧ��㹤������͹����ӹѡ�ҹ";
			for(int i = 74 ; i <= 84 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 4:
			System.out.print("�Թ����ػ��������� >> �ͧ����ǹ�������Ǫ�ѳ��");
			All += "�Թ����ػ��������� >> �ͧ����ǹ�������Ǫ�ѳ��";
			for(int i = 85 ; i <= 91 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 5:
			System.out.print("��áԨ����Թ >> ��Ҥ��");
			All += "��áԨ����Թ >> ��Ҥ��";
			for(int i = 92 ; i <= 102 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;


		case 6:
			System.out.print("��áԨ����Թ >> �Թ�ع�����ѡ��Ѿ��");
			All += "��áԨ����Թ >> �Թ�ع�����ѡ��Ѿ��";
			for(int i = 103 ; i <= 134 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 7:
			System.out.print("��áԨ����Թ >> ��Сѹ�����л�Сѹ���Ե");
			All += "��áԨ����Թ >> ��Сѹ�����л�Сѹ���Ե";
			for(int i = 135 ; i <= 150 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 8:
			System.out.print("�Թ����ص��ˡ��� >> �ҹ¹��");
			All += "�Թ����ص��ˡ��� >> �ҹ¹��";
			for(int i = 151 ; i <= 168 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 9:
			System.out.print("�Թ����ص��ˡ��� >> ��ʴ��ص��ˡ����������ͧ�ѡ�");
			All += "�Թ����ص��ˡ��� >> ��ʴ��ص��ˡ����������ͧ�ѡ�";
			for(int i = 169 ; i <= 178 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 10:
			System.out.print("�Թ����ص��ˡ��� >> ��д�������ʴء�þ����");
			All += "�Թ����ص��ˡ��� >> ��д�������ʴء�þ����";
			for(int i = 179 ; i <= 179 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 11:
			System.out.print("�Թ����ص��ˡ��� >> ��������������ѳ��");
			All += "�Թ����ص��ˡ��� >> ��������������ѳ��";
			for(int i = 180 ; i <= 194 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 12:
			System.out.print("�Թ����ص��ˡ��� >> ��è��ѳ��");
			All += "�Թ����ص��ˡ��� >> ��è��ѳ��";
			for(int i = 195 ; i <= 211 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;
		case 13:
			System.out.print("�Թ����ص��ˡ��� >> ����");
			All += "�Թ����ص��ˡ��� >> ����";
			for(int i = 212 ; i <= 238 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;
		case 14:
			System.out.print("��ѧ�������Ѿ����С�����ҧ >> ��ʴء�����ҧ");
			All += "��ѧ�������Ѿ����С�����ҧ >> ��ʴء�����ҧ";
			for(int i = 239 ; i <= 257 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 15:
			System.out.print("��ѧ�������Ѿ����С�����ҧ >> �Ѳ����ѧ�������Ѿ��");
			All += "��ѧ�������Ѿ����С�����ҧ >> �Ѳ����ѧ�������Ѿ��";
			for(int i = 258 ; i <= 312 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 16:
			System.out.print("��ѧ�������Ѿ����С�����ҧ >> �ͧ�ع�����ѧ�������Ѿ����Сͧ���ʵ����͡��ŧ�ع���ѧ�������Ѿ��");
			All += "��ѧ�������Ѿ����С�����ҧ >> �ͧ�ع�����ѧ�������Ѿ����Сͧ���ʵ����͡��ŧ�ع���ѧ�������Ѿ��";
			for(int i = 313 ; i <= 375 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 17:
			System.out.print("��ѧ�������Ѿ����С�����ҧ >> ��ԡ���Ѻ���ҡ�����ҧ");
			All += "��ѧ�������Ѿ����С�����ҧ >> ��ԡ���Ѻ���ҡ�����ҧ";
			for(int i = 376 ; i <= 395 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 18:
			System.out.print("��Ѿ�ҡ� >> ��ѧ�ҹ����Ҹ�óٻ���");
			All += "��Ѿ�ҡ� >> ��ѧ�ҹ����Ҹ�óٻ���";
			for(int i = 396 ; i <= 438 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 19:
			System.out.print("��Ѿ�ҡ� >> ����ͧ���");
			All += "��Ѿ�ҡ� >> ����ͧ���";
			for(int i = 439 ; i <= 440 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 20:
			System.out.print("��ԡ�� >> �ҳԪ��");
			All += "��ԡ�� >> �ҳԪ��";
			for(int i = 441 ; i <= 462 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 21:
			System.out.print("��ԡ�� >> ���ᾷ��");
			All += "��ԡ�� >> ���ᾷ��";
			for(int i = 463 ; i <= 481 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 22:
			System.out.print("��ԡ�� >> ���������觾����");
			All += "��ԡ�� >> ���������觾����";
			for(int i = 482 ; i <= 510 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 23:
			System.out.print("��ԡ�� >> ��ԡ��੾�СԨ");
			All += "��ԡ�� >> ��ԡ��੾�СԨ";
			for(int i = 511 ; i <= 513 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 24:
			System.out.print("��ԡ�� >> ��÷�ͧ���������ѹ��ҡ��");
			All += "��ԡ�� >> ��÷�ͧ���������ѹ��ҡ��";
			for(int i = 514 ; i <= 525 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 25:
			System.out.print("��ԡ�� >> ��������Ũ�ʵԡ��");
			All += "��ԡ�� >> ��������Ũ�ʵԡ��";
			for(int i = 526 ; i <= 544 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 26:
			System.out.print("෤����� >> �����ǹ����硷�͹ԡ��");
			All += "෤����� >> �����ǹ����硷�͹ԡ��" ;
			for(int i = 545 ; i <= 555 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;

		case 27:
			System.out.print("෤����� >> ෤��������ʹ����С���������");
			All += "෤����� >> ෤��������ʹ����С���������";
			for(int i = 556 ; i <= 584 ; i++){
				start();
				checkString();
				pageNum++;
				out--;
			}
			System.out.println();
			System.out.println();
			All += "\n \n";
			webNum=0;
			nameWeb.clear();
			break;
			
		

		}
	}

	
	public static void main(String[] args){
		
		
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
			
			for(int i = 0 ; i < 28	 ; i++){
				Category(i);
				textArea.setText(All);
				
				
			}
		}
		catch(Exception e){
			All += "\n \n \n"+"-------------------   ERROR!!! IT WILL STOP FETCHING -------------- \n \n  THANAWAT GAM ^-^  \\(0)(0)/ \n \n \n ----------------------BYE---------------------- \n \n \n";
			textArea.setText(All);
		}
		
		count();
		textArea.setText(All);
		

	}
}
