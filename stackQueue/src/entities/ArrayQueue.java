package entities;

import model.queue.Queue;

public class ArrayQueue implements Queue{
	private int queueArray[];
	private int arrayLenght;
	private int finalIndex;
	private boolean empty;
	
	public ArrayQueue() {
		this.arrayLenght = 3;
		this.queueArray = new int[arrayLenght];
		this.finalIndex = 0;
		this.empty = true;
	}
	
	public void add(int n) {
		
		if(finalIndex != arrayLenght)
		{
			this.queueArray[finalIndex] = n;
			finalIndex++;
		}
		else 
		{
			this.arrayLenght = this.arrayLenght * 2;
			int newArray[] = new int[this.arrayLenght];
			for(int i=0; i< this.finalIndex; i++) {
				newArray[i] = this.queueArray[i];
			}
			newArray[finalIndex] = n;
			this.queueArray = newArray;
			finalIndex++;
		}
	}	
	
	public void remove() {
		if(this.empty) {
			System.out.println("YOU cant remove");
		}
		else {
			int removed = this.queueArray[0];
			for(int i=1; i<this.finalIndex; i++) {
				this.queueArray[i-1] = this.queueArray[i];
			}
			this.finalIndex--;
			System.out.printf("Number %d was removed.\n", removed);
		}
	}
	
	public void printQueue() {
		for(int i=0; i<this.finalIndex; i++) {
			System.out.printf("%d ", this.queueArray[i]);
		}
		System.out.println("\n");
	}
	

}
