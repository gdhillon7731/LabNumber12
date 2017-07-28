import java.util.Scanner;

public class RoshamboApp {

    public static void main(String args[]) {

        Scanner scan=new Scanner(System.in);
        String choice="y";
        char player;
        Player p = null;
        String name;
        Batman b = new Batman();//create 2-objects of Batman and Robin. This lets me use them in this class from the batman and robin class
        Robin r =new Robin();

        //Welcoming prompt
        System.out.println("Welcome to the game of Roshambo\n");


        // input name. val.get string pulls the get_string method which makes sure the users puts something in from val class.
        name = Validator.get_String("Enter your name : ");
        // val.get_get string method which makes sure like above the user enters something
        String playerChoice = Validator.get_String("Would you like to play against Batman or Robin? (B/R): ");
        // setting player to take in a char PlayerChoice  takes in the input
        player = playerChoice.charAt(0);


        //either Batman
        if(player =='b' || player == 'B'){
            p = b; //setting Player p to either bB or rR
        }
        else if(player =='r' || player == 'R'){
            p = r;
        }


        //we set Player to either r or b which we refer to later
        if(playerChoice.charAt(0)=='b' || playerChoice.charAt(0) == 'B') playerChoice = "Batman";
        else if(playerChoice.charAt(0)=='r' || playerChoice.charAt(0) == 'R') playerChoice = "Robin";

        p.setName(playerChoice); //sets the name of the opponent



        //repeating loop with character variable choice
        while(choice.compareTo("y") == 0){

            System.out.print("Rock, paper or scissors?(R/P/S) : ");
            String rpsInput = scan.next();
            Player1 p1 = new Player1(); //new player which is the user.

            p1.setName(name); //sets user's name as name in Player.java
            p1.setResponse(rpsInput);//sets user input of either rps as response in Player.java



            //if statement that will ignore case of input when selecting rock, paper or scissor
            if(rpsInput.equalsIgnoreCase("r")) {
                rpsInput = "Rock";
            }
            else if(rpsInput.equalsIgnoreCase("p")) {
                rpsInput = "Paper";
            }
            else if(rpsInput.equalsIgnoreCase("s")) {
                rpsInput = "Scissors";
            }

            System.out.println(name+ " : " + rpsInput);



            //main logic generate random number only ones.Each time it will give different number
            String roshambo = p.generateRoshambo().toString(); //generate opponent's roshambo
            System.out.println(p.getName()+ " : " + roshambo );


            if(rpsInput.equals("Paper") && roshambo.equals("Paper")) {
                System.out.println("Draw!");
            }

            else if(rpsInput.equals("Rock") && roshambo.equals("Rock")) {
                System.out.println("Draw!");
            }

            else if(rpsInput.equals("Scissors") && roshambo.equals("Scissors")) {
                System.out.println("Draw!");
            }

            else if(rpsInput.equals("Paper") && roshambo.equals("Rock")) {
                System.out.println(p1.getName()+" Wins");
            }

            else if(roshambo.equals("Paper") && rpsInput.equals("Rock")) {
                System.out.println(p.getName()+" Wins");
            }

            else if(rpsInput.equals("Paper") && roshambo.equals("Scissors")) {
                System.out.println(p.getName()+" Wins!");
            }

            else if(roshambo.equals("Paper") && rpsInput.equals("Scissors")) {
                System.out.println(p1.getName()+" Wins!");
            }

            else if(rpsInput.equals("Scissors") && roshambo.equals("Rock")) {
                System.out.println(p.getName()+" Wins");
            }

            else if(roshambo.equals("Scissors") && rpsInput.equals("Rock")) {
                System.out.println(p1.getName()+" Wins");
            }

            // see if the user wants to continue
            choice = Validator.getString("Play again?(y/n): ");
            System.out.println();

        }

    }

}





