package chapter7.overLoad;

public class OverLoad1 {

    public static void main(String[] args) {
        OverLoadDemo ob1 = new OverLoadDemo();
        int i = 88;

        ob1.test();
        ob1.test(10, 20);
        ob1.test(i);
        double result = ob1.test(123.2);

    }

}
