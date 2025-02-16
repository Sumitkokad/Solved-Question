
//Explanation : Spy number means sum of digit of given number is equal to product of given number .
E.g: 1124 is a spy number bcz,
Sum of digit of 1124 = 8
Product of digit of 1124=8

public class Main{
  
    public static void main(String args[]){
    int n=1124;
    int sum=0;
    int product=1;
        while(n>0){
            
            int lastdigit=n%10;
            sum+=lastdigit;
            product*=lastdigit;
            n/=10;
            
        }
      
        if(sum==product){
            System.out.println("The number is spy number");
        }
        else{
            System.out.println("The number is not a spy number");
        }
        
        
      }
}
