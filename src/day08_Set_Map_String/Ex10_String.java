package day08_Set_Map_String;

public class Ex10_String {
	public static void main(String[] args) {
		
		String str = "   Have a nice day      ";
		String result = str.trim();    // trim = 양쪽에 있는 공백 제거
		System.out.println("1."+str);
		System.out.println("2."+result);
		
		
		
		// split = 어떤 값을 잘라주는것
		String[] split = result.split(" ");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(split[3]);
		
		String addr = "101/서울시/종로구/종로3가 100번지/4층";
		String[] ad = addr.split("/");
		for(int i=0; i<ad.length; i++) {
			System.out.println(ad[i]);
		}
		
		// replace = " " <= 이걸 " / " 이걸로 바꾼다
		String replace = result.replace(" ","+++");
		System.out.println(replace);
		
	}
}
