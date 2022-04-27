package kr.hs.dgsw.java.dept2.d0323;

public class DataTypeStudy {

	public void studyInteger() {
		byte byteValue = -128;
		short shortValue = 1;
		int intValue = 2100000000;
		long longValue = 10000000000L;
	}

	public void studyReal() {
		float floatValue = 123453.14159261234567890F;
		double doubleValue = 123453.14159261234567890;
		
		System.out.println(floatValue);
		System.out.println(doubleValue);
	}
	
	public void studyBoolean() {
		
		boolean b1 = (4 > 2);
		boolean b2 = (3 == 2);
		
		System.out.println(b1);
		System.err.println(b2);
		
		if (false) {
			System.out.println("OK");
		}
		
	}
	
	public void studyChar() {
		char ch1 = 'a';
		char ch2 = 'a' + 1;
		int ch3 = 65;
		
		char ch4 = 'ㄱ';
		char ch5 = '天';
		
		

		System.out.println((int)ch1);
		System.out.println(ch2);
		System.out.println((char)ch3);
		System.out.println(ch4 + "  " + (int)ch4);
		System.out.println(ch5 + "  " + (int)ch5);
		System.out.println((char)(ch4 + 1) + "  " + (int)(ch4 + 1));
		
		int countOfHangeulCode = '힣' -'가' + 1;
		System.out.println("한글코드의 개수 : " + countOfHangeulCode);
		
		for (char ch = '가' ; ch < '고' ; ch++) {
			System.out.printf("%d - %c\n", (int)ch, ch);
		}
		
		
	}
	
	public void printAscii() {
		
		for (int i = 0 ; i < 256 ; i++) {
			char ch = (char)i;
			
			System.out.printf("%d - %c\n", i, ch);
		}
		
	}
	
	

	public static void main(String[] args) {
		DataTypeStudy study = new DataTypeStudy();
		study.studyChar();
		//study.printAscii();
	}
}







