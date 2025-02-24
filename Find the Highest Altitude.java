/*
There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

 

Example 1:

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
*/
public class Main{
     public int largestAltitude(int[] gain) {
     int count =0;
     int max=Integer.MIN_VALUE;
      int temp[]=new int[arr.length+1];
      for(int i=0;i<arr.length;i++){
        
         temp[i]= arr[i]+count;
         count=temp[i];
     
      }
     for(int j=0;j<temp.length;j++){
         if(temp[j]>max){
             max=temp[j];
         }
     }
      
      return max;
    }
    public static void main(String args[]){
        Main obj=new Main();
        int arr[]={-4,-3,-2,-1,4,3,2};
      
        System.out.println(obj.largestAltitude(arr));
    }
}
