package homeWorks.homeWork2;

public class FigurePainter {

    void figureOne(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void figureTwo(char c) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void figureThree(char c) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void figureFour(char c) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void figureFive(char c) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print(" " + c);
            }
            System.out.println();
        }
    }
}
