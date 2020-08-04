package test.lx.impl;

public class Cat implements Animal {

	private String name;
	
	public Cat() {}

	public Cat(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("Cat Eat!");
	}

	@Override
	public void drink() {
		System.out.println("Cat Drink!");
	}

	public void talk() {
		System.out.println(this.name + " MIAO MIAO");
	}

}
