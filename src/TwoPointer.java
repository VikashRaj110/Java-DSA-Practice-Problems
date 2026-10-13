public class TwoPointer {
    public static int[] twoSum(int[] nums, int target) {
        int n =nums.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[]{i, j};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 6};
        int target = 6;

        int[] result = twoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);
    }
}