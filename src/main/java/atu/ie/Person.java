package atu.ie;

import java.util.Scanner;
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    // Default Constructor
    public Person(){
        this.firstName = "John";
        this.lastName = "Doe";
        this.age = 30;
    }
    //Constructor
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Method to get user input
    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter Last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter age: ");
        this.age = scanner.nextInt();


    }

    //setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        this.age = age;
    }

    //Getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    public void displayInfo() {
        System.out.println("Name: " + getFirstName() + " " + getLastName() + ", Age: " + getAge());
    }
}
