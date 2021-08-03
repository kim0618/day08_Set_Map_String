package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02_Set {
	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		
		arr.add("¿œ");
		arr.add("¿Ã");
		arr.add("ªÔ");
		
		Iterator it = arr.iterator();
		for(int i=0; i<=arr.size();i++) {
			if(it.hasNext() == true) {
			System.out.println(it.next());}
		}
		
		while(it.hasNext()==true) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
