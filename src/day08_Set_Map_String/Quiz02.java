package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		String name=null,money=null;
		int num1=0;
		
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
			if(num1==2) {
				Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					name = (String)it.next();
					System.out.println(name+" : "+map.get(name));
				}
			}
			if(num1 == 3) {
				System.out.println("���α׷� ����");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
