package Module4;

import java.util.Scanner;

public class Module4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double total = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

      
        while (count < 5) {
            System.out.print("Enter a floating-point value: ");
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                total += value;
                max = Math.max(max, value);
                min = Math.min(min, value);
                count++;
            } else {
                System.out.println("Invalid input. Please enter a valid floating-point value.");
                scanner.next(); 
            }
        }

     
        double average = total / 5;

        
        double interest = total * 0.20;

     
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on total at 20%: " + interest);

        scanner.close();
    }
}
