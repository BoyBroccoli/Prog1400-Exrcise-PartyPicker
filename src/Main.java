import javax.swing.*; //importing JOptionPane
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {

        // Creating a Friend ArrayList
        ArrayList<Friend> friends = new ArrayList<Friend>();
        String userInput;
        StringBuilder report = new StringBuilder(); // Using StringBuilder to append report results instead of +=
        String[] buttonOptions = {"Invited", "Not Invited"};
        int choice;
        int index = 0;

        // Declaring Message Prompts
        String promptGreeting = """
                Welcome to the Party Picker!
                
                Enter person's name and the type of food they're likely to bring,
                then indicate whether they are actually invited to the party or not.
                """;
        String firstNamePrompt = "Enter first name";
        String lastNamePrompt = "Enter last name";
        String foodPrompt = "Enter the food they usually bring";
        String invitePrompt = "Choose if this guest is Invited or Not Invited";
        String anotherGuestPrompt = "Enter another guest?";
        String title = "Party Picker";

        boolean continueProgram = false;


        // Displaying Welcome Prompt
        JOptionPane.showMessageDialog(null,promptGreeting, title, JOptionPane.INFORMATION_MESSAGE);
        Friend friend1 = new Friend();

        do{
            // Asking user to input friends first name
            userInput= JOptionPane.showInputDialog(null, firstNamePrompt, title, JOptionPane.OK_CANCEL_OPTION);
            friend1.setFirstName(userInput);

            // Asking user ot input friends last name
            userInput = JOptionPane.showInputDialog(null, lastNamePrompt, title, JOptionPane.OK_CANCEL_OPTION);
            friend1.setLastName(userInput);

            // Asking user the food the friend is bringing.
            userInput = JOptionPane.showInputDialog(null,foodPrompt,title, JOptionPane.OK_CANCEL_OPTION);
            friend1.setFoodToBring(userInput);

            // Asking user if the friend is invited or not.
            choice =
                    JOptionPane.showOptionDialog(null, invitePrompt, title, JOptionPane.DEFAULT_OPTION,
                            JOptionPane.WARNING_MESSAGE, null, buttonOptions, buttonOptions[1]);
            if (choice == 0){
                    friend1.setIsInvited(true);
            } else{
                friend1.setIsInvited(false);
            }

            // Adding friend to friends arrayList
            friends.add(friend1);

            // Asking user if they want to add another guest
            choice =
                    JOptionPane.showConfirmDialog(null, anotherGuestPrompt,
                            title, JOptionPane.YES_NO_OPTION);
            if (choice == 0){ // yes continue program
                continueProgram = true;
            } else { // no end program
                continueProgram = false;
            }

        } while(continueProgram);

        // for each loop to gather results from friends arrayList
        for (Friend currentFriend: friends){
            report.append(currentFriend.toString(currentFriend));
        }

        // Displaying final results to user
        JOptionPane.showMessageDialog(null, report.toString(), title, JOptionPane.INFORMATION_MESSAGE);





    }
}
