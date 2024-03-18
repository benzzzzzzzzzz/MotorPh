package motorph;

import java.util.Scanner;

public class WeeklyHoursCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] dailyHours = new double[7];

        // Input hours worked each day
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter hours worked on day " + (i + 1) + ": ");
            dailyHours[i] = scanner.nextDouble();
        }

        // Calculate total weekly hours
        double totalHours = calculateWeeklyHours(dailyHours);

        System.out.println("The total hours worked in a week is: " + totalHours + " hours.");
    }

    public static double calculateWeeklyHours(double[] dailyHours) {
        double totalHours = 0;
        for (double hours : dailyHours) {
            totalHours += hours;
        }
        return totalHours;
    }
}
