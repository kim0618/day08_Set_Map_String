package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		int n1;
		
		String k = null, v=null;
		
		while(true) {
			System.out.println("1.�޴� ���");
			System.out.println("2.�޴��� ���� ����");
			System.out.println("3.�� ��");
			System.out.println(">>> ");
			n1 = input.nextInt();
			if(n1 == 3 ) {
				System.out.println("���α׷� ����");
				break;
			}
			switch(n1) {
			case 1:
				System.out.println("�޴� �Է� : ");
				k = input.next();
				if(map.containsKey(k) == false) {
				System.out.println("���� �Է� : ");
				v = input.next();
				map.put(k,v);
				System.out.println("��� �Ϸ� ! ! ");
				}else {
					System.out.println("�����ϴ� �޴��Դϴ�.");
				}
			case 2:
				Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					k=(String)it.next();
				System.out.println(k+" : "+map.get(k));}
			}
		}
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
