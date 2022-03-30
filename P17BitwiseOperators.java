import java.lang.*;
import java.util.*;
class P17BitwiseOperators 
{
    public static void main(String args[])
    {
        int x = 0b1010; //10 
        int y = 0b0110; //6 
        int z;
        z = x&y;
        System.out.println(z);
        
        int a = 10, b = 6, c;
        c = a&b;
        System.out.println(z);
        
        int val1 = 0b1010; //10 
        int val2 = 0b0110; //6 
        int val3;
        val3 = val1|val2;
        System.out.println(val3);
        
        int val4 = 0b1010; //10 
        int val5 = 0b0110; //6 
        int val6;
        val6 = val4^val5;
        System.out.println(val6);
        
        int val7 = 0b1000; //8 
        int val8;
        int val9;
        val8 = val7<<1;
        val9 = val7<<2;
        System.out.println(val8+" "+val9);
        
        int v1 = 0b1000; //8 
        int v2;
        int v3;
        v2 = v1>>1;
        v3 = v1>>2;
        System.out.println(v2+" "+v3);
        
        int v4 = -0b1010;
        int v5;
        v5 = v4 >> 1;
        System.out.println(v5);
        
        int v6 = -0b1010;
        int v7;
        v7 = v6 >>> 1;
        System.out.println(v7);
        
        int v8 = -0b1010;
        int v9;
        // v9 = v8>>1;
        v9 = v8>>>1;
        System.out.println(String.format("%s", Integer.toBinaryString(v8)));
        System.out.println(String.format("%32s", Integer.toBinaryString(v9))); //%32s places.
        
        int a1 = 0b1010;
        int a2;
        a2 = ~a1;
        System.out.println(String.format("%s", Integer.toBinaryString(a1)));
        System.out.println(String.format("%32s", Integer.toBinaryString(a2))); //%32s places.
        System.out.println(a2);
    }
}
