package classWork.classWork6.box;

public class BoxTest {

    public static void main(String[] args) {
        Box myBox = new Box(5, 6, 7);
        Box myBox1 = new Box(33, 45, 24);
        double vol = myBox.volume();
        System.out.println(vol);
        vol = myBox.volume();
        System.out.println(vol * 2);

        ;

    }

}
