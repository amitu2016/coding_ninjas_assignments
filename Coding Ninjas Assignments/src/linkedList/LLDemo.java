package linkedList;

import java.util.ArrayList;

public class LLDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Amit");
		list.add("Kumar");
		list.add("Upadhyay");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.add(0,"Mr.");
		
		for (String i : list) {
			System.out.println(i);
		}
	
	}

}
