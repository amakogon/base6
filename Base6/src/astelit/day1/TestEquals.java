package astelit.day1;

public class TestEquals {
	public static void main(String[] args) {
//		==
		
		int a = 2;
		if (a == 2) {
			System.out.println("sadsa");
		}
		
		String s1 = new String("qwe");
		String s2 = new String("qwe");
		String s3 = s1;
		
		if(s1.equals(s3)) {
			System.out.println("true");
		}
		
	}
}
