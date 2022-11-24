
//Q1 


package s1;
import java.util.regex.*;
 
public class Phone {
 
    public static boolean isValid(String s)
    {
 
        Pattern p = Pattern.compile(
            "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$");
          Matcher m = p.matcher(s);
         return (m.matches());
    }
 
    public static void main(String[] args)
    {
 
        String p = "2124567890";
        String p1 = "212-456-7890";
        String p2 = "(212)456-7890";
        String p3 = "(212)-456-7890";
        String p4 = "212.456.7890";
        String p5 = "2124567890";
        String p6 = "+12124567890";
        String p7 = "+12124567890";
        String p8 = "+1212.456.7890";
        String p9 = "+212-456-7890";
        String p10 = "1-212-456-7890";
 
        if (isValid(p)) 
        System.out.println("Valid Number-- 2124567890");
        else 
        System.out.println("Invalid Number-- 2124567890");
            
        if (isValid(p1))
        System.out.println("Valid Number-- 212-456-7890");
        else
        System.out.println("Invalid Number-- 212-456-7890");
        
         if (isValid(p2)) 
        System.out.println("Valid Number-- (212)456-7890");
        else 
        System.out.println("Invalid Number-- (212)456-7890");
            
        if (isValid(p3))
        System.out.println("Valid Number-- (212)-456-7890");
        else
        System.out.println("Invalid Number-- (212)-456-7890");
        
         if (isValid(p4)) 
        System.out.println("Valid Number-- 212.456.7890");
        else 
        System.out.println("Invalid Number-- 212.456.7890");
            
        if (isValid(p5))
        System.out.println("Valid Number-- 2124567890");
        else
        System.out.println("Invalid Number-- 2124567890");
        
         if (isValid(p6)) 
        System.out.println("Valid Number-- +12124567890");
        else 
        System.out.println("Invalid Number-- +12124567890");
            
        if (isValid(p7))
        System.out.println("Valid Number-- +12124567890");
        else
        System.out.println("Invalid Number-- +12124567890");
        
         if (isValid(p8)) 
        System.out.println("Valid Number-- +1212.456.7890");
        else 
        System.out.println("Invalid Number-- +1212.456.7890");
            
        if (isValid(p9))
        System.out.println("Valid Number-- +212-456-7890");
        else
        System.out.println("Invalid Number-- +212-456-7890");
        
         if (isValid(p10)) 
        System.out.println("Valid Number-- 1-212-456-7890");
        else 
        System.out.println("Invalid Number-- 1-212-456-7890");
            
    }
}
