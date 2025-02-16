public class Main{
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            
        }
        return fact;
        
    }
    public static int sum(int n){
        int sum=0;
        while(n>0){
          int fact=n%10;
          
          sum+=factorial(fact);
          n/=10;
        }
        return sum;
    }
    public static void main(String args[]){
        int n=23;
        System.out.println("The output is "+sum(n));
    }
}
