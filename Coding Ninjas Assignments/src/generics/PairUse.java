package generics;

public class PairUse {

	public static void main(String[] args) {
		
		Pair<Integer> pI = new Pair<Integer>(10,20);
		System.out.println(pI.getFirst()+ " "+pI.getSecond());
		
		Pair<String> pS = new Pair<String>("aa", "bb");
		System.out.println(pS.getFirst()+ " "+pS.getSecond());
		
		Pair<Double> pD = new Pair<Double>(10.2,20.5);
		System.out.println(pD.getFirst()+ " "+pD.getSecond());

	}

}
