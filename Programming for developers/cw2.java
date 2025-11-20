//Implement a stack using array in Java. Include methods for push, pop, peek and checking if the stack is empty or full.

public class cw2 {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public cw2(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // Push method to add an element to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stack[++top] = value;
    }

    // Pop method to remove and return the top element of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1; // Return -1 to indicate an error
        }
        return stack[top--];
    }

    // Peek method to return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot peek.");
            return -1; // Return -1 to indicate an error
        }
        return stack[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Main method to test the stack implementation
    public static void main(String[] args) {
        cw2 stack = new cw2(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Top element after popping: " + stack.peek());

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
    }
}