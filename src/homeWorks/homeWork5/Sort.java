package homeWorks.homeWork5;

public class Sort {

    public static void main(String[] args) {
        int[] array = {3, 1, 9, 5, 7, 2, 4, 12, 8};
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
