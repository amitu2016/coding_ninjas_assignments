package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacters {

	public static String uniqueChar(String str){
		char arr[] = str.toCharArray();
		HashMap<Character, Boolean> map = new HashMap<>();
		ArrayList<Character> output = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				continue;
			}
			output.add(arr[i]);
			map.put(arr[i], true);
		}
		String res = output.stream().map(Object::toString)
                .collect(Collectors.joining(""));
		
		return res;

	}
	
	public static void main(String[] args) {
		String str = "ababacd";
		System.out.println(uniqueChar(str));

	}

}
