package entities;

import model.services.Eccentricity;

public class Ellipse extends Shape implements Eccentricity{
	protected Double a;
	protected Double b;
	
	protected Eccentricity eccentricity;
	
	public Ellipse(Double a, Double b) {
		this.a = a; 
		this.b = b;
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
	
	public Double objEccentricity() {
		return Math.sqrt(1 - (Math.pow(this.a, 2.0)/Math.pow(this.b, 2.0))); 
	}
	
	public Double area() {
		return Math.PI * this.a * this.b; 
	}
	
	public Double perimeter() {
		return Math.PI*Math.sqrt(2*(Math.pow(this.a, 2) + Math.pow(this.b, 2)) - (Math.pow((this.a - this.b), 2))/2);
	}
	
	public String toString() {
		return "Area: " + this.area() + 
			   "Perimeter: " + this.perimeter() +
			   "Eccentricity: " + this.objEccentricity();
	}
}
