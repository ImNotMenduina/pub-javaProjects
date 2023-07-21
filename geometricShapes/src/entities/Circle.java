package entities;

public class Circle extends Ellipse {
	
	public Circle(Double a, Double b) {
		super(a, b);
	}
	
	public void setA(Double a) {
		this.a = a;
	}
	
	public Double getA() {
		return this.a;
	}
	
	public void setB(Double b) {
		this.b = b;
	}
	
	public Double getB() {
		return this.b;
	}
}
