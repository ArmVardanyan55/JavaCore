package chapter6.box;

public class BoxDemo5 {

    public static void main(String[] args) {
        Box1 myBox1 = new Box1();
        Box1 myBox2 = new Box1();
        double vol;

        myBox1.setDim(10,20,15);
        myBox2.setDim(3,6,9);

        vol = myBox1.volume1();
        System.out.println("vol: " + vol);
        vol = myBox2.volume1();
        System.out.println("vol: " + vol);

    }

}
