package application;

import java.util.Scanner;

import entities.ArrayQueue;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayQueue newArray = new ArrayQueue();
		
		newArray.remove();
		newArray.add(1);
		newArray.add(2);
		newArray.add(3);
		newArray.add(4);
		newArray.printQueue();
		newArray.remove();
		newArray.remove();
		newArray.remove();
		newArray.remove();
		newArray.printQueue();
		newArray.remove();
		sc.close();
	}

}
