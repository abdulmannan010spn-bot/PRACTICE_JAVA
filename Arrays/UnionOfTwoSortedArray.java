package Arrays;

import java.util.ArrayList;

public class UnionOfTwoSortedArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 3, 5, 6};

        int i = 0;
        int j = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {

                if (ans.size() == 0 || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }

                i++;
            }

            else if (arr1[i] > arr2[j]) {

                if (ans.size() == 0 || ans.get(ans.size() - 1) != arr2[j]) {
                    ans.add(arr2[j]);
                }

                j++;
            }

            else {

                if (ans.size() == 0 || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }

                i++;
                j++;
            }
        }

        // Remaining elements of arr1
        while (i < arr1.length) {

            if (ans.size() == 0 || ans.get(ans.size() - 1) != arr1[i]) {
                ans.add(arr1[i]);
            }

            i++;
        }

        // Remaining elements of arr2
        while (j < arr2.length) {

            if (ans.size() == 0 || ans.get(ans.size() - 1) != arr2[j]) {
                ans.add(arr2[j]);
            }

            j++;
        }

        System.out.println("Union: " + ans);
    }
}
