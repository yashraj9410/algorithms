// lets implement the cycle sort Pattern 
// cycle sort pattern is used to sort the array in [1...N],[0....N] array in linear time 
// Intution for the [1,2,3.....N] -> every element index is element -1
// for [0,1,2.....N] - > every element index is element value itself 
public class CycleSortPattern {

    private static void CycleSort(int[] nums){
        int i =0 ,correctPos =0;
        while(i<nums.length){
            correctPos = nums[i] -1;              // we will not do -1 for [0....N]
            if(nums[i] != nums[correctPos]){
                int temp = nums[i];
                nums[i] = nums[correctPos];
                nums[correctPos]=temp;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,4,5,3,1};
        CycleSort(nums);
        System.out.println(nums[0]);
    }
}
// this pattern is used to solve Min postive integer in a array 
// keep in mind if we see element greater than length of array and also less than 0 or 1   then in the if statement we need to ignore them 
// if(nums[i]!= nums[correctPos] && nums[i] >=0 && nums[i]<=nums.length)  this will be updated condition to swap and vice versa for the min ele