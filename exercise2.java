import java.util.Scanner;



public class App {



    static Scanner scan = new Scanner(System.in);



    public static void main(String[] args) throws Exception {



        drive("Drive!");

        scan.close();

    }



    static void drive (String learning) {



        System.out.println("You are learning how to drive!");

        drive2(learning);



        String feedback = getFeedBack(learning);



        // Define the base case / stopping condition

        if (feedback.equals("no")) {



            // Do something to reach the goal

            instructor(learning);



            // Recursive call

            drive(learning);

        } else if (feedback.equals("yes")) {

            drive1(learning);

        }

    }



    static void drive2(String learning) {

        System.out.println("Testing your driving skills!");

    }



    static String getFeedBack(String learning) {

        System.out.println("Did I pass the driving test? (Enter \"yes\" or \"no\")");



        String feedback = scan.next();



        return feedback;

    }



    static void instructor(String learning) {

        System.out.print("Give a recommendation:");

        scan.nextLine();
        String recommendation = scan.nextLine();

        System.out.println("Retaking the driving test , bear in mind " + recommendation);

    }



    static void drive1(String learning) {

        System.out.println("You can now have your driving license");

    }



}
