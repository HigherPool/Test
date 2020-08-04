package test.lx.abst;

public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("Dog Eat!");
	}

	@Override
	public void drink() {
		System.out.println("Dog Drink!");
	}

	public void talk() {
		System.out.println("WANG WANG!");
	}
}
