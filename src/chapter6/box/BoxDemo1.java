package chapter6.box;

public class BoxDemo1 {

    public static void main(String[] args) {
        Box1 myBox = new Box1();
        double vol;

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        vol = myBox.depth * myBox.width * myBox.height;

        System.out.println("vol: " + vol);

    }

}
