package chapter5;

public class Search {

    public static void main(String[] args) {
        int[] nums = {6, 8, 3, 4, 5, 2, 9, 1};
        int val = 5;
        boolean found = false;

        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Знaчeниe найдено!");
        }
    }

}
