package classWork.classWork3;

public class ArrayExample {

    public static void main(String[] args) {

//      Example1
        int[] numbers = new int[5];

        numbers[0] = 56;
        numbers[1] = 99;
        numbers[4] = 77;

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

//      Example2
        int[] numbers1 = new int[500];
        for (int i = 0; i < 500; i++) {
            numbers1[i] = i + 1;
        }
        for (int i = 0; i < 500; i++) {
            System.out.print(numbers1[i] + " ");
        }

//      Example3


    }

}
