package classWork.classWork7.staticExample;

public class Box {

    public static String madeIn = "Made in Armenia: ";
    public double width;
    public double height;
    public double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    static {
        System.out.println("hi from static block in box");
    }


    double volume() {
        return width * depth * height;
    }

    public static void printMadeIn(){
        System.out.println(madeIn);
    }



}
