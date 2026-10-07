package Maths;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int digits = 0;
        int temp = n;

        // Count digits

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        int sum = 0;
        temp = n;

        // Calculate Armstrong sum
        
        while (temp > 0) {
            int digit = temp % 10;

            sum += Math.pow(digit, digits);

            temp = temp / 10;
        }

        // Check
        
        if (sum == original) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }

        sc.close();
    }
}
