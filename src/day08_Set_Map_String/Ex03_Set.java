package day08_Set_Map_String;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Set {
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		set.add("일");
		set.add("이");
		set.add("삼");
		System.out.println("set : "+set);
		
		Iterator it = set.iterator();
		// String s = (String)it.next();  <- 문자열로 처리해야 할때
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
