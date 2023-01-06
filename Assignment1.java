import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

 

public class App {
    public static void main(String[] args) {

 

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Email Address: ");
        String Emailadd = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("\\w+[a-zA-Z]@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(Emailadd);
       
        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid Email Address");
        } else {
            System.out.println("invalid Email Address");
        }

        // Long method
        
        System.out.print("Enter your Phone Number: ");
        String phonenum = scan.nextLine(); 
        
       Pattern pattern1= Pattern.compile("09\\d{9}");
        Matcher matcher1 = pattern1.matcher(phonenum);
       
        match = matcher1.matches();

        if (match) {
            System.out.println("valid Phone Number");
        } else {
            System.out.println("invalid Phone Number");
        }

        
    }
}
