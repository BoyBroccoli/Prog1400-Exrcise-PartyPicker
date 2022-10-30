import java.util.ArrayList;

public class Friend extends Person{
    ArrayList<String> foodToBring = new ArrayList<String>();

    Friend(String fName, String lName, boolean isInvited, ArrayList<String> food){
        super(fName, lName, isInvited);
        this.foodToBring=food;
    }

    Friend(){};

    @Override
    public ArrayList<String> getFoodToBring(){
        return this.foodToBring;
    }

    public void setFoodToBring(String food){
        this.foodToBring.add(food);
    }

    // Method to display friend information
    public String friendToString(Friend friend){
        String info = super.getFullName() + " is bringing " +  friend.getFoodToBring() +".";
        if(super.isInvited){
            info += " They are invited to the party.";
        } else {
            info += " They are NOT invited to the party.";
        }

        return info;
    }
}
