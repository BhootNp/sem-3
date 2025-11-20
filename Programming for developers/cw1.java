//Write a java porogram to demonstrate basic stack operations like push, pop and peek using java stack class.
import java.util.Stack;
public class cw1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushing elements: " + stack);

        int topElement = stack.peek();
        System.out.println("Top element (peek): " + topElement);

        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after popping an element: " + stack);

        topElement = stack.peek();
        System.out.println("New top element (peek): " + topElement);
    }
}
