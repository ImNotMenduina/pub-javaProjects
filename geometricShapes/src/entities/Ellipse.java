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
		this.sortValues(); // it's going to put the bigger value in 'a', and the lower in 'b'
		return Math.sqrt(1.0 - Math.pow(this.b, 2) / Math.pow(this.a, 2)); 
	}
	
	public Double area() {
		return Math.PI * this.a * this.b; 
	}
	
	public Double perimeter() {
		return Math.PI*Math.sqrt(2*(Math.pow(this.a, 2) + Math.pow(this.b, 2)) - (Math.pow((this.a - this.b), 2))/2);
	}
	
	public void sortValues() {
		if(this.a < this.b) {
			Double aux = this.a;
			this.a = this.b;
			this.b = aux;
		}
	}
	
	public String toString() {
		return "a: " + this.getA() + "\n" +
			   "b: " + this.getB() + "\n" +
			   "Area: " + this.area() + "\n" + 
			   "Perimeter: " + this.perimeter() + "\n" +
			   "Eccentricity: " + this.objEccentricity() + "\n";
	}
}
