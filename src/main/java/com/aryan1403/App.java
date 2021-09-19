package com.aryan1403;

import java.util.Scanner;

import com.aryan1403.GUI.GUI;
import com.aryan1403.Manage.Student;
import com.aryan1403.Manage.studentDAO;

public final class App {
    public static void menuDrivenProgram() {
        System.out.println("Welcome to Student Management App");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int choice;

        while(true) {
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Display Student");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice : ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Add Student
                    System.out.print("Enter Student Name : ");
                    String name = sc1.nextLine();
                    System.out.print("Enter Student Phone : ");
                    String phone = sc1.nextLine();
                    System.out.print("Enter Student City : ");
                    String city = sc2.nextLine();

                    Student st = new Student(name, phone, city);

                    if(studentDAO.insertStudent(st)) {
                        System.out.println("Student Inserted Successfully!\n");
                    }
                    else {
                        System.out.println("Error!\n");
                    }
                    // System.out.println(st);
                    break;
                case 2:
                    // Delete Student
                    System.out.print("Enter Student Id to be Deleted : ");
                    int id = sc2.nextInt();

                    if(studentDAO.deleteStudent(id)){
                        System.out.println("Deleted Successfully\n");
                    }
                    else {
                        System.out.println("Error!\n");
                    }
                    break;
                case 3:
                    // Display Sudent
                    studentDAO.showAllStudents();
                    System.out.println();
                    break;
                case 4:
                    //Exit
                    System.out.println("Thank you for using Student Management App ;)");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice!\n\n");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        // menuDrivenProgram(); Command line Implementation
        // GUI Implementaion
        new GUI();
    }

}
