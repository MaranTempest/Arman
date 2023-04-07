
import java.util.Scanner;


public class es2 {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int sum = 0;
       while(n>0){
           int k = n % 10;
           sum += k;
           n /= 10;
       }
        System.out.println(sum);
               
    }
    
}
