package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main (String[] args) {
		
		Map<String,Integer> stringMap = new HashMap<>();
		stringMap.put("one",1);
		stringMap.put("two",2);
		
		Integer one = stringMap.get("one");
		Integer two = stringMap.get("two");
		
		System.out.println(stringMap.get("one"));
		System.out.println(two);
		
		stringMap.put("one",1000);
		System.out.println(stringMap.get("one"));
		
		
	}
}
