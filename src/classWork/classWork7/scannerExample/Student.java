package classWork.classWork7.scannerExample;

public class Student {

    private String name;
    private String surName;
    private int age;
    private String phoneNumber;
    private String lessonName;

    public Student(int age, String name, String surName, String phoneNumber, String lessonName) {
        this.age = age;
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
        this.lessonName = lessonName;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surName);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Lesson name: " + lessonName);

    }

}
