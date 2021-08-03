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
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3.종료");
			System.out.println(">>> ");
			num1 = input.nextInt();
			if(num1 == 1) {
				System.out.println("메뉴 입력 : ");
				name = input.next();
				if(map.containsKey(name) == false) {
					System.out.println("가격 입력 : ");
					money = input.next();
					map.put(name, money);
					System.out.println("등록 완료");
				}else {
					System.out.println("메뉴가 존재합니다.");
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
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
