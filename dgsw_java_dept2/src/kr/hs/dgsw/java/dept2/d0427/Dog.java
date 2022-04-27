package kr.hs.dgsw.java.dept2.d0427;

public class Dog extends Animal {

	@Override
	public String getName() {
		return "碍酒瘤";
	}
	
	@Override
	public String makeSound() {
		return "港港";
	}
	
	public void eat() {
		System.out.println("客备客备 冈嚼聪促.");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Animal dog1 = new Dog();
		dog1.move();
	}
	
	
	
	
	
	
}
