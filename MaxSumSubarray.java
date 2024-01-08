// task is to find out the subarray that contains the max sum that is max sum contigous array

public class MaxSumSubarray {
public static void main(String[] args) {

    int[] arr = {-2,1,-3,4,-1,2,1,-5,4} ; 
    int max = Integer.MIN_VALUE;
    // we will be using the bruteforce approact first 
    // algo - two loops that will iterate throygh every possible subarray and will find the max sum
    for(int i =0; i<arr.length;i++){
        int sum=0;                           // when starting a new sub array from i sum will start from 0 
        for(int j=i;j<arr.length;j++){       // in the array subarray will lie between i and j as sub array for i =0  will be [-2] ,[-2,1] ,......  so we are directly taking the sum of upcoming element in the subarray and finding the max sum that exists
            sum = sum+arr[j];
            max= Math.max(max, sum);
        }
    }
    System.out.println(max);
    }
}