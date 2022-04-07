import java.lang.*;
import java.util.*;
class P38DomainExtension 
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your domain Name");
        String domain = sc.nextLine();
        String ext = domain.substring(domain.lastIndexOf(".")+1);
        switch(ext)
        {
            case "com": System.out.println("Commercial!");
                break;
            case "org": System.out.println("Organization");
                break;
            case "in": System.out.println("India");
                break;
        }
    }
}
