package FetchDataSet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class SetTrade {
	
	static ArrayList<String> names,renames = new ArrayList<String>();
	static String join,join2;
	static char checkspace = ' ';
	static int count = 0, i = 0, nextrow = 0;
	static String allnameCo="",allnameCo1="",allnameCo2="",allnameCo3="",allnameCo4="",allnameCo5="",allnameCo6="",allnameCo7="",allnameCo8="",allnameCo9="",allnameCo10="",allnameCo11="",allnameCo12="",allnameCo13="",allnameCo14="",allnameCo15="",allnameCo16="",allnameCo17="",allnameCo18="",allnameCo19="",allnameCo20="",allnameCo21="",allnameCo22="",allnameCo23="",allnameCo24="",allnameCo25="",allnameCo26="",allnameCo27="",allnameCo28="",allnameCo29="";
	static String allTitleCo1="",allTitleCo2="",allTitleCo3="",allTitleCo4="",allTitleCo5="",allTitleCo6="",allTitleCo7="",allTitleCo8="",allTitleCo9="",allTitleCo10="",allTitleCo11="",allTitleCo12="",allTitleCo13="",allTitleCo14="",allTitleCo15="",allTitleCo16="",allTitleCo17="",allTitleCo18="",allTitleCo19="",allTitleCo20="",allTitleCo21="",allTitleCo22="",allTitleCo23="",allTitleCo24="",allTitleCo25="",allTitleCo26="",allTitleCo27="",allTitleCo28="",allTitleCo29="";
	static String DataTime="";
	
	
	public static void main(String[] args){
		
		try {
			Document doc = Jsoup.connect("https://marketdata.set.or.th/mkt/commonstocklistresult.do?market=SET&type=S").userAgent("mozilla/17.0").get();
			Elements temp = doc.select("table.table-info");
			
			
			for(Element ele:temp){
				i++;
				System.out.println(i+ " "+ ele.getAllElements().first().text() );
				
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
					for(int k = 0 ; k < 15 ; k++){
						allTitleCo2 += names.get(k)+ " ";
					}
					for(int j = 15 ; j < names.size(); j++){
						allnameCo2 += names.get(j)+ " ";
						nextrow++;
						if(nextrow == 11){
							allnameCo2 += "\n";
							nextrow = 0;
							System.out.println("gammmmmmmmmmmmm");
						}
					}
					
					break;
				case 3:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo3 += names.get(j)+ " ";
					}
					break;
				case 4:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo4 += names.get(j)+ " ";
					}
					break;
				case 5:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo5 += names.get(j)+ " ";
					}
					break;
				case 6:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo6 += names.get(j)+ " ";
					}
					break;
				case 7:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo7 += names.get(j)+ " ";
					}
					break;
				case 8:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo8 += names.get(j)+ " ";
					}
					break;
				case 9:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo9 += names.get(j)+ " ";
					}
					break;
				case 10:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo10 += names.get(j)+ " ";
					}
					break;
				case 11:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo11 += names.get(j)+ " ";
					}
					break;
				case 12:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo12 += names.get(j)+ " ";
					}
					break;
				case 13:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo13 += names.get(j)+ " ";
					}
					break;
				case 14:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo14 += names.get(j)+ " ";
					}
					break;
				case 15:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo15 += names.get(j)+ " ";
					}
					break;
				case 16:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo16 += names.get(j)+ " ";
					}
					break;
				case 17:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo17 += names.get(j)+ " ";
					}
					break;
				case 18:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo18 += names.get(j)+ " ";
					}
					break;
				case 19:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo19 += names.get(j)+ " ";
					}
					break;
				case 20:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo20 += names.get(j)+ " ";
					}
					break;
				case 21:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo21 += names.get(j)+ " ";
					}
					break;
				case 22:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo22 += names.get(j)+ " ";
					}
					break;
				case 23:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo23 += names.get(j)+ " ";
					}
					break;
				case 24:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo24 += names.get(j)+ " ";
					}
					break;
				case 25:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo25 += names.get(j)+ " ";
					}
					break;
				case 26:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo26 += names.get(j)+ " ";
					}
					break;
				case 27:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo27 += names.get(j)+ " ";
					}
					break;
				case 28:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo28 += names.get(j)+ " ";
					}
					break;
				case 29:
					for(int j = 15 ; j < names.size(); j++){
						allnameCo29 += names.get(j)+ " ";
					}
					break;
					
				}
				
				
				
			}
			
			System.out.println();
			System.out.println();
			
			
				join = String.join(" ", names.get(10),names.get(11));
				join2 = String.join(" ",names.get(12),names.get(13), names.get(14));
			
			
			for(int re = 0 ; re <10 ; re++){
				renames.add(names.get(re));
			}
			renames.add(join);
			renames.add(join2);
			
			
			
			for(int j = 0 ; j < renames.size() ; j++){
								
				System.out.print(renames.get(j)+ " ");
				
				if(j%12 == 0 && j!= 0 ){
					System.out.println();
				}
				
			
			}

			
			for(int allname = renames.size() ; allname < names.size() ; allname++){
				
//				if(allname % 12 == 3 && allname != 2){
//					System.out.print(names.get(allname)+"  ");
//			
//				}else {
//					System.out.print(names.get(allname)+" ");
//				}
				
//				System.out.print(names.get(allname)+" ");
				
				if(allname > 14)
				allnameCo += names.get(allname)+ " ";
				
				
				if(allname%14 == 0 && allname!=0){
						System.out.println();
				}
			
			}
			
			
			
			
			
			System.out.println("");
			System.out.println("------------");

			System.out.println(allnameCo);
			System.out.print(join);
			System.out.println("");
			System.out.println("------------");
			System.out.print(join2);
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
				
//				if(count == 2){
//				
//					count = 0;
//					allnameCo = allnameCo.substring(0,j)+'-'+allnameCo.substring(j+1);
//					
//					
//				}
				
				
				
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
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
