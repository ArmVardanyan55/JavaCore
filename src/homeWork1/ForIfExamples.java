package homeWork1;

public class ForIfExamples {

    public static void main(String[] args) {
//      Example1
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

//      Example2
        int i = 0;
        for (int j = 0; j <= 100; j++) {
            i = i + j;
        }
        System.out.println(i);

//      Example3
        for (int j = 50; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

//      Example4
        for (int j = 0; j < 20; j++) {
            j = j + 1;
            System.out.print(j + " ");
        }
        System.out.println();

//      Example5
        int a = 0;
        for (int k = 1; k < 100; k++) {
            k = k + 1;
            a++;
        }
        System.out.print(a);


    }

}
