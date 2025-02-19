/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].*/



import java.util.*;
public class Main{
    static int[] runningsum(int[] nums){
       int[] sum=new int[nums.length];
       
        for(int i=0;i<nums.length;i++){
           for(int j=0;j<=i;j++){
               sum[i]+=nums[j];
           }
        }
        return sum;
    }
    public static void main(String args[]){
        Main obj=new Main();
        int nums[]={1,1,1,1,1};
        int result[]=obj.runningsum(nums);
        System.out.println(Arrays.toString(result));
    }
}
