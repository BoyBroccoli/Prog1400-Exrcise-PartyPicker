import java.util.ArrayList;

public class Friend extends Person{
    ArrayList<String> foodToBring = new ArrayList<String>();

    Friend(String fName, String lName, boolean isInvited, ArrayList<String> food){
        super(fName, lName, isInvited);
        this.foodToBring=food;
    }
}
