//Method 1:
import java.lang.*;
import java.util.*;
class P13AreaOfaTriangle
{
  public static void main(String[] args)
  {
    float base, height, area;
    System.out.println("Enter the values of base and height");
    Scanner sc = new Scanner(System.in);
    base = sc.nextFloat();
    height = sc.nextFloat();
    area = (base * height)/2;
    System.out.println("Area of a triangle is:"+ area);
  }
}
//---------------------------------------------
//Method 2:
import java.lang.*;
import java.util.*;
class P13AreaOfaTriangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        float s;
        double area;
        System.out.println("Enter three sides of trainagle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        s = (a+b+c)/2f;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of a triangle is: "+area);
    }
}
