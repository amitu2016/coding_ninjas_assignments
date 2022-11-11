package hashmap;

public class HashMapUse {

	public static void main(String[] args) {
		Map<String, Integer> map = new Map<>();
		
		map.insert("abc", 20);
		map.insert("def", 30);
		map.insert("ghi", 40);
		map.insert("jkl", 50);
		map.insert("mno", 60);
		map.insert("pqr", 70);
		map.insert("stu", 80);
		map.insert("abc", 90);
		map.insert("jkl", 120);
		map.insert("stu", 220);
		
		System.out.println("Size = "+map.size());
		
		System.out.println(map.getValue("stu"));
		
		System.out.println(map);
		
		map.removeKey("jkl");
		
		System.out.println("Size = "+map.size());
		
		
		

	}

}
