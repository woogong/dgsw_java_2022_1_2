package kr.hs.dgsw.java.dept2.d0518;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divider {
	
	private final Scanner scanner;
	
	public Divider() {
		this.scanner = new Scanner(System.in);
	}
	
	private int calculate(int value1, int value2) {
		return value1 / value2;
	}
	
	private void execute() {
		try {
			System.out.println("�� ������ �Է��ϼ���.");
			
			int value1 = scanner.nextInt();
			int value2 = scanner.nextInt();
			
			int result = calculate(value1, value2);
			System.out.printf("%d / %d = %d\n", value1, value2, result);

			saveResult(value1, value2, result);
			
			System.out.println("���α׷��� �����մϴ�.");
			
		} catch (InputMismatchException e) {
			System.out.println("���ڰ� �ƴ� ���ڸ� �Է��ϼ���.");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} catch (Exception e) {
			
		} finally {
			this.scanner.close();
		}


		/*catch (Exception e) {
			//System.out.println("���ܰ� �߻��߽��ϴ�.  " + e);
			if (e instanceof InputMismatchException) {
				System.out.println("���ڰ� �ƴ� ���ڸ� �Է��ϼ���.");
			} else if (e instanceof ArithmeticException) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
		}*/
	}
	
	private static final String FILE_PATH = "C:/90_ETC/javaStudy/result.txt";
	
	private void saveResult(int value1, int value2, int result) {
		String str = String.format("%d / %d = %d\n", value1, value2, result);

		OutputStream os = null;
		try {
			File file = new File(FILE_PATH);
			os = new FileOutputStream(file);

			os.write(str.getBytes());
		} catch (IOException e) {
			System.out.println("������ �������� ���߽��ϴ�.");
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {}
			}
		}
	}
	
	public static void main(String[] args) {
		new Divider().execute();
	}
	
}
