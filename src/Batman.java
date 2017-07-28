/**
 * Created by gagandhillon on 7/25/17.
 */
public class Batman extends Player

{

    public Batman() {

        name = "Batman";
    }

//implements the generateRoshambo method from the Player class

    @Override

    public Roshambo generateRoshambo() {

        return Roshambo.ROCK;
    }

}
