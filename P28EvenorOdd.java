//Find a number is odd or even?
import java.lang.*;
import java.util.*;
class P28EvenorOdd 
{
    public static void main(String args[])
    {
        //Even or odd 
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a%2 == 0){
            System.out.println("Given no. is even");
        }
        else{
            System.out.println("Given no. is odd");
        }
        
    }
}
