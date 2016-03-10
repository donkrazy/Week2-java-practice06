package prob4;

public class MyStack implements Stack{
    private int capacity;

    public MyStack(int capacity) {
        if(capacity<0){
            System.out.println("capacity must be grater than 0");
            this.capacity = 0;
        }
        else{
            this.capacity = capacity;
        }
    }

    @Override
    public void push(String str) throws RuntimeException {

    }

    @Override
    public String pop() throws RuntimeException {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
