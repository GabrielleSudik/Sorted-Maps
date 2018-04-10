import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		//a problem with hashmaps is they don't retain things in any particular order
		//sometimes they do, then randomly they don't.
		//but there are ways around this...
		
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		//like hashmap but a list is linked to the hashmap,
		//so key-values stay in the order you add them.
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		//this sorts items in "natural order"
		//stuff like 1, 2, 3 ... a,b,c ...
		//it'll sort by key
		
		testMap(hashMap);
		testMap(linkedHashMap);
		testMap(treeMap);
		
		//another way to instantiate all of those are:
		Map<Integer, String> hashMap2 = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap2 = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap2 = new TreeMap<Integer, String>();

	}
	
	public static void testMap(Map<Integer, String> map) {
		//let's explore the differences with a method.
		
		//first some items for the maps:
		map.put(9, "rabbit");
		map.put(4, "cow");
		map.put(8, "fox");
		map.put(1, "cockroach");
		map.put(0, "goose");
		map.put(15, "duck");
		map.put(6, "dog");
		
		//now the method:
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
		
	}

}


