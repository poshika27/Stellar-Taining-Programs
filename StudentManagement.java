package com.steller;

import java.util.Scanner;

public class StudentManagement {
    static class Student {
	        int id;
	        String name;
	        String email;

	        Student(int id, String name,String email) {
	            this.id = id;
	            this.name = name;
	            this.email=email;
	        }

	        @Override
	        public String toString() {
	            return "ID: " + id + ", Name: " + name+", Email: "+email;
	        }
	    }

	    static Student s[] = new Student[100]; 
	    static int studentCount = 0;

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;//
	        do {
	            System.out.println("\n--- Student Management System ---");
	            System.out.println("1. Add Student");
	            System.out.println("2. View Students");
	            System.out.println("3. Delete Student");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine(); 

	            switch (choice) {
	                case 1:
	                    addStudent(sc); 
	                    break;
	                case 2:
	                    viewStudents();
	                    break;
	                case 3:
	                    deleteStudent(sc);
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 4);

	        sc.close();
	    }

	    private static void addStudent(Scanner scanner) {
	        System.out.print("Enter Student ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine(); 
	        System.out.print("Enter Student Name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter Student Email: ");
	        String email = scanner.nextLine();
	        s[studentCount++] = new Student(id, name,email);
	        System.out.println("Student added successfully.");
	    }

	    private static void viewStudents() {
	        if (studentCount == 0) {
	            System.out.println("No students found.");
	        } else {
	            System.out.println("\n--- List of Students ---");
	            for (int i = 0; i < studentCount; i++) {
	                System.out.println(s[i]);
	            }
	        }
	    }

	    private static void deleteStudent(Scanner scanner) {
	        if (studentCount == 0) {
	            System.out.println("No students to delete.");
	            return;
	        }

	        System.out.print("Enter Student ID to delete: ");
	        int id = scanner.nextInt();
	        boolean found = false;

	        for (int i = 0; i < studentCount; i++) {
	            if (s[i].id == id) {
	                for (int j = i; j < studentCount - 1; j++) {
	                    s[j] = s[j + 1];
	                }
	                s[--studentCount] = null; 
	                found = true;
	                System.out.println("Student deleted successfully.");
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Student with ID " + id + " not found.");
	        }
	    }
	}
