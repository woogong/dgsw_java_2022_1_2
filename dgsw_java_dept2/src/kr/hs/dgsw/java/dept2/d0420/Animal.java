package kr.hs.dgsw.java.dept2.d0420;

public class Animal {

	public void move() {
		System.out.println("움직입니다.");
	}

	public void eat(String food) {
		System.out.println(food + "을 먹습니다.");
	}
	
	public void birth() {
		System.out.println("새끼를 놓습니다.1adags");
	}
	
	public static void sample(Animal animal) {
		System.out.println(animal.toString());
		animal.birth();
	}
	
	public static void main(String[] args) {
		Dog happy = new Dog();
		happy.birth();
		happy.bark();
		
		Animal puppy = new Dog();
		puppy.birth();
		//puppy.bark();
		
		Animal.sample(puppy);
		
		//Bird swallow = new Dog();
	}
}






