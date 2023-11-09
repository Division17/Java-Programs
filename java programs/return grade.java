import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = in.nextLine();
        String lastName = in.nextLine();
        int idNumber = in.nextInt();
        int t = in.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = in.nextInt();
        }
        Student st = new Student(firstName, lastName, idNumber, arr);
    }
}

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

class Student extends Person {

    Student(String firstName, String lastName, int idNumber, int[] scores) {
        super(firstName, lastName);
        char G = calculate(scores);
        System.out.println("Name: " + getLastName() + ", " + getFirstName() + "\n" + "ID: " + idNumber + "\n" + "Grade: " + G);

    }

    public char calculate(int[] scores) {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        avg = sum / scores.length;

        if (avg >= 90 && avg <= 100) {
            return 'O';
        }
        if (avg >= 80 && avg < 90) {
            return 'E';
        }
        if (avg >= 70 && avg < 80) {
            return 'A';
        }
        if (avg >= 55 && avg < 70) {
            return 'P';
        }
        if (avg >= 40 && avg < 55) {
            return 'D';
        } else {
            return 'T';
        }
    }
}