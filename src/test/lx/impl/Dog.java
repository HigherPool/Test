package test.lx.impl;

public class Dog implements Animal {
	
	private String name;
	
	public Dog() {}
	
	public Dog(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("Dog Eat!");
	}

	@Override
	public void drink() {
		System.out.println("Dog Drink!");
	}
	
	public void talk() {
		System.out.println(this.name + " Wang wang!");
	}

}
