public class Main{
    public static void main(String[] args) {
        myStack myStack = new myStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        myStack.push(9);
        myStack.push(10);

        myStack.pop();//last in first out, 10 is deleted
        myStack.deleteMidle();//middle value (5) is deleted
        myStack.print();
    }
}
