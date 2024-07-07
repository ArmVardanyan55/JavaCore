package chapter3;

public class BoolTest {

    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b հավասար է " + b);
        b = true;
        System.out.println("b հավասար է " + b);

        if (b) {
            System.out.println("այս կոդը կաշխատի ");
        }
        b = false;
        if (b) {
            System.out.println("այս կոդը չի աշխատի ");
        }
        System.out.println("10 > 9 հավասար է " + (10 > 9));
    }

}
