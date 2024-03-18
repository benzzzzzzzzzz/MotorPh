package motorph;

import java.util.Scanner;

public class GrossWeeklySalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours worked in a week: ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("Enter the hourly wage rate: ");
        double hourlyRate = scanner.nextDouble();

        double grossWeeklySalary = calculateWeeklySalary(hoursWorked, hourlyRate);
        System.out.println("Gross weekly salary: PHP" + grossWeeklySalary);

        scanner.close();
    }

    public static double calculateWeeklySalary(double hoursWorked, double hourlyRate) {
        // Assuming standard overtime rules (1.5x hourly rate for hours over 40)
        double overtimeRate = 1.5;
        double regularHours = Math.min(hoursWorked, 40); // Regular hours capped at 40
        double overtimeHours = Math.max(hoursWorked - 40, 0); // Overtime hours (if any)

        double regularPay = regularHours * hourlyRate;
        double overtimePay = overtimeHours * hourlyRate * overtimeRate;

        return regularPay + overtimePay;
    }
}

