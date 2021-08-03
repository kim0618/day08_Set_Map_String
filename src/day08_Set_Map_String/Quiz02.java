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
			else if(num1==2) {
				Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					name = (String)it.next();
					System.out.println(name+" : "+map.get(name));
				}
				System.out.println("1.수정 2.삭제 3.나가기");
				num2 = input.nextInt();
				if(num2 == 1) {
					System.out.println("변경 메뉴 이름 입력 : ");
					name = input.next();
					if(map.containsKey(name)) {
						System.out.println("수정 가격 입력 : ");
						String newmoney;
						newmoney = input.next();
						System.out.println(map.get(name)+" -> "+newmoney);
						System.out.println("변경 됐습니다.!!!");
						map.replace(name, newmoney);
					}else {
						System.out.println("메뉴가 없습니다.");
					}
				}else if(num2 == 2) {
					System.out.println("삭제할 이름 입력 : ");{
						name = input.next();
						if(map.containsKey(name)) {
							map.remove(name);
							System.out.println(name+"삭제완료");
						}else {
							System.out.println(name+" 메뉴는 존재하지않습니다");
						}
					}
				}
				else break;
			}
			if(num2 ==3 );
			System.out.println("종료");
			break;
		}*/
		
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		String name=null,money=null;
		int num1 = 0;
		int num2 = 0;
		
		while(true) {
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3.종료");
			System.out.println(">>> ");
			num1 = input.nextInt();
			if(num1 == 1) {
				System.out.println("메뉴 입력 : ");
				name = input.next();
				if(map.containsKey(name)==false) {
					System.out.println("가격 입력 : ");
					money = input.next();
					map.put(name, money);
					System.out.println("등록 성공");
				}else {
					System.out.println("존재하는 메뉴입니다.");
				}
			}else if(num1 ==2) {
				Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					name = (String)it.next();
					System.out.println(name+" : "+map.get(name));
				}
				System.out.println("1.수정 2.삭제 3.나가기");
				System.out.println(">>> ");
				num2 = input.nextInt();
				if(num2 == 1) {
					System.out.println("변경 메뉴 입력 : ");
					name = input.next();
					if(map.containsKey(name)) {
						System.out.println("수정 가격 입력 : ");
						String newmo;
						newmo = input.next();
						System.out.println(map.get(name)+"->"+newmo);
						map.put(name, newmo);
						System.out.println("변경 완료 ! ! ");
					}else {
						System.out.println("존재하지 않는 메뉴");
					}
				}else if(num2 ==2) {
					System.out.println("삭제할 메뉴 이름 : ");
					name = input.next();
					if(map.containsKey(name)) {
						map.remove(name);
						System.out.println("삭제 완료");
					}else {
						System.out.println("존재하지 않는 이름");
					}
				}else {
					break;
				}
			}else {
				System.out.println("프로그램 종료");
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
