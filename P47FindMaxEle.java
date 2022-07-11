import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 25};
        int max = A[0];
        for(int i=0; i<A.length; i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        System.out.println(max);
    }
}
