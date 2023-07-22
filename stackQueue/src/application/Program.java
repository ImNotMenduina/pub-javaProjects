package application;

import java.util.Scanner;

import entities.ArrayQueue;
import entities.ArrayStack;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayStack newStack = new ArrayStack();
		System.out.println("======== STACK =======\n");
		newStack.remove();
		newStack.add(1);
		newStack.add(2);
		newStack.add(3);
		newStack.add(4);
		newStack.add(1);
		newStack.add(2);
		newStack.add(3);
		newStack.add(4);
		newStack.add(1);
		newStack.add(2);
		newStack.add(3);
		newStack.add(4);
		newStack.printQueue();
		newStack.remove();
		newStack.remove();
		newStack.remove();
		newStack.remove();
		newStack.remove();
		newStack.remove();
		newStack.remove();
		newStack.remove();
		newStack.remove();
		newStack.remove();
		newStack.remove();
		newStack.remove();
		newStack.printQueue();
		newStack.remove();
		
		
		ArrayQueue newQueue = new ArrayQueue();
		System.out.println("======== QUEUE =======");
		newQueue.remove();
		newQueue.add(1);
		newQueue.add(2);
		newQueue.add(3);
		newQueue.add(4);
		newQueue.add(1);
		newQueue.add(2);
		newQueue.add(3);
		newQueue.add(4);
		newQueue.add(1);
		newQueue.add(2);
		newQueue.add(3);
		newQueue.add(4);
		newQueue.printQueue();
		newQueue.remove();
		newQueue.remove();
		newQueue.remove();
		newQueue.remove();
		newQueue.remove();
		newQueue.remove();
		newQueue.remove();
		newQueue.remove();
		newQueue.remove();
		newQueue.remove();
		newQueue.remove();
		newQueue.remove();
		newQueue.printQueue();
		
		sc.close();
	}

}
