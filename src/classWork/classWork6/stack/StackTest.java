package classWork.classWork6.stack;

public class StackTest {

    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(4);
        myStack.push(5);
        myStack.push(7);
        myStack.push(9);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }

}
