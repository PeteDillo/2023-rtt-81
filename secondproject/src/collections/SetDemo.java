package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("a");
		stringList.add("b");
		stringList.add("c");
		
		stringList.get(0);
		
		Set<String> stringSet = new HashSet<>();
		stringSet.add("a");
		stringSet.add("a");
		stringSet.add("b");
		stringSet.add("c");

		for (String string : stringSet) {
			System.out.println(string);
		}
		
		
	}
}
