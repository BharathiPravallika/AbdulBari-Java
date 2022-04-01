import java.lang.*;
import java.util.*;
class P22RegularExpMetaCharacters
{
    public static void main(String args[])
    {
        //Meta Character: "\w"
        String str1 = "a";  //Alphabets or digits.
        System.out.println(str1.matches("\\w")); //o/p: true 
        
        //Meta Character: "\W"
        String str2 = "&";  //Neither alphabet or digit 
        System.out.println(str2.matches("\\W")); //o/p: true 
        
        //Meta Character: "\s"
        String str3 = " ";   //space 
        System.out.println(str3.matches("\\s")); //o/p: true
        
        //Meta Character: "\S"
        String str4 = "a";  //not space 
        System.out.println(str4.matches("\\S")); //o/p:true 
        
        //Meta Character: "\d"
        String str5 = "5";   //digits
        System.out.println(str5.matches("\\d")); //o/p:true 
        
        //Meta Character: "\D"
        String str6 = "H"; //Not digits
        System.out.println(str6.matches("\\D")); //o/p:true
        
    }
}
