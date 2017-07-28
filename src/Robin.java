import java.util.Random;

public class Robin extends Player {

    public Robin() {

        name = "Robin";
    }

    //randomly selects rock,paper, or scissors
    //(a one in three chance)
    @Override
    public Roshambo generateRoshambo() {

        Random r = new Random();//the random method
        int rd = r.nextInt(3) +1;

        if (rd == 1) {
            return Roshambo.ROCK;

        } else if (rd == 2) {
            return Roshambo.PAPER;

        } else {
            return Roshambo.SCISSORS;

        }


    }

}



