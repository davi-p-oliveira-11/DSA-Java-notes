public class MyStackMain {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();

        System.out.println("Top element: " + stack.peek());
        stack.pop();
        stack.printStack();
    }
}
