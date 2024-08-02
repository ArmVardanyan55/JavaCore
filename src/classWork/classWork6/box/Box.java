package classWork.classWork6.box;

public class Box {

    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


    double volume() {
        return width * depth * height;
    }

}
