package Arrays;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 5, 6};

        int i = 0;
        int j = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] == arr2[j]) {
                ans.add(arr1[i]);
                i++;
                j++;
            }
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        System.out.println("Intersection: " + ans);
    }
}
