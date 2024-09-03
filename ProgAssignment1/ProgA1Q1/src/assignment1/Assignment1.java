/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1 {

    private static List<Student> students = new ArrayList<>(); 
    private static final String FILE_NAME = "Students Information";

    public static void captureStudent() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CAPTURE A NEW STUDENT");
        System.out.println("*********************");
        
        System.out.print("Enter the student id: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
         
        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();
        
        int age = 0;
        while (age < 16) {
            System.out.print("Enter the student age: ");
            age = scanner.nextInt();
            scanner.nextLine(); 
            if (age < 16) {
                System.out.println("You have entered an incorrect student age !!!");
            }
        }
        
        System.out.print("Enter the student email: ");
        String email = scanner.nextLine();

        System.out.print("Enter the student course: ");
        String course = scanner.nextLine();

        Student newStudent = new Student(id, name, age, email, course);
        students.add(newStudent);
        System.out.println("Student details have been successfully saved.");
    }

    public static void getId(){
        
    }
    
    public static void searchStudent() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student ID to search: ");
    int id = scanner.nextInt();
    scanner.nextLine(); 

    for (Student student : students) {
        if (student.getId() == id) {
            System.out.println("\nStudent found:");
            student.display();
            return; 
        }
    }

    System.out.println("\nStudent with ID " + id + " was not found.");
    }

    public static void deleteStudent() {
        Scanner scanner = new Scanner(System.in); 

    
    System.out.print("Enter the student ID to delete: ");
    int id = scanner.nextInt();
    scanner.nextLine(); 

    
    Student studentDelete = null;
    for (Student student : students) {
        if (student.getId() == id) {
            studentDelete = student;
            break;
        }
    }

    
    if (studentDelete != null) {
        System.out.print("Are you sure you want to delete student with ID " + id + "? (y/n): ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("y")) {
            students.remove(studentDelete);
            System.out.println("Student with ID " + id + " has been deleted.");
        } else {
            System.out.println("Deletion canceled.");
        }
    } else {
        System.out.println("Student with ID " + id + " was not found.");
    }

    }

    public static void printStudentReport() {
        if (students.isEmpty()) {
            System.out.println("No students to report.");
    }
    }
    public static void launchOptions() {

        boolean menuRunning = true;
        Scanner scanner = new Scanner(System.in);

        while (menuRunning) {
            System.out.println("Please select one of the following menu items:");
            System.out.println("(1) Capture a new student.");
            System.out.println("(2) Search for a student.");
            System.out.println("(3) Delete a student.");
            System.out.println("(4) Print student report.");
            System.out.println("(5) Exit Application.");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    captureStudent();
                    break;
                case "2":
                    searchStudent();
                    break;
                case "3":
                    deleteStudent();
                    break;
                case "4":
                    printStudentReport();
                    break;
                case "5":
                    menuRunning = false;
                    System.out.println("Exiting to Main Menu");
                    break;
                default:
                    System.out.println("Invalid selection, please try again.");
            }
        }
        scanner.close(); 
    }

    public static void launchApp() {

        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("******************************");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter (1) to launch menu or any other key to exit");

        if (input.hasNextInt()) {
            int launch = input.nextInt();
            input.nextLine(); 

            if (launch == 1) {
                launchOptions();
            } else {
                System.out.println("Exiting Application");
            }
        } else {
            System.out.println("Invalid input. Exiting Application");
        }

        input.close(); 
    }

    public static void main(String[] args) {
        launchApp();
    }

    
  
}


class Student {
    private int id;
    private String name;
    private int age;
    private String email;
    private String course;

    public Student(int id, String name, int age, String email, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println("Student Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        System.out.println("-----------------------");
    }
}