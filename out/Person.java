package out;

public class Person {
    private String firstName;
    private String lastName;
    boolean isInvited;

    // Constructors
    
    Person(String fName, String lName, boolean invited){
        this.firstName=fName;
        this.lastName=lName;
        this.isInvited=invited;
    }

    Person(){};

    // Getters

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public boolean getIsInvited(){
        return this.isInvited;
    }

    // Setters

    public void setFirstName(String fname){
        this.firstName=fname;
    }

    public void setLastName(String lname){
        this.lastName=lname;
    }

    public void setIsInvited(Boolean invite){
        this.isInvited=invite;
    }

}
