package Level_1;
import java.util.*;
//Circle class to compute area and circumference
class Circle {
 double radius;

 // Constructor to initialize radius
 Circle(double radius) {
     this.radius = radius;
 }

 // Method to calculate area of the circle
 double calculateArea() {
     return Math.PI * radius * radius;
 }

 // Method to calculate circumference of the circle
 double calculateCircumference() {
     return 2 * Math.PI * radius;
 }

 // Method to display area and circumference
 void displayDetails() {
     System.out.println("Radius: " + radius);
     System.out.println("Area: " + calculateArea());
     System.out.println("Circumference: " + calculateCircumference());
 }

 // Main method to run the program
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 double radius= sc.nextDouble();
     Circle c = new Circle(radius); // create object with radius 5.0
     c.displayDetails();
 }
}

