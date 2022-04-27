package kr.hs.dgsw.java.dept2.d0420;

public class Subtractor extends Adder {

	@Override
	public int calculate(Values values) {
		return values.getValue1() - values.getValue2();
	}
	
	@Override
	public String getOperator() {
		return "-";
	}
	
	public static void main(String[] args) {
		Subtractor subtractor = new Subtractor();
		subtractor.execute();
	}
}
