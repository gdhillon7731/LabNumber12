/**
 * Created by gagandhillon on 7/25/17.
 */
public enum Roshambo {

    ROCK, PAPER, SCISSORS;


    @Override
    public String toString(){
        switch(this){
            case ROCK:
                return "Rock";
            case PAPER:
                return "Paper";
            default:
                return "Scissors";
        }

    }

}
