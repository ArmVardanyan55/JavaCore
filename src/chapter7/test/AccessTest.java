package chapter7.test;

public class AccessTest {

    public static void main(String[] args) {
        Test1 ob = new Test1();

        ob.a = 10;
        ob.b = 20;

        ob.setC(100);
        System.out.println("a, b, c: " + ob.a + " " + ob.b + " " + ob.getC());
    }

}
