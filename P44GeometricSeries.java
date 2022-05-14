import java.lang.*;
import java.util.*;
public class P44GeometricSeries{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("we are now printing geometric series!");
        System.out.println("enter a, r and n values:");
        
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        
        int term = a;
        for(int i=0; i<n; i++){
            System.out.print(term + ",");
            term = term*r;
        }
    }
}
