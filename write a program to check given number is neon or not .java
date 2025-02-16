/*Explanation : 9 is a neon number bcz it's sum of digit of square is equal to 9 .
i.e. if input =9 
then 9*9= 81
8+1=9 
So it is equal to the given number .*/
/*Output-
enter the input - 9
The product is 81
The sum is 9
The number is neon number
*/
import java.util.*;

public class Main{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the input - ");
    int n=sc.nextInt();
        int sum=0;
        int product=1;
        product=n*n;
        int temp=product;
        while(temp>0){
            
           int last=temp%10;
            temp/=10;
            sum+=last;
           
            
        }
        System.out.println("The product is "+ product);
        System.out.println("The sum is "+ sum);
        if(sum==n){
            System.out.println("The number is neon number");
        }
        else{
            System.out.println("The number is not neon number");
        }
    }
}
