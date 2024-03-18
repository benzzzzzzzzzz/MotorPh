/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorph;

import java.util.Scanner;

public class NetWeeklySalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base weekly salary: ");
        double baseSalary = scanner.nextDouble();

        double sssDeduction = calculateSSSDeduction(baseSalary);
        double pagibigDeduction = calculatePagIbigDeduction(baseSalary);
        double philhealthDeduction = calculatePhilHealthDeduction(baseSalary);

        // Calculate total deductions
        double totalDeductions = sssDeduction + pagibigDeduction + philhealthDeduction;

        // Calculate the net salary after deductions
        double netSalary = baseSalary - totalDeductions;

        System.out.println("Base Weekly Salary: $" + baseSalary);
        System.out.println("SSS Deduction: $" + sssDeduction);
        System.out.println("Pag-IBIG Deduction: $" + pagibigDeduction);
        System.out.println("PhilHealth Deduction: $" + philhealthDeduction);
        System.out.println("Total Deductions: $" + totalDeductions);
        System.out.println("Net Weekly Salary: $" + netSalary);

        scanner.close();
    }

    public static double calculateSSSDeduction(double baseSalary) {
        // SSS deduction rate (example rate, replace with actual rate)
        double sssRate = 0.10; // 10%
        return baseSalary * sssRate;
    }

    public static double calculatePagIbigDeduction(double baseSalary) {
        // Pag-IBIG deduction rate (example rate, replace with actual rate)
        double pagibigRate = 0.05; // 5%
        return baseSalary * pagibigRate;
    }

    public static double calculatePhilHealthDeduction(double baseSalary) {
        // PhilHealth deduction rate (example rate, replace with actual rate)
        double philhealthRate = 0.02; // 2%
        return baseSalary * philhealthRate;
    }
}

