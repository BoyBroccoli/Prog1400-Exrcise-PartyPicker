import javax.swing.*; //importing JOptionPane
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {

        // Creating a Friend ArrayList
        ArrayList<Friend> friends = new ArrayList<Friend>();
        String userInput, userInput2, userInput3, userInput4;
        String[] buttonOptions = {"Invited", "Not Invited"};

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

        boolean runProgram = true;

        do{
            JOptionPane.showMessageDialog(null,promptGreeting, "Greetings!", JOptionPane.INFORMATION_MESSAGE);

            userInput = JOptionPane.showInputDialog(null, firstNamePrompt, title, JOptionPane.OK_CANCEL_OPTION);

            userInput2 = JOptionPane.showInputDialog(null, lastNamePrompt, title, JOptionPane.OK_CANCEL_OPTION);

            userInput3 = JOptionPane.showInputDialog(null,foodPrompt,title, JOptionPane.OK_CANCEL_OPTION);

            userInput4 = String.valueOf(JOptionPane.showOptionDialog(null, invitePrompt, title, JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, buttonOptions, buttonOptions[1]));


        } while(runProgram == true);





    }
}
