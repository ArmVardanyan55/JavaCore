package homeWorks.homeWork3;

public class ArrayUtil {
    int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8,};

    void allElements() {
        System.out.print("բոլոր էլեմենտները: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    void firstElement() {
        System.out.println("առաջին էլեմենտը: " + numbers[0]);
    }

    void lastElement() {
        System.out.println("վերջին էլեմենտը: " + (numbers.length - 1));
    }

    void arrayLength() {
        System.out.println("մասիվի երկարությունը: " + numbers.length);
    }

    void min() {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("մասիվի ամենափոքր թիվը: " + min);
    }

    void middleValue() {
        if (numbers.length <= 2) {
            System.out.println("cant print middle value");
        }
        if (numbers.length > 2 && numbers.length % 2 == 1) {
            System.out.println("մեջտեղի թիվը: " + numbers[numbers.length / 2]);
        }
        if (numbers.length > 2 && numbers.length % 2 == 0) {
            System.out.println("մեջտեղի թիվը: " + numbers[numbers.length / 2 - 1] + " " + numbers[numbers.length / 2]);
        }
    }

    void oddCount() {
        int a = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                a++;
            }
        }
        System.out.println("զույգերի քանակը: " + a);
    }

    void evenCount() {
        int b = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                b++;
            }
        }
        System.out.println("կենտերի քանակը: " + b);
    }

    void sum() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("էլեմենտների գումարը: " + sum);
    }

    void avg() {
        int d = 0;
        for (int i = 0; i < numbers.length; i++) {
            d += numbers[i];
        }
        d /= numbers.length;
        System.out.println("միջին թվաբանականը: " + d);
    }

}

