package chapter6.box;

public class BoxDemo4 {

    public static void main(String[] args) {
        Box1 myBox1 = new Box1();
        Box1 myBox2 = new Box1();
        double vol;

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        vol = myBox1.volume1();
        System.out.println("vol: " + vol);
        vol = myBox2.volume1();
        System.out.println("vol: " + vol);

    }

}
