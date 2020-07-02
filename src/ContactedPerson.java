public class ContactedPerson {
    String contactedName;
    String contactedEmailAddress;
    String contactedPhoneNumber;

    //Default constructor
    public ContactedPerson(){}

    //Overloaded constructor
    public ContactedPerson (String contactedName, String contactedPhoneNumber, String contactedEmailAddress){
        this.contactedName = contactedName;
        this.contactedEmailAddress = contactedEmailAddress;
        this.contactedPhoneNumber = contactedPhoneNumber;
    }

    //Getter & Setter Contacted name
    public String getContactedName(){
        return this.contactedName;
    }
    public void setContactedName(String contactedName){
        this.contactedName = contactedName;
    }

    //Getter & Setter Contacted email address
    public String getContactedEmailAddress(){
        return this.contactedEmailAddress;
    }
    public void setContactedEmailAddress(String contactedEmailAddress){
        this.contactedEmailAddress = contactedEmailAddress;
    }

    //Getter & Setter phone number
    public String getContactedPhoneNumber(){
        return this.contactedPhoneNumber;
    }
    public void setContactedPhoneNumber(String contactedPhoneNumber){
        this.contactedPhoneNumber = contactedPhoneNumber;
    }
    //Method for printing out contacted person info
    public String toString (char contacted){
        return "\n\t\t\t --CONTACT--"
                + "\n\t\t\tName: " +  this.contactedName
                + "\n\t\t\tPhone Number: " +this.contactedPhoneNumber
                + "\n\t\t\tEmail: " + this.contactedEmailAddress;
    }
    public String toString (int contacted2){
        return "\n\t\t\t --CONTACT--"
                + "\n\t\t\tName: " +  this.contactedName
                + "\n\t\t\tPhone Number: " +this.contactedPhoneNumber
                + "\n\t\t\tEmail: " + this.contactedEmailAddress;
    }
}

