package entities;

import exceptions.IsEmptyException;
import model.queue.Queue;

public class ArrayStack implements Queue{
	private int headStack;
	private int[] stackArray;
	private int arrayLength;
	
	public ArrayStack(){
		this.arrayLength = 3;
		this.stackArray = new int[arrayLength];
		this.headStack = -1;
	}
	//push a element to top
	public void add(int n) {
		if((headStack + 1)!=arrayLength) 
		{
			this.stackArray[headStack + 1] = n;
			this.headStack++;
		}
		else
		{
			this.arrayLength = 2*this.arrayLength;
			int newArray[] = new int[this.arrayLength];
			
			for(int i=0; i<=headStack; i++) 
			{
				newArray[i] = stackArray[i];
			}
			
			newArray[headStack + 1] = n;
			this.headStack++;
			this.stackArray = newArray;
		}
	}
	//pop a element from top
	public void remove() throws IsEmptyException {
		int removed;
		if(this.isEmpty()) 
		{
			throw new IsEmptyException("Warning: empty list, you can't remove.\n");
		}
		else if(arrayLength > 1)
		{
			removed = stackArray[headStack];
			int newArray[] = new int[arrayLength - 1];
			
			for(int i=0; i<headStack; i++) 
			{
				newArray[i] = this.stackArray[i];
			}
			
			this.stackArray = newArray;
			this.headStack--;
			System.out.printf("Number %d was removed.\n", removed);
		}
		else
		{
			int newArray[] = new int[3];
			this.stackArray = newArray;
			headStack--;
		}
	}
	//verify is the stack is empty
	public boolean isEmpty() {
		if(headStack < 0)
		{
			return true;
		}
		return false;
	}
	
	//print stack
	public void printQueue() {
		for(int i=0; i<=this.headStack; i++) 
		{
			System.out.printf("%d ", this.stackArray[i]);
		}
		System.out.println("\n");
	}
}
