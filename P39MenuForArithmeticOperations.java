import java.lang.*;
import java.util.*;
class P39MenuForArithmeticOperations 
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("-----");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        
        System.out.println("Enter two Numbers:");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter option in words:");
        String option = sc.nextLine();
        option = option.toUpperCase();
        
        
        switch(option){
            case "ADD": System.out.println("Addition: "+ (a+b));
                break;
            case "SUB": System.out.println("Substraction: "+ (a-b));
                break;
            case "MUL": System.out.println("Multiplication: "+ (a*b));
                break;
            case "DIV": System.out.println("Division: "+ (a%b));
                break;
            default : System.out.println("Invalid");
                break;
        }
    }
}
