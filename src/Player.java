import com.sun.org.apache.bcel.internal.generic.RETURN;
//Player abstract class


public abstract class Player {

    public String name;
    public String response;
    public Player() {}


    //SETTERS
    //set method for name
    public void setName(String name) {
        this.name = name;
    }

    //set method for response
    public void setResponse(String response) {
        this.response = response;
    }


    //get method for name
    public String getName() {
        return name;
    }

    //get method for response
    public void getResponse(String response) {
        this.response = response;
    }
    public String getResponse(){
        return response;
    }



    //abstract method that allows an inheriting class
    //to generate and return a Roshambo value

    public abstract Roshambo generateRoshambo();

}