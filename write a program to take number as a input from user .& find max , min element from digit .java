/*E.g input is 53728
Then output : 
Max=8
Min=2*/

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min=  Integer.MAX_VALUE;
        
        System.out.println("Enter a number as a Input ");
        int n=sc.nextInt();
        String str=String.valueOf(n);
        int[] arr = new int[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0'; // Convert char to int
        }
        for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
           }
          if(arr[i]<min){
               min=arr[i];
           }
           
        }
          System.out.println("Max digit: " + max);
        System.out.println("Min digit: " + min);
    }
}
