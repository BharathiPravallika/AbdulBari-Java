import java.lang.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        year = sc.nextInt();
        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    System.out.println("It's a leap year!");
                }
                else{
                    System.out.println("Not a leap year!");
                }
            }
            else{
                System.out.println("It's a leap year!");
            }
        }
        else{
            System.out.println("Not a leap year!");
        }
    }
}
