package test.lx.abst;

public class Test {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();

		cat.eat();
		dog.eat();
		cat.drink();
		dog.drink();
		
		
		Cat cat1 = new Cat();
		Dog dog1 = new Dog();
		
		cat1.talk();
		dog1.talk();
		
		
	}

}
