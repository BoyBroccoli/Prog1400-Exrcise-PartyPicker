import java.util.ArrayList;

public class Friend extends Person{
    ArrayList<String> foodToBring = new ArrayList<>();

    // Friend Constructor with Parameters
    Friend(String fName, String lName, boolean isInvited, ArrayList<String> food){
        super(fName, lName, isInvited);
        this.foodToBring=food;
    }

    // Empty Friend Constructor
    Friend(){}

    // Override Method to get the food a Friend is bringing
    @Override
    public ArrayList<String> getFoodToBring(){
        return this.foodToBring;
    }

    // Override Method to display friend information
    @Override
    public String toString(Friend friend){
        String info = super.getFullName() + " is bringing " +  friend.getFoodToBring() +".";
        if(super.isInvited){
            info += " They are invited to the party.";
        } else {
            info += " They are NOT invited to the party.";
        }

        return info;
    }

    public void setFoodToBring(String food){
        this.foodToBring.add(food);
    }
}
