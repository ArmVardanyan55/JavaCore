package homeWorks.homeWork4;

public class ArrayHomeWork {

    int[] numbers = {3, 6, 4, 36, 14, 25, 14, 9, 6};

    void findNCount() {
        int n = 6;
        int sum = 0;
        for (
                int i : numbers) {
            if (i == n) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    void duplicateCount() {
        for (
                int i = numbers.length - 1;
                i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    void duplicateArray() {
        int h = 0;
        for (
                int i = 0;
                i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    h++;
                }
            }
        }
        System.out.println(h);
    }

    void vowlesCount() {
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] a = {'ա', 'ի', 'օ', 'ե', 'ը', 'ո', 'է', 'ւ'};
        int b = 0;
        for (
                int i = 0;
                i < chars.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (chars[i] == a[j]) {
                    b++;
                }
            }
        }
        System.out.println(b);
    }

}




