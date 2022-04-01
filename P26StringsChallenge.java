//Remove Special characters from a String
//Remove Extra spaces from a string 
//Find no. of words in a string.
import java.lang.*;
import java.util.*;
class P26StringsChallenge 
{
    public static void main(String args[])
    {
        
        //Remove Special characters from a String
        String str1 = "Bharathi5%@#999"; 
        System.out.println(str1.replaceAll("[!@#$%^&*]", ""));  //o/p: Bharathi5999
        System.out.println(str1.replaceAll("[^A-Za-z0-9]", ""));  //o/p: Bharathi5999
        
        
        //Remove Extra spaces from a string 
        String str2 = "      Bharathi     pravallika   S           ";
        System.out.println(str2.replaceAll("\\s+", " ").trim()); //o/p:Bharathi pravallika S
        
        //Find no. of words in a string.
        String str3 = "    Bharathi pravallika sagireddy";
        str3 = str3.replaceAll("\\s", " ").trim();
        String words[] = str3.split("\\s");
        System.out.println(words.length);

    }
}
