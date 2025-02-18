import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        fun(2,3,4,5,6,7,8,9);
    }
    static void fun(int ...n){   /* By using this the integer is convert into an integer array so we can also use other data structures as present in java*/
     System.out.print(Arrays.toString(n));   
  
    }
}
