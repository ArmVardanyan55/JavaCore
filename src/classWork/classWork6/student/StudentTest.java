package classWork.classWork6.student;

public class StudentTest {

    public static void main(String[] args) {

        Student student = new Student("Poxos", "Poxosyan", "077889900");
        student.lessonName = "Java";
        System.out.println(student.printStudentShort());
        System.out.println(student.printStudentFull());

        Student student1 = new Student("Petros", "Petrosyan", "099887766");
        student1.age = 22;
        System.out.println(student.printStudentShort());
        System.out.println(student.printStudentFull());


    }
}
