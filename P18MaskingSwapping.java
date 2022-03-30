import java.lang.*;
import java.util.*;
class P18MaskingSwapping 
{
    public static void main(String args[])
    {
        int a = 0b00000101;
        int b = 0b00001001;
        b = b << 4;
        System.out.println(Integer.toBinaryString(b));
        
        int p=10, q=15;
        p = p^q;
        q = p^q;
        p = p^q;
        System.out.println(p+" "+q);
        
        byte x=9, y=12;
        byte z;
        z = (byte) (x<<4);
        z = (byte)(z|y);
        System.out.println((z&0b11110000)>>4);
        System.out.println((z&0b00001111));
    }
}
