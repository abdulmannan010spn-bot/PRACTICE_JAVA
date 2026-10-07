package Arrays;

import java.util.Scanner;

public class CountOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        
        int[] arr = new int[n];

        
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] % 2 != 0) {
                count = count + 1;
            }
        }

        System.out.println("Number of odd elements = " + count);

        sc.close();
    }
}
