package homeWorks;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8,};

//  բոլոր էլեմենտները
        System.out.print("բոլոր էլեմենտները: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

//  առաջին էլեմենտը
        System.out.println("առաջին էլեմենտը: " + numbers[0]);

//  վերջին էլեմենտը
        System.out.println("վերջին էլեմենտը: " + (numbers.length - 1));

//  մասիվի երկարությունը
        System.out.println("մասիվի երկարությունը: " + numbers.length);

//  մասիվի ամենափոքր թիվը
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("մասիվի ամենափոքր թիվը: " + min);

//  մեջտեղի թիվը
        if (numbers.length <= 2) {
            System.out.println("cant print middle value");
        }
        if (numbers.length > 2 && numbers.length % 2 == 1) {
            System.out.println("մեջտեղի թիվը: " + numbers[numbers.length / 2]);
        }
        if (numbers.length > 2 && numbers.length % 2 == 0) {
            System.out.println("մեջտեղի թիվը: " + numbers[numbers.length / 2 - 1] + " " + numbers[numbers.length / 2]);
        }



//  զույգերի քանակը
        int a = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                a++;
            }
        }
        System.out.println("զույգերի քանակը: " + a);

//  կենտերի քանակը
        int b = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                b++;
            }
        }
        System.out.println("կենտերի քանակը: " + b);

//  էլեմենտների գումարը
        int c = 0;
        for (int i = 0; i < numbers.length; i++) {
            c += numbers[i];
        }
        System.out.println("էլեմենտների գումարը: " + c);


//  միջին թվաբանականը
        int d = 0;
        for (int i = 0; i < numbers.length; i++) {
            d += numbers[i];
        }
        d /= numbers.length;
        System.out.println("միջին թվաբանականը: " + d);

    }
}

