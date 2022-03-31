import java.lang.*;
import java.util.*;
public class P19StringBasics
{
	public static void main(String[] args) {
		String str1 = "Java program";
		
		String str2 = new String("JAVA");
		
		char c[] = {'H', 'e', 'l', 'l', 'o'};
		String str3 = new String(c);
		String str6 = new String(c,1,3); 
		System.out.println(str3); //Hello
		System.out.println(str6); //ell, first 1=index, 3=length
		
		byte b[] = {65, 66, 67, 68};
		String str4 = new String(b);
		String str5 = new String(b,2,2); //CD, first 2=index, second 2=length;
		System.out.println(str4); //ABCD 
		System.out.println(str5);
		
		/////////////////////////////////////////////////////////////////////////
		
		String s1 = "Java";
		String s2 = "Java"; //These two strings taking the same pool Object to store this literal. Unless you use new keyword
		String s3 = "java";
		System.out.println(s1 == s2); //true becaz both strings holding same objects.or maintaining a single object in a pool.
		System.out.println(s1==s3); //false
		
		
		/////////////////////////////////////////////////////////////////////////
		
		String st1 = "Java";
		String st2 = new String("Java");
		System.out.println(st1==st2); //false becaz new keyword will create a new object in heap.
		
		
		
		
	}
}
