package chapter2.classWork;

public class IfSample {

    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;

        if (x < y) {
            System.out.println("x փոքր է y");
        }

        x = x * 2;
        if (x == y) {
            System.out.println("x հավասար է у");
        }

        x = x * 2;
        if (x > y) {
            System.out.println("x մեծ է у");
        }

        if (x==y){
            System.out.println("այս տողը չի տպի");
        }
    }

}
