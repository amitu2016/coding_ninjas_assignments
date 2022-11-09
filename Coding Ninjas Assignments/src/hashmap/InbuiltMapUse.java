package hashmap;

import java.util.HashMap;
import java.util.Set;

public class InbuiltMapUse {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		//Insert
		map.put("amit", 100);
		map.put("sumit", 200);
		
		//Size
		System.out.println(map.size());
		
		//Presence
		if(map.containsKey("amit")) {
			System.out.println("amit is present");
		}
		
		if (map.containsKey("kumar")) {
			System.out.println("Kumar is present");
		}
		
		int val = 0;
		//Get value
		if(map.containsKey("kumar")) {
			val = map.get("kumar");
		}
		
		System.out.println(val);
		
		//Remove
		map.remove("sumit");
		System.out.println(map.size());
		if(map.containsKey("sumit")) {
			System.out.println("sumit is present");
		}
		
		//Iterate
		Set<String> keys = map.keySet();
		System.out.println("Keys");
		for(String s: keys) {
			System.out.println(s);
		}

	}

}
