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
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3.종 료");
			System.out.println(">>> ");
			n1 = input.nextInt();
			if(n1 == 3 ) {
				System.out.println("프로그램 종료");
				break;
			}
			switch(n1) {
			case 1:
				System.out.println("메뉴 입력 : ");
				k = input.next();
				if(map.containsKey(k) == false) {
				System.out.println("가격 입력 : ");
				v = input.next();
				map.put(k,v);
				System.out.println("등록 완료 ! ! ");
				}else {
					System.out.println("존재하는 메뉴입니다.");
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
