import java.util.Scanner;

class Employee {
    String name;
    String department;
    String religion;
    int nin;
    String course;
}

public class jim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            employees[i] = new Employee();

            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("Name: ");
            employees[i].name = scanner.nextLine();

            System.out.print("Department: ");
            employees[i].department = scanner.nextLine();

            System.out.print("Religion: ");
            employees[i].religion = scanner.nextLine();

            System.out.print("NIN (National Identification Number): ");
            employees[i].nin = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left in the buffer.

            System.out.print("Course of Study: ");
            employees[i].course = scanner.nextLine();
        }

        scanner.close();

        // Display the employee details
        System.out.println("Employee Details:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.println("Name: " + employees[i].name);
            System.out.println("Department: " + employees[i].department);
            System.out.println("Religion: " + employees[i].religion);
            System.out.println("NIN: " + employees[i].nin);
            System.out.println("Course: " + employees[i].course);
            System.out.println();
        }
    }
}
