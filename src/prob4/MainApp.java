package prob4;

public class MainApp {
	public static void main(String[] args) {
            Stack stack = null;
			try {
				stack = new MyStack(3);
	            //Stack stackTest = new MyStack(-1);
			} catch (MyStackException e) {
				System.out.println(e.toString());
			}
            stack.push("Hello");
            stack.push("World");
            stack.push("!!!");
            //stack.push("java");
            //stack.push(".");

            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }

            System.out.println("======================================");

            try {
				stack = new MyStack(3);
			} catch (MyStackException e) {
				System.out.println(e.toString());
			}
            stack.push("Hello");

            System.out.println(stack.pop());
            System.out.println(stack.pop());
    }
}
