package classWork.classWork3;

import java.util.Random;

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
        System.out.println();

//      Example2
        int[] numbers1 = new int[500];
        for (int i = 0; i < 500; i++) {
            numbers1[i] = i + 1;
        }
        for (int i = 0; i < 500; i++) {
            System.out.print(numbers1[i] + " ");
        }
        System.out.println();

//      Example3
        int[] numbers2 = {1, 2, 3, 4};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
        numbers2[0] = 10;
        numbers2[1] = 20;
        numbers2[2] = 30;
        numbers2[3] = 40;

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
        System.out.println();

//      Example4
        int[] numbers3 = new int[100];
        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = new Random().nextInt(1,100);
        }
        for (int i = 0; i < numbers3.length; i++) {
            System.out.print(numbers3[i] + " ");
        }


    }

}
