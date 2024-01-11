// optimized two sum approach using hashtable in O(n)
import java.util.HashMap;

public class TwoSumOpt {
    public static void main(String[] args) {
        HashMap<Integer,InternalError> map = new HashMap<>();
        int[] nums = {2,5,3,7,8,2,5};
        int target = 8;
        int[] res = new int[2];

        for(int i = 0; i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                res[0] = i;
                res[1] = map.get(target-nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        System.out.print(res[0]);
    }
}
