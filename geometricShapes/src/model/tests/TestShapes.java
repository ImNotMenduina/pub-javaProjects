package model.tests;

import java.util.ArrayList;
import java.util.Random;

import entities.Circle;
import entities.Ellipse;
import entities.Rectangle;
import entities.Shape;
import entities.Square;

public class TestShapes {
	
	public static ArrayList<Shape> createShapes (int size){
		ArrayList<Shape> listOfShapes = new ArrayList<Shape>();
		
		Random rand = new Random();
		
		for(int i=0 ; i<size; i++) {
			int shape = rand.nextInt(4);
			
			switch(shape) {
			case 0: //Ellipse
				listOfShapes.add(new Ellipse(rand.nextDouble(10.0), rand.nextDouble(10.0)));
				break;
			case 1://Circle
				Double radius = rand.nextDouble(10.0);
				listOfShapes.add(new Circle(rand.nextDouble(radius), rand.nextDouble(radius)));
				break;
			case 2: //Rectangle
				listOfShapes.add(new Rectangle(rand.nextDouble(10.0),rand.nextDouble(10.0)));
				break;
			case 3://Square
				Double length = rand.nextDouble(10.0);
				listOfShapes.add(new Square(length, length));
				break;
			}
		}
		
		return listOfShapes;
	}
}
