import java.util.HashMap;
public class Hashmap2Sum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n =nums.length;
        for (int i = 0; i < n; i++) {
            int required = target - nums[i];
            if(map.containsKey(required)){
                return new int[]{map.get(required),i};
            }
            map.put(nums[i],i);
        }
        return new int []{-1,-1};
}
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);
    }
}
