import java.lang.*;
import java.util.*;
class P15Cuboid 
{
    public static void main(String args[])
    {
        int height, length, breadth;
        double volume;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of height, length, and breadth");
        height = sc.nextInt();
        length = sc.nextInt();
        breadth = sc.nextInt();
        volume = length*breadth*height;
        area = 2*(length*height+breadth*height+length*breadth);
        System.out.println("Volume and area of a cuboid: "+volume+" "+area);
    }
}
