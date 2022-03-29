import java.lang.*;
import java.util.*;

class P16IncrementDecrement 
{
    public static void main(String args[])
    {
        int x = 4;
        x++;
        System.out.println(x);
        int y = 4;
        ++y;
        System.out.println(y);
        int a = 4, b;
        b = a++;
        System.out.println(a+" "+b);
        int c = 4, d;
        d = ++c;
        System.out.println(c+" "+d);
        int p = 5, q = 4, r;
        r = 2*p++ + 3 * ++p;   //2*5 + 3*7
        System.out.println(r);
        
        float val1 = 3.5f;
        val1++;
        System.out.println(val1);
        
        char val2 = 'A';
        val2++;
        System.out.println(val2);
        
        byte val3 = 6;
        val3++;
        //val3 = val3+1----------------> adding byte type and int type can't be possible
        System.out.println(val3);
    }
}
