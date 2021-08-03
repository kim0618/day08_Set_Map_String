package day08_Set_Map_String;

import java.util.ArrayList;

public class Quiz04 {
	public static void main(String[] args) {
		
		//1번
		String str = new String("Have a nice day Have a nice day Have a nice day");
		int i=0;
		ArrayList ass = new ArrayList();
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				ass.add(i);
			}
		}System.out.println("결과 : "+ass);
		
		
		//2번
		String str1 = new String("It if a fun java programming");
		int j=0;
		int a=0,g=0,sum=0;
		while(j<str1.length()) {
			if(str1.charAt(j)=='a') {
				a++;
			}else if(str1.charAt(j)=='g') {
				g++;
			}
			j++;
		}
		System.out.println("총 개수 : "+str1.length());
		System.out.println("a 개수 : "+a);
		System.out.println("g 개수 : "+g);
		
		
		//3번
		String str2 = new String("tESt sTring   change     first");
		String changeStr = new String();
		int k=0;

		str2 = str2.toLowerCase();
		if(str2.charAt(0) >='a' && str2.charAt(0) <='z') {
			changeStr+=(char)(str2.charAt(k)-32);
			k++;
		}
		while(k<str2.length()) {
			if(str2.charAt(k) != ' ') {
				changeStr+=str2.charAt(k);
				k++;
				continue;
			}
			while(str2.charAt(k) == ' ') {
				changeStr+=str2.charAt(k);
				k++;
			}
			if(str2.charAt(k) >= 'a' &&str2.charAt(k) <='z')
				changeStr+=(char)(str2.charAt(k)-32);
			k++;
		}
		System.out.println("변경 전 : "+str2);
		System.out.println("변경 후 : "+changeStr);
		System.out.println("종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
