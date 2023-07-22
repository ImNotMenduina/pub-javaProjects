package model.queue;

public interface Queue {
	public abstract void add(int n);
	public abstract void remove();
	public abstract boolean isEmpty();
}
