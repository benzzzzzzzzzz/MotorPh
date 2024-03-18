package motorph;

import java.util.Scanner;

public class EmployeeInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee number:");
        int employeeNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character left by nextInt()

        System.out.println("Enter employee name:");
        String employeeName = scanner.nextLine();

        System.out.println("Enter birthday (format: DD/MM/YYYY):");
        String birthday = scanner.nextLine();

        System.out.println("\nEmployee Details:");
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Birthday: " + birthday);

        scanner.close();
    }
}