package test.lx.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListTest {
	
	public static void main(String[] args) {
		
		List<Map<String, Integer>> lists = new ArrayList<Map<String, Integer>>();
		
		
		
		for (int i = 1; i < 4; i++) {
			Map<String, Integer> map = new HashMap<String, Integer>();
			map.put("name", i);
			map.put("age", i*10);
			map.put("phone", i*100);
			lists.add(map);
			
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("name", 2);
		map.put("age", 2*10);
		map.put("phone", 2*100);
		lists.add(map);
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("name", 3);
		map1.put("age", 3*10);
		map1.put("phone", 3*100);
		lists.add(map1);
		
		String index = "";
		List<Map<String, Integer>> out = new ArrayList<Map<String, Integer>>();
		for (Map<String, Integer> m : lists) {
			String name = String.valueOf(m.get("name"));
			if (index.contains(name)) {
				System.out.println(name + "——————————");
				for (Map<String, Integer> o : out) {
					if (String.valueOf(o.get("name")).equals(name)) {
						o.put("age" ,m.get("age") + o.get("age"));
						o.put("phone" ,m.get("phone") + o.get("phone"));
					}
				}
				
			} else {
				if (index != "") {
					index += ",";
				}
				index += name;
				out.add(m);
			}
		}
		System.out.println(index);
		System.out.println(lists.toString());
		System.out.println(out.toString());

	}
	

}
