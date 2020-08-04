package test.lx.abst;

public class Cat extends Animal{

	public void eat() {
		System.out.println("Cat Eat!");
	}

	@Override
	public void drink() {
		System.out.println("Cat Drink!");
	}
	
	public void talk() {
		System.out.println("MAIO MIAO!");
	}

}
