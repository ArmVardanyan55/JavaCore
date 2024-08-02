package classWork.classWork6.student;

public class Student {

    String name;
    String surname;
    String phoneNumber;
    int age;
    String lessonName;
    String email;

    Student(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    String printStudentShort() {
        return "Name = " + name + ", Surname = " + surname + ", PhoneNumber = " + phoneNumber;
    }

    String printStudentFull() {
        return "Name = " + name + ", Surname = " + surname + ", PhoneNumber = " + phoneNumber
                + ", Email = " + email + ", Age = " + age + ", LessonName = " + lessonName;
    }


}
