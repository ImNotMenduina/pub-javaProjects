package entities;

public class Rectangle extends Shape{
	protected Double l;
	protected Double c;
	
	public Rectangle(Double l, Double c) {
		this.l = l;
		this.c = c;
	}
	
	public Double area() {
		return this.c * this.l;
	}
	
	public Double perimeter() {
		return 2*(this.c + this.l);
	}
	
	public String toString() {
		return "Area: " + this.area() +
			   "Perimeter: " + this.perimeter();
	}
}
