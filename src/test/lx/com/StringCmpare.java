package test.lx.com;

import java.util.ArrayList;
import java.util.List;

public class StringCmpare {

	public static void main(String[] args) {
		

		List<Student> students = new ArrayList<Student>();
		
		Student one = new Student("one", 10, 1111111111);
		Student two = new Student("two", 20, 222222222);
		Student three = new Student("three", 30, 333333333);
		
		students.add(one);
		students.add(two);
		students.add(three);
		
		List<Student> tests = new ArrayList<Student>();
		for (Student s : students) {
			Student test = new Student();
			test.setName(s.getName());
			test.setAge(s.getAge());
			test.setPhone(s.getPhone());
			tests.add(test);
		}
		
		for (Student d : tests) {
			System.out.println(d.getName());
		}
		
		
		List<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		String t = s.toString();
		String tt = tests.toString();
		
		System.out.println(s.size());
		System.out.println(t);
		System.out.println(tt);
		
	}

}
