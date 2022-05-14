import java.lang.*;
import java.util.*;
public class P43_ArithmeticSeries{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to print Arithmetic series!");
        System.out.println("Enter a, d and n");
        
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        
        int term = a;
        for(int i=0; i<n; i++){
            System.out.print(term + ",");
            term = term+d;
        }
    }
}
