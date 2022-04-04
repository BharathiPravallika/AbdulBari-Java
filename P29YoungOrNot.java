//Find person is young or not young?
import java.lang.*;
import java.util.*;

class P29YoungOrNot 
{
    public static void main(String args[])
    {
        //Young or not Young 
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age >= 14 && age <= 55){
            System.out.println("Hey Young Girl!");
        }
        else{
            System.out.println("Not Young");
        }
        
        
    }
}
