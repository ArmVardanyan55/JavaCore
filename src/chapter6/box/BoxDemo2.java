package chapter6.box;

public class BoxDemo2 {

    public static void main(String[] args) {
        Box1 myBox1 = new Box1();
        Box1 myBox2 = new Box1();
        double vol;

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;
        vol = myBox1.depth * myBox1.width * myBox1.height;
        System.out.println("vol1: " + vol);

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;
        vol = myBox2.depth * myBox2.width * myBox2.height;
        System.out.println("vol2: " + vol);


    }

}
