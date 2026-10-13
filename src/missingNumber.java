public class missingNumber {
    static void main(String[] args) {
        int [] nums={ 1,0,2,4,5};
        int ans = missingNum(nums);
        System.out.println(ans);
    }
        public  static int missingNum(int[] nums) {
            int xorSum = 0;
            // XOR all array elements
            for (int n : nums) {
                xorSum = xorSum ^ n;
            }
            // XOR all numbers from 0 to nums.length
            int n = nums.length;
            for (int i = 0; i <= n; i++) {
                xorSum = xorSum ^ i;
            }
            return xorSum;
        }
    }

