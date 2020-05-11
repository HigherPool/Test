package test.lx.com;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void printThingsUppercaseStrings (List things){
	    int i = 0;
	    try {
	        while(true){
	            Object o = things.get(i);
	            System.out.println(o);
	            if(o.getClass() == String.class){
	                String so = (String) o;
	                so = so.toUpperCase();
	                System.out.println(so);
	            }
	            i++;
	        }
	    } catch (IndexOutOfBoundsException e){
	        //iteration complete
	    }
	}
	
	public static void main(String[] args) {
		List things = new ArrayList();
		things.add(1);
		things.add("e");
		printThingsUppercaseStrings(things);
		
	}

}
