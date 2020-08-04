package test.lx.impl;

public class Test {
	
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		cat.eat();
		dog.eat();
		cat.drink();
		dog.drink();
//		cat.talk();
//		dog.talk();   error
		
		Cat cat1 = new Cat("cat1");
		Dog dog1 = new Dog("dog1");
		
		cat1.talk();
		dog1.talk();
		
		
	}

}
