package bai4;

public class Student {
    private String name;
    private int age;
    private String className;

    public Student(String name, int age, String className) {
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setClassName(String className) {
        this.name = className;
    }

    public String getClassName() {
        return className;
    }

    public String getStudentInformation(){
        return "Student name: "+this.getName()+"\nStudent age: "+this.getAge()+"\nStudent class name: "+this.getClassName()+".";
    }
}
