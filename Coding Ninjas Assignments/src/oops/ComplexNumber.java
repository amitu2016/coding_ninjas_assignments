package oops;

public class ComplexNumber {

	private int real;
    private int img;
	
    public ComplexNumber() {
    	
	}

	public ComplexNumber(int real, int img) {
		this.real = real;
		this.img = img;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImg() {
		return img;
	}

	public void setImg(int img) {
		this.img = img;
	}

	public void plus(ComplexNumber c2) {
		this.real = this.real + c2.real;
		this.img = this.img + c2.img;
	}

	public void print() {
		
		System.out.println(real+" + i"+img);
	}

	public void multiply(ComplexNumber c2) {
		ComplexNumber c = new ComplexNumber();
		c.real = (this.real * c2.real) - (this.img * c2.img);
		c.img = this.real * c2.img + this.img * c2.real; 
		
		this.img = c.img;
		this.real = c.real;
	}
    
    
    
    
}
