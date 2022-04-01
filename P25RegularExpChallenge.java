//Find if a number is Binary or not?
//Find if a number is Hexa-decomal or not?
//Find whether the data in date is date format or not(dd/mm/yyyy)?

import java.lang.*;
import java.util.*;
class P25RegularExpChallenge 
{
    public static void main(String args[])
    {
        //Binary check
        String b = "0110111";
        System.out.println(b.matches("[01]+"));     //true
        
        //Hexa-decomal check
        String H = "1235F";
        System.out.println(H.matches("[A-F0-9]+"));   //true
        
        //Date format 
        String D = "05/01/2000";
        System.out.println(D.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));  //true
    }
}
