package dsa;

public class MainApp {
	public static void main(String[] args) {
		StackX stack1 = new StackX(5);
		
		System.out.println(stack1.peek());
		System.out.println(stack1.pop());
		
		stack1.push(4);
		stack1.push(2);
		stack1.push(1);
		stack1.push(5);
		stack1.push(6);
		
		System.out.println(stack1.peek());
		
		while(!stack1.isEmpty())
			System.out.println(stack1.pop());
		
		System.out.println(stack1.peek());
		System.out.println(stack1.pop());
	}
}
