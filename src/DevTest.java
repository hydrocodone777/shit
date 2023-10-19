import java.util.Scanner;
public class DevTest {
    public static Scanner testScan = new Scanner (System.in);
    public static void main(String[] args) {
//        String firstname = "";
//        firstname = getNonZeroLenString(testScan, "Enter your first name");
//        System.out.println("First name is " + firstname)
//    }
        int age = 0;
        age = getInt(testScan, "Enter your age");
        System.out.println("You said your age is: " + age);
    }
    /**
     * returns string from user must be one character at least
     * @param pipe the scanner to use for input
     * @param prompt the message for user to input
     * @return string of at least one character
     */
//    public static String getNonZeroLenString(Scanner pipe, String prompt)
//    {
//        boolean done = false;
//        String response = "";
//        do {
//            System.out.print(prompt + " : ");
//            response = pipe.nextLine();
//            if(response.length() > 0)
//                done = true;
//            else
//                System.out.println("\nEnter at least one character\n")
//        }
//        while(!done);
//        return response;
//        }
//    }
//    public static int getInt(Scanner pipe, String prompt)
//    {
//        boolean done = false;
//        String response = "";
//        int value = 0;
//        String trash = "";
//        do {
//            System.out.print(prompt + " : ");
//            if(pipe.hasNextInt()) {
//                value = pipe.nextInt();
//                pipe.nextLine();
//                done = true;
//            }
//            else
//                trash = pipe.nextLine();
//                System.out.println("\nEnter at least one character\n");
//        }
//        while(!done);
//        return value;
//    }
//    public static int getInt(Scanner pipe, String prompt)
//    {
//        boolean done = false;
//        String response = "";
//        int value = 0;
//        String trash = "";
//        do {
//            System.out.print(prompt + " : ");
//            if(pipe.hasNextInt()) {
//                value = pipe.nextInt();
//                pipe.nextLine();
//                done = true;
//            }
//            else
//                trash = pipe.nextLine();
//            System.out.println("\nEnter at least one character\n");
//        }
//        while(!done);
//        return value;
//    }
    public static int getInt(Scanner pipe, String prompt)
    {
        boolean done = false;
        String response = "";
        int value = 0;
        int low = 1;
        int high = 10;
        String trash = "";
        do {
            System.out.print(prompt + "With in range [1-10]: ");
            if(pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine();
                if (value >= 1 && value <= 10)
                    done = true;
                else
                    System.out.println("Invalid input try again");
            }
            else
                trash = pipe.nextLine();
                System.out.println("\nEnter at least one character\n");
        }
        while(!done);
        return value;
    }
    public static
}




