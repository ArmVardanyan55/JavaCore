package homeWorks.homeWork1;

public class ForIfExamples {

    void exampleOne() {
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void exampleTwo() {
        int i = 0;
        for (int j = 0; j <= 100; j++) {
            i = i + j;
        }
        System.out.println(i);
    }

    void exampleThree() {
        for (int j = 50; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    void exampleFour() {
        for (int j = 0; j < 20; j++) {
            j = j + 1;
            System.out.print(j + " ");
        }
        System.out.println();
    }

    void exampleFive() {
        int a = 0;
        for (int k = 1; k < 100; k++) {
            k = k + 1;
            a++;
        }
        System.out.print(a);
    }

}
