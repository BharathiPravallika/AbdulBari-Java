import java.lang.*;
import java.util.*;
class P21RegularExpMatchingSymbols 
{
    public static void main(String args[])
    {
        //1. Regular expression: "."
        String str1 = "f";
        System.out.println(str1.matches("."));  //it can be anything but should be only one character/number/etc..
        //o/p: true 
        
        //2.Regular expression: "[abc]"
        String str2 = "a";  //can be anything among abc. But only one character.
        System.out.println(str2.matches("[abc]"));
        //o/p: true 
        
        //3.Regular expression: "[abc][vz]"
        String str3 = "bv";  //it shoud one among abc and one among v to z.
        System.out.println(str3.matches("[abc][vz]"));
        //o/p: true
        
        
        //4.Regular expression: [^abc]
        String str4 = "p"; //can be any one character except abc.
        System.out.println(str4.matches("[^abc]"));
        //o/p: true 
        
        //5.Regular expression: [a-z0-9]
        String str5 = "5";
        System.out.println(str5.matches("[a-z1-7]"));
        //o/p: true;
        
        //6.Regular expression: [a-z][0-9]
        String str6 = "b5"; //one character can't allowed. you should give two.
        System.out.println(str6.matches("[a-z][0-9]"));
        //o/p: true;
        
        //7.Regular expression: [A \ B]
        String str7 = "A";
        System.out.println(str7.matches("[A|B]"));
        //o/p: true.
        
        //8.Regular expression: "abc"
        String str8 = "abc";  //you should give exact order and exact characters.
        System.out.println(str8.matches("abc"));
        //o/p: true;
        
        
    }
    
}
