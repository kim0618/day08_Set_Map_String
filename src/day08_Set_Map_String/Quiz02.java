package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
	/*	Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		String name=null,money=null;
		int num1=0;
		int num2 = 0;
		while(true) {
			System.out.println("1.�޴� ���");
			System.out.println("2.�޴��� ���� ����");
			System.out.println("3.����");
			System.out.println(">>> ");
			num1 = input.nextInt();
			if(num1 == 1) {
				System.out.println("�޴� �Է� : ");
				name = input.next();
				if(map.containsKey(name) == false) {
					System.out.println("���� �Է� : ");
					money = input.next();
					map.put(name, money);
					System.out.println("��� �Ϸ�");
				}else {
					System.out.println("�޴��� �����մϴ�.");
				}
			}
			else if(num1==2) {
				Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					name = (String)it.next();
					System.out.println(name+" : "+map.get(name));
				}
				System.out.println("1.���� 2.���� 3.������");
				num2 = input.nextInt();
				if(num2 == 1) {
					System.out.println("���� �޴� �̸� �Է� : ");
					name = input.next();
					if(map.containsKey(name)) {
						System.out.println("���� ���� �Է� : ");
						String newmoney;
						newmoney = input.next();
						System.out.println(map.get(name)+" -> "+newmoney);
						System.out.println("���� �ƽ��ϴ�.!!!");
						map.replace(name, newmoney);
					}else {
						System.out.println("�޴��� �����ϴ�.");
					}
				}else if(num2 == 2) {
					System.out.println("������ �̸� �Է� : ");{
						name = input.next();
						if(map.containsKey(name)) {
							map.remove(name);
							System.out.println(name+"�����Ϸ�");
						}else {
							System.out.println(name+" �޴��� ���������ʽ��ϴ�");
						}
					}
				}
				else break;
			}
			if(num2 ==3 );
			System.out.println("����");
			break;
		}*/
		
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		String name=null,money=null;
		int num1 = 0;
		int num2 = 0;
		
		while(true) {
			System.out.println("1.�޴� ���");
			System.out.println("2.�޴��� ���� ����");
			System.out.println("3.����");
			System.out.println(">>> ");
			num1 = input.nextInt();
			if(num1 == 1) {
				System.out.println("�޴� �Է� : ");
				name = input.next();
				if(map.containsKey(name)==false) {
					System.out.println("���� �Է� : ");
					money = input.next();
					map.put(name, money);
					System.out.println("��� ����");
				}else {
					System.out.println("�����ϴ� �޴��Դϴ�.");
				}
			}else if(num1 ==2) {
				Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					name = (String)it.next();
					System.out.println(name+" : "+map.get(name));
				}
				System.out.println("1.���� 2.���� 3.������");
				System.out.println(">>> ");
				num2 = input.nextInt();
				if(num2 == 1) {
					System.out.println("���� �޴� �Է� : ");
					name = input.next();
					if(map.containsKey(name)) {
						System.out.println("���� ���� �Է� : ");
						String newmo;
						newmo = input.next();
						System.out.println(map.get(name)+"->"+newmo);
						map.put(name, newmo);
						System.out.println("���� �Ϸ� ! ! ");
					}else {
						System.out.println("�������� �ʴ� �޴�");
					}
				}else if(num2 ==2) {
					System.out.println("������ �޴� �̸� : ");
					name = input.next();
					if(map.containsKey(name)) {
						map.remove(name);
						System.out.println("���� �Ϸ�");
					}else {
						System.out.println("�������� �ʴ� �̸�");
					}
				}else {
					break;
				}
			}else {
				System.out.println("���α׷� ����");
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
