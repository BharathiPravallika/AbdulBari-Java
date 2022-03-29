import java.lang.*;
class P09Literals
{
    public static void main(String args[])
    {
        byte b1 = 10;          //Decimal
        byte b2 = 0b1010;      //Binary
        byte b3 = 012;         //Octal
        byte b4 = 0XA;         //HexaDecimal
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
---------------------------------------------------------------
    
    
    
import java.lang.*;
class P09Literals 
{
    public static void main(String args[])
    {
        long l = 999999999999l;
        int i = 125;
        float f = 12.56f;
        double d = 12.56d;
        long ll = 999_999_999l;
        float ff = 123_456f;
        
        System.out.println(l);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ll);
        System.out.println(ff);
    }
}
