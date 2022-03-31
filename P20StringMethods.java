import java.lang.*;
import java.util.*;
class P20StringMethods
{
    public static void main(String args[])
    {
        String str = new String("Bharathi pravallika");
        System.out.println(str.length()); //19
        
        int len = str.length();
        System.out.println(len); //19
        
        //Lowercase
        String l = str.toLowerCase();
        System.out.println(l); //bharathi pravallika 
        
        //Uppercase
        String u = str.toUpperCase();
        System.out.println(u); //BHARATHI PRAVALLIKA
        
        //trim 
        String str1 = new String("I           Love              Myself");
        System.out.println(str1); //I           Love              Myself
        str1 = str1.trim();
        System.out.println(str1); //I Love Myself
        
        //substring
        String sub = str.substring(3);
        System.out.println(sub); //rathi pravallika
        String s = str.substring(3, 5);
        System.out.println(s); //ra
        
        String str2 = new String("Welcome to Amazon Bharathi pravallika!");
        String replace = str2.replace('W', 'P');
        System.out.println(replace); //Pelcome to Amazon Bharathi pravallika!
        
        //startsWith()
        System.out.println(str.startsWith("pra", 9)); //checking the starting of the string index. //true
        
        
        //endsWith()
        System.out.println(str.endsWith("ka")); //is string ends with ka? //o/p:true
        String name = new String("Supriya Sagireddy");
        System.out.println(name.endsWith("reddy"));  //true
        
        //charAt()
        String Dream = "Amazon";
        for(int i=0; i<Dream.length(); i++)
            //System.out.println(i);
            //System.out.println(Dream.charAt(i));
            System.out.println(Dream.charAt(i));  //Amazon
        
        
        //indexOf()
        String fav = "MangoJuice.com";
        System.out.println(fav.indexOf(".")); //10
        
        //lastIndex()
        String momName = "Padmavathi.sagireddy";
        int result = momName.lastIndexOf(".");
        System.out.println(result); //10
        
        //boolean equals()
        String a1 = "Bharathi pravallika";
        String a2 = "Bharathi pravallika";
        System.out.println(a1.equals(a2)); //true
        System.out.println(a1.equalsIgnoreCase(a2)); //true
        System.out.println(a1 == a2); //true
        
        //two different objects in heap 
        String abc1 = "Bharathi pravallika";
        String abc2 = new String("Bharathi pravallika");
        System.out.println(abc1 == abc2); //false
        
        //compareTo()
        String compareto = "Bharathi pravallika is my Favourite";
        String compareto1 = "Bharathi Pravallika is my Favourite";
        System.out.println(compareto.compareTo(compareto1)); //-11  Dictionary order comparision for difference
        
        //contains()
        String m1 = "India is a great Country!";
        System.out.println(m1.contains("great"));  //true
        
        //concat()
        String m2 = "Bharathi is so Beautiful!";
        String m3 = " Pravallika has a lot of patience!";
        System.out.println(m2.concat(m3));
        System.out.println(m2+m3);
        
        //valueOf()
        int value=30;  
        String s1=String.valueOf(value);  
        System.out.println(s1+10);//concatenating string with 10 o/p:3010
        
        
        
    }
}
