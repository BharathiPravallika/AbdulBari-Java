import java.lang.*;
import java.util.*;
class P33DayNumberDay 
{
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Day number:");
        num = sc.nextInt();
        if(num == 1){
            System.out.println("Hello Monday!");
        }
        else if (num == 2){
            System.out.println("Hello Tuesday!");
        } 
        else if (num == 3){
            System.out.println("Hello Wednesday!");
        } 
        else if (num == 4){
            System.out.println("Hello Thursday!");
        } 
        else if (num == 5){
            System.out.println("Hello Friday!");
        } 
        else if (num == 6){
            System.out.println("Hello Saturday!");
        } 
        else if (num == 7){
            System.out.println("Hello Sunday!");
        } 
        else {
            System.out.println("Invalid Day number");
        }
    }
}
