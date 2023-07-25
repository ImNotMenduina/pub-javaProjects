package model.queue;

import exceptions.IsEmptyException;

public interface Queue {
	public abstract void add(int n);
	public abstract void remove() throws IsEmptyException;
	public abstract boolean isEmpty();
}
