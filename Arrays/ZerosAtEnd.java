package Arrays;

public class ZerosAtEnd {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12, 0};

        moveZeroes(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroes(int[] nums) {

        int j = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j != -1) {
            for (int i = j + 1; i < nums.length; i++) {

                if (nums[i] != 0) {
                    swap(nums, i, j);
                    j++;
                }
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}