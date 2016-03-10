package prob4;

public class MyStack implements Stack{
    private int capacity;
    private int size;
    private String[] buffer;

    public MyStack(int capacity) throws MyStackException {
        if(capacity<=0){
        	throw new MyStackException("capacity must be grater than 0");
        }
        else{
            this.capacity = capacity;
            this.buffer = new String[capacity];
            size = 0;
        }
    }

    @Override
    public void push(String str) throws RuntimeException {
    	if(capacity==size){
    		throw new RuntimeException("stack overflow");
    	}
		buffer[size] = str;
    	size++;
    }

    @Override
    public String pop() throws RuntimeException {
    	if(size==0){
    		throw new RuntimeException("stack is void");
    	}
    	String output = buffer[size-1];
    	buffer[size-1] = null;
    	size--;
    	return output;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }
}
