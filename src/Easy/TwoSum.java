package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] output = twoSum(nums, target);
        System.out.println(Arrays.toString(output));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hs = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int pair = target - nums[i];

            if(hs.containsKey(pair)){
                return new int[]{ hs.get(pair), i};
            }
            hs.put(nums[i], i);
        }

        return new int[0];
    }
}
