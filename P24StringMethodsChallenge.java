//Student Challenge1: Check whether the given string is gmail or not.
//Student Challenge2: print the username and domain of the given gmail.

import java.lang.*;
import java.util.*;
class P24StringMethodsChallenge 
{
    public static void main(String args[])
    {
        String str1 = "programmer@gmail.com";
        System.out.println(str1.matches(".*@gmail.*"));  //o/p: true. 
        
        int i = str1.indexOf("@");
        System.out.println(str1.substring(0,i));
        System.out.println(str1.substring(i+1,str1.length()));
        
        String domain = str1.substring(i+1,str1.length());  
        System.out.println(domain.equals("gmail.com"));   //true 
        System.out.println(domain.startsWith("gmail"));   //true 
    }
}
