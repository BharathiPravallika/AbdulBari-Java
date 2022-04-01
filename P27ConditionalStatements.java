import java.lang.*;
import java.util.*;
class P27ConditionalStatements 
{
    public static void main(String args[])
    {
        int a=5, b=10, c=15;
        System.out.println(a<b);  //true 
        System.out.println(a<b && a<c);   //true
        System.out.println(a<b && a>c); //false
        System.out.println(a<b || a>c); //true
        
        
        int n=5;
        if(n>=0){   //0 is also a +ve number.
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
        
        //maximum number among three numbers
        int p=55, q=15, r=4;
        if(p>q && p>r){
            System.out.println("p is Greater");
        }
        else if(q>r){
            System.out.println("q is Greater");
        }
        else{
            System.out.println("r is Greater");
        }
        
    }
}
