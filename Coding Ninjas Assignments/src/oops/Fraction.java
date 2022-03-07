package oops;

public class Fraction {

	private int numerator;
	private int denomenator;

	public Fraction(int numerator, int denomenator) {
		this.numerator = numerator;
		this.denomenator = denomenator;
		simplify();
	}

	public Fraction() {

	}

	private void simplify() {
		int gcd = 1;
		int smaller = Math.min(this.numerator, this.denomenator);

		for (int i = 2; i <= smaller; i++) {
			if (numerator % i == 0 && denomenator % i == 0) {
				gcd = i;
			}
		}

		numerator = numerator / gcd;
		denomenator = denomenator / gcd;

	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenomenator() {
		return denomenator;
	}

	public void setDenomenator(int denomenator) {
		this.denomenator = denomenator;
	}

	public void print() {
		System.out.println(numerator + " / " + denomenator);
	}

	public void increment() {
		numerator = numerator + denomenator;
		simplify();
	}

	public static Fraction add(Fraction f1, Fraction f2) {

		int newNum = (f1.numerator * f2.denomenator) + (f2.numerator * f1.denomenator);

		int newDen = f1.denomenator * f2.denomenator;
		
		Fraction f = new Fraction(newNum, newDen);

		return f;

	}

}
