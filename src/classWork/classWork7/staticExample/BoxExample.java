package classWork.classWork7.staticExample;

public class BoxExample {

    public static void main(String[] args) {
        Box myBox = new Box(4, 5, 6);
        System.out.println(Box.madeIn);
        Box myBox2 = new Box(40, 50, 60);
        System.out.println(Box.madeIn);

    }

}
