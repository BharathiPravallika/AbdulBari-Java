import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
        int A[] = {5, 9, 6, 10, 12, 7, 3, 5, 4, 2};
        for(int x:A)
            System.out.print(x + ",");
        System.out.println("");
        int temp = A[0];
        for(int i=1; i<A.length; i++){
            A[i-1] = A[i];
        }
        A[A.length-1] = temp;
        for(int x:A)
            System.out.print(x+",");
        System.out.println("");
    }
}


//OP:5,9,6,10,12,7,3,5,4,2,
//op:9,6,10,12,7,3,5,4,2,5,
