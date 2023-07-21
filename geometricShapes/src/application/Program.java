package application;

import java.util.Scanner;

import entities.Ellipse;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ellipse sp = new Ellipse(5.0,5.0);
		
		System.out.println(sp.toString());
		
		sc.close();
	}

}
