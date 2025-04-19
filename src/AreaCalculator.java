import java.util.Scanner;

public class AreaCalculator {
    private static float pi = 3.142f;

    private static float circle(float radius) {
            return(pi * radius * radius);
    }
    private static float square(float length) {
            return length * length;
    }
    private static float rectangle(float length, float width) {
            return length * width;
    }
    private static float sphere(float radius) {
            return (4.0f / 3.0f * pi * radius * radius * radius);
    }
    private static float cube(float length) {
        return (length * length * length);
    }
    private static float cuboid(float length, float breadth, float width) {
        return (length * breadth * width);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the area calculator!");
        while(true) {
            System.out.println("\nEnter 1 for circle\n" +
                        "Enter 2 for square\n" +
                        "Enter 3 for rectangle\n" +
                        "Enter 4 for sphere\n" +
                        "Enter 5 for cube\n" +
                        "Enter 6 for cuboid");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                System.out.println("Enter the radius of the circle");
                float radius = Float.parseFloat(scanner.nextLine());
                System.out.println("The area of circle of radius "+ radius + "is " + circle(radius));
            } else if (choice == 2) {
                System.out.println("Enter the length of the square");
                float length = Float.parseFloat(scanner.nextLine());
                System.out.println("The area of square of side length "+ length + " is " + square(length));
            } else if (choice == 3) {
                System.out.println("Enter the length of the rectangle");
                float length = Float.parseFloat(scanner.nextLine());
                System.out.println("Enter the breadth of the rectangle");
                float breadth = Float.parseFloat(scanner.nextLine());
                System.out.println("The area of rectangle of length "+ length +
                        "and breadth "+breadth+ " is " + rectangle(length,breadth));
            } else if (choice == 4) {
                System.out.println("Enter the radius of the sphere");
                float radius = Float.parseFloat(scanner.nextLine());
                System.out.println("The volume of  sphere of radius "+ radius + "is " + sphere(radius));
            } else if (choice == 5) {
                System.out.println("Enter the length of the cube");
                float length = Float.parseFloat(scanner.nextLine());
                System.out.println("The volume of cube of side length " + length + " is " + cube(length));
            } else if (choice == 6) {
                System.out.println("Enter the length of the cuboid");
                float length = Float.parseFloat(scanner.nextLine());
                System.out.println("Enter the breadth of the cuboid");
                float breadth = Float.parseFloat(scanner.nextLine());
                System.out.println("Enter the width of the cuboid");
                float width = Float.parseFloat(scanner.nextLine());
                System.out.println("The volume of cuboid of length "+ length +
                        ", width " + width + "and breadth "+breadth+ " is " + cuboid(length,breadth,width));
            }else {
                System.out.println("Invalid choice");
                break;
            }
        }
    }
}
