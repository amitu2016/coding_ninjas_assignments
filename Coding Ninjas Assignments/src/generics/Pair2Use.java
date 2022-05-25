package generics;

public class Pair2Use {

	public static void main(String[] args) {
		
		Pair2<String, Integer> pSI = new Pair2<>("aa",20);
		
		System.out.println(pSI.getFirst()+" "+pSI.getSecond());
		
		Pair2<String, String> pS = new Pair2<>("ab","bn");
		
		System.out.println(pS.getFirst()+" "+pS.getSecond());
		

	}

}
