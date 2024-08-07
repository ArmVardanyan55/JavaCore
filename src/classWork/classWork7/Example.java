package classWork.classWork7;

import classWork.classWork6.box.Box;

public class Example {

    public static void main(String[] args) {
        Box myBox = new Box(10, 20, 30);
        System.out.println(myBox.width);
        changeBox(myBox);
        System.out.println(myBox.width);
//        int a = 10;
//        System.out.println(a);
//        changeA(a);
//        System.out.println(a);
    }

    public static void changeBox(Box box) {
        box.width = 90;
    }

    public static void changeA(int a) {
        a = a * 2;
    }

}
