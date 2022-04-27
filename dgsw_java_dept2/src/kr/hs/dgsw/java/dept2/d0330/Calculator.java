package kr.hs.dgsw.java.dept2.d0330;

import java.util.Scanner;

public class Calculator {
	private final String operator;
	
	private int operand1;
	
	private int operand2;
	
	private final Scanner scanner;
	
	public Calculator(String operator) {
		this.operator = operator;
		this.scanner = new Scanner(System.in);
	}
	
	public void execute() {
		// TODO
		
		this.scanner.close();
	}
	
	public static void main(String[] args) {
		String operator = args.length > 0 ? args[0] : "*";
		
		Calculator calculator = new Calculator(operator);
		calculator.execute();
		
	}
	
}




