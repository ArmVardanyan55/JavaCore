package chapter3;

public class LifeTime {

    public static void main(String[] args) {
        int x;
        for (int i = 0; i < 3; i++) {
            int y = -1;
            System.out.println("y հավասար է " + y);
            y = 100;
            System.out.println("y հիմա հավասար է " + y);
        }
    }

}
