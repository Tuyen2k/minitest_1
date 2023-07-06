package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name Object: ");
        String name = input.nextLine();
        System.out.println("Enter className Object: ");
        String className = input.nextLine();
        System.out.println("Enter age Object: ");
        int age = input.nextInt();


        Student student1 = new Student(name, age, className);
        System.out.println("\n"+student1.getStudentInformation());
    }
}
