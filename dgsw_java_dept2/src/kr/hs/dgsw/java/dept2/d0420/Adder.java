package kr.hs.dgsw.java.dept2.d0420;

import java.util.Scanner;

public class Adder {

	protected final Scanner scanner;
	
	public Adder() {
		this.scanner = new Scanner(System.in);
	}
	
	public void execute() {
		/* �� ������ �Է� �޴´�. */
		Values values = this.inputValues();
		
		/* ����� �����Ѵ�. */
		int result = this.calculate(values);
		
		/* ����� ����Ѵ�. */
		this.showResult(values, result);
		
		/* ���� �ڿ��� �����Ѵ�. */
		this.scanner.close();
	}
	
	public Values inputValues() {
		System.out.println("�� ������ �Է��ϼ���.");
		
		Values values = new Values();
		
		values.setValue1(this.scanner.nextInt());
		values.setValue2(this.scanner.nextInt());
		
		return values;
	}
	
	public int calculate(Values values) {
		return values.getValue1() + values.getValue2();
	}
	
	public void showResult(Values values, int result) {
		System.out.printf("%d %s %d = %d\n", values.getValue1(),
				getOperator(), values.getValue2(), result);
	}
	
	public String getOperator() {
		return "+";
	}
	
	public class Values {
		private int value1;
		
		private int value2;

		public int getValue1() {
			return value1;
		}

		public void setValue1(int value1) {
			this.value1 = value1;
		}

		public int getValue2() {
			return value2;
		}

		public void setValue2(int value2) {
			this.value2 = value2;
		}
	}
	
	public static void main(String[] args) {
		Adder adder = new Adder();
		adder.execute();
	}
	

}



