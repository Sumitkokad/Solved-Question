import java.util.*;
public class Main{
     public int[] twoSum(int[] nums, int target) {
         for(int i=0;i<nums.length;i++){
             for(int j=i+1;j<nums.length;j++){
                 if(nums[i]+nums[j]==target){
                     return new int[] {i,j};  //note this concept
                     
                 }
             }
         }
         return new int[]{-1,-1};  //ow to return integer -1 in array like this 
     }
    public static void main(String args[]){
        Main obj=new Main();
        int arr[]={2,7,11,15};
        int target=9;
        int result[]=obj.twoSum(arr,target);
        System.out.println(Arrays.toString(result));
        
    }
}
