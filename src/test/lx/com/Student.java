package test.lx.com;

public class Student {
	
	private String name;
	private int age;
	private int phone;
	
	public Student() {
		
	}
	
	public Student(String name, int age, int phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	

}
