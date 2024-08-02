package chapter6.box;

public class Box1 {

    double width;
    double height;
    double depth;

    void volume() {
        System.out.print("vol: ");
        System.out.println(width * height * depth);
    }

    double volume1() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }


}
