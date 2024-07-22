package classWork.classWork5;

public class ForEachExample {

    public static void main(String[] args) {
        int[] array = {4, 7, 2, 9, 1, 7};

        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        System.out.println(sum);
    }

}
