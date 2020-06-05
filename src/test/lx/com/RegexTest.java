package test.lx.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	
	public static void main(String[] args) {
		
		String regex = "td";
		String test = "dcatdddd12ddlljdnf"; 
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(test);
		
		System.out.println(m.find( ));

		
	}

}
