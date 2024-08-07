package classWork.classWork7;

public class StringExample {

    public static void main(String[] args) {
        String fullName = "Poxos Poxosyan";
        String name = fullName.substring(0, 5);
        String surName = fullName.substring(6);
        System.out.println(name);
        System.out.println(surName);

        String[] nameAndSurname = fullName.split(" ");
        System.out.println(nameAndSurname[0]);
        System.out.println(nameAndSurname[1]);

        for (String s : nameAndSurname) {
            System.out.println(s);
        }

            char[] charArray = fullName.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                System.out.print(charArray[i] + " ");
            }

    }

}
