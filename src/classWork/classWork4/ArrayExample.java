package classWork.classWork4;

public class ArrayExample {

    public static void main(String[] args) {
        int[] numbers = {3, 55, 43, 1, 9, 88, 6, 33};

//      Example1
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("max: " + max);

//      Example2
        int lastIndex = numbers.length-1;
        System.out.println(numbers[lastIndex]);


    }

}
