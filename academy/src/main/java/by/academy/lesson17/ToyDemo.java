package by.academy.lesson17;

import java.util.HashMap;
import java.util.Map;

public class ToyDemo {
	public static void main(String... args) {

		Map<String, Toy> toy = new HashMap<>();
		System.out.println(toy.isEmpty());
		toy.put("bob", new Toy("joj", "jij"));
		toy.put("ohhoh", new Toy("wwwwww", "WWWWW"));
		toy.put("sdffdfsfd", new Toy("rrrrrr", "RRRr"));

		for (Map.Entry<String, Toy> key : toy.entrySet()) {
			System.out.println(key);
		}
		for(String key : toy.keySet()) {
			System.out.println(key + toy.get(key));
		}
	}
}
