import java.lang.*;
import java.util.*;
class 42CountNumbers 
{
    public static void main(String args[]){
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println(count);

    }
}
