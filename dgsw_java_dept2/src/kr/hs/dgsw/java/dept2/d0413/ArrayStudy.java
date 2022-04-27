package kr.hs.dgsw.java.dept2.d0413;

public class ArrayStudy {

	public void studyArray() {
		/* 배열의 선언 */
		{
			int[] array1;
			int array2[];
		}
		
		/* 배열의 정의 */
		{
			String[] countries = new String[5];
			
			countries[0] = "Korea";
			countries[1] = "Germany";
			
			//countries[5] = "Japan";
		}
		
		/* 배열의 초기값 */
		{
			int[] intArray = new int[1];
			double[] doubleArray = new double[1];
			boolean[] booleanArray = new boolean[1];
			String[] stringArray = new String[1];
			
			System.out.println("int : " + intArray[0]);
			System.out.println("double : " + doubleArray[0]);
			System.out.println("boolean : " + booleanArray[0]);
			System.out.println("String : " + stringArray[0]);
		}
		
		/* 배열의 초기화 */
		{
			String[] colors = {"red", "green", "blue", "magenta"};
			int[] numbers = {1, 2, 3, 5, 8};
		}
		
		/* Loop */
		{
			String[] colors = {"red", "green", "blue", "magenta", "pink"};

			for (int i = 0 ; i < colors.length ; i++) {
				System.out.printf("%d - %s\n", i, colors[i]);
			}
			
			for (String color : colors) {
				System.out.println(color);
			}
		}
	
		/* 평균값 구하기 */
		int[] ages = {18, 20, 52, 31, 8, 13, 22, 31, 3, 12};
		
		double average = 0;
		
		double total = 0;
		for (int age : ages) {
			total += age;
		}
		average = total / (double)ages.length;
		
		System.out.printf("나이 평균 : %.2f\n", average);
		
		/* */
		{
			int value1 = 3;
			int value2 = value1;
			value2 = 10;
			
			System.out.println("int : " + value1 + "  " + value2);
			
			int[] array1 = {1, 2, 3};
			int[] array2 = array1;
			int[] array3 = copy(array1);
			array2[1] = 100;
			
			System.out.println("array : " + array1[1] + 
					"  " + array2[1] + "  " + array3[1]);
		}
	}
	
	public int[] copy(int[] src) {
		int[] result = new int[src.length];
		
		for (int i = 0 ; i < src.length ; i++) {
			result[i] = src[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		ArrayStudy study = new ArrayStudy();
		study.studyArray();
	}
	
}





