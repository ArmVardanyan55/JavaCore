package classWork.classWork7.scannerExample;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Please input your name: ");
        student.setName(scanner.nextLine());

        System.out.println("Please input your surName: ");
        student.setSurName(scanner.nextLine());

        System.out.println("Please input your age: ");
        student.setAge(Integer.parseInt(scanner.nextLine()));

        System.out.println("Please input your phone number: ");
        student.setPhoneNumber(scanner.nextLine());

        System.out.println("Please input your lesson name: ");
        student.setLessonName(scanner.nextLine());

        System.out.println("Thank you" + student.getName() + " you have register successfully. Your data is");

        student.print();
    }

}
