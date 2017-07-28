import java.util.Scanner;

public class Validator {



    public static String get_String(String prompt){


        boolean isValid = false;
        Scanner scan = new Scanner(System.in);
        String s = "";

        while (!isValid){ // loops until user enters a non-blank line for both entering name who they want to play against.
            System.out.print(prompt); //this will ways loop only when isValid is true which is when there is no input
            s = scan.nextLine();
            if (!s.equals(""))
                isValid = true;
        }
        return s;
    }

    public static String getString(String prompt){ //this method is to validate the user input to make sure they enter y or n

        String s = null;
        boolean isValid = false;
        while (!isValid){
            s = get_String(prompt);

            if (s.compareTo("Y") == 0 || s.compareTo("y") == 0 || s.compareTo("N") == 0 || s.compareTo("n") == 0)
                isValid = true;
            else
                System.out.println("Error! Entry must be 'y' or 'n'. Try again.");

        }
        return s;

    }

}