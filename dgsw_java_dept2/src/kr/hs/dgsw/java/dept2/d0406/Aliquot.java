package kr.hs.dgsw.java.dept2.d0406;

import java.util.Scanner;

public class Aliquot {
	
	private final Scanner scanner;
	
	public Aliquot() {
		this.scanner = new Scanner(System.in);
	}

	public String findAliquots(int value) {
		StringBuilder buffer = new StringBuilder();
		
		for (int i = 1 ; i <= (value / 2) ; i++) {
			if (value % i == 0) {
				buffer.append(i).append(", ");
			}
		}
		
		buffer.append(value);
		
		return buffer.toString();
	}
	
	public int inputValue() {
		System.out.println("정수를 입력하세요.");
		return scanner.nextInt();
	}
	
	public void printResult(int value, String valuesStr) {
		System.out.printf("%d의 약수는 %s 입니다.", value, 
				valuesStr);
	}
	
	public void close() {
		scanner.close();
	}
	
	
	public static void main(String[] args) {
		
		Aliquot aliquot = new Aliquot();
		int value = aliquot.inputValue();
		String findingValues = aliquot.findAliquots(value);
		aliquot.printResult(value, findingValues);
	}
}
