package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Shape;
import model.tests.TestShapes;

public class DownCastingTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Shape> shapes = new ArrayList<>();
		
		System.out.println("List size : ");
		int n = sc.nextInt();
		
		shapes = TestShapes.createShapes(n);
		
		for(Shape shape : shapes) {
			System.out.println(shape.toString());
		}
		
		sc.close();
	}
}
