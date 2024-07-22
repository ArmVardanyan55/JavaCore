package homeWorks;

public class ArrayHomeWork {

    public static void main(String[] args) {
        int[] numbers = {3, 6, 4, 36, 14, 25, 14, 9, 6};

//  HomeWork1
        int n = 6;
        int sum = 0;
        for (int i : numbers) {
            if (i == n) {
                sum++;
            }
        }
        System.out.println(sum);

//  HomeWork2
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

//  HomeWork3
        int h = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    h++;
                }
            }
        }
        System.out.println(h);

//  HomeWork4
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ' };
        char[] a = {'ա', 'ի', 'օ', 'ե', 'ը', 'ո', 'է' };
        int b = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (chars[i] == a[j]) {
                    b++;
                }
            }
        }
        System.out.println(b);


    }
}




