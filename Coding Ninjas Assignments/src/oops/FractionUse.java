package oops;

public class FractionUse {

	public static void main(String[] args) {

		Fraction f1 = new Fraction(2, 3);

		
		Fraction f2 = new Fraction(1, 2);
		
		Fraction f3 = Fraction.add(f1, f2);
		
		f3.print();
		

	}

	

	

}
