import javax.swing.*; //importing JOptionPane
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {

        // Declaring Message Prompts
        String promptGreeting = "Welcome to the Party Picker. \n " +
                "\nEnter person's name and the type of food they're likely to bring, " +
                "\nthen indicate whether they are actually invited to the party or not.";
        String firstNamePrompt = "Enter first name";
        String lastNamePrompt = "Enter last name";
        String foodPrompt = "Enter the food they usually bring";
        String invitePrompt = "Choose if this guest is Invited or Not Invited";
        String anotherGuestPrompt = "Enter another guest?";


        JOptionPane.showMessageDialog(null,promptGreeting, "Greetings!", JOptionPane.INFORMATION_MESSAGE);

    }
}
