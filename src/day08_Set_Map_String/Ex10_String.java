package day08_Set_Map_String;

public class Ex10_String {
	public static void main(String[] args) {
		
		String str = "   Have a nice day      ";
		String result = str.trim();    // trim = ���ʿ� �ִ� ���� ����
		System.out.println("1."+str);
		System.out.println("2."+result);
		
		
		
		// split = � ���� �߶��ִ°�
		String[] split = result.split(" ");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(split[3]);
		
		String addr = "101/�����/���α�/����3�� 100����/4��";
		String[] ad = addr.split("/");
		for(int i=0; i<ad.length; i++) {
			System.out.println(ad[i]);
		}
		
		// replace = " " <= �̰� " / " �̰ɷ� �ٲ۴�
		String replace = result.replace(" ","+++");
		System.out.println(replace);
		
	}
}
