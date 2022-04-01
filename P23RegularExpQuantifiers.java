import java.lang.*;
import java.util.*;
class P23RegularExpQuantifiers 
{
    public static void main(String args[])
    {
        //Regular expression Quantifiers
        
        //Quantifier: "*" ----->Any number of times allowed
        String str1 = "abcdef";
        System.out.println(str1.matches(".*")); //o/p: true.
        System.out.println(str1.matches("[a-z]*"));  //o/p: true.
        
        System.out.println(str1.matches("[a-z]+")); //"+" means one or more no. of times allowed. //o/p: true;
        
        String str2 = "abb";
        System.out.println(str2.matches("[abc]{3}")); //here 3 is length and o/p : true.
        System.out.println(str2.matches("[abc]{3,7}")); //here the range of chars can be between 3 and upto 7. //o/p: true.
        
        String str3 = "bharathipravallika@gmail.com";
        System.out.println(str3.matches(".*@gmail.*")); //true
        System.out.println(str3.matches("\\w*@gmail(.*)")); //o/p: true.
        
    }
}
