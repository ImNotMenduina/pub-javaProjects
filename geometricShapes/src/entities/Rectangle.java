package entities;

public class Rectangle extends Shape{
	protected Double l;
	protected Double c;
	
	public Rectangle(Double l, Double c) {
		this.l = l;
		this.c = c;
	}
	
	public Double getL() {
		return l;
	}

	public void setL(Double l) {
		this.l = l;
	}

	public Double getC() {
		return c;
	}

	public void setC(Double c) {
		this.c = c;
	}

	public Double area() {
		return this.c * this.l;
	}
	
	public Double perimeter() {
		return 2*(this.c + this.l);
	}
	
	public String toString() {
		return "a: " + this.getL() + "\n" + 
			   "b: " + this.getC() + "\n" +
			   "Area: " + this.area() + "\n" +
			   "Perimeter: " + this.perimeter() + "\n";
	}
}
