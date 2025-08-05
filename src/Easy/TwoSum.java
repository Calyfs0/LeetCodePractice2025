package Easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
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
