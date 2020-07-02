import java.util.ArrayList;

public class Patient {
    private String patientName;
    private String patientEmailAddress;
    private String patientPhoneNumber;
    private String patientCity;
    private String patientState;
    private ArrayList<String> patientSymptoms;
    private int patientNumDaysWithSymptoms;
    ContactedPerson contactedPersons;

    //Default constructor
    public Patient(){}

    //Overloaded constructor
    public Patient (String patientName, String patientEmailAddress, String patientPhoneNumber,
                    String patientCity, String patientState, ArrayList<String> patientSymptoms, int patientNumDaysWithSymptoms){
        this.patientName = patientName;
        this.patientEmailAddress = patientEmailAddress;
        this.patientPhoneNumber= patientPhoneNumber;
        this.patientCity = patientCity;
        this.patientState = patientState;
        this.patientSymptoms = patientSymptoms;
        this.patientNumDaysWithSymptoms = patientNumDaysWithSymptoms;
    }

    //Getter & Setter patient name
    public String getPatientName(){
        return this.patientName;
    }
    public void setPatientName(String patientName){
        this.patientName = patientName;
    }

    //Getter & Setter patient email address
    public String getPatientEmailAddress(){
        return this.patientEmailAddress;
    }
    public void setPatientEmailAddress(String patientEmailAddress){
        this.patientEmailAddress = patientEmailAddress;
    }

    //Getter & Setter patient phone number
    public String getPatientPhoneNumber(){
        return this.patientPhoneNumber;
    }
    public void setPatientPhoneNumber(String patientPhoneNumber){
        this.patientPhoneNumber = patientPhoneNumber;
    }

    //Getter & Setter patient city
    public String getPatientCity(){
        return this.patientCity;
    }
    public void setPatientCity(String patientCity){
        this.patientCity = patientCity;
    }

    //Getter & Setter patient state
    public String getPatientState(){
        return this.patientState;
    }
    public void setPatientState(String patientState){
        this.patientState = patientState;
    }

    //Getter & Setter patient symptoms
    public ArrayList<String>getPatientSymptoms(){
        return this.patientSymptoms;
    }
    public void setPatientSymptoms(ArrayList<String> patientSymptoms){
        this.patientSymptoms = patientSymptoms;
    }

    //Getter & Setter patient symptoms
    public int getPatientNumDaysWithSymptoms(){
        return this.patientNumDaysWithSymptoms;
    }
    public void setPatientNumDaysWithSymptoms(int patientNumDaysWithSymptoms){
        this.patientNumDaysWithSymptoms = patientNumDaysWithSymptoms;
    }

    //Getter & Setter Contacted person
    public ContactedPerson getContactedPersons(){
        return this.contactedPersons;
    }
    public void setContactedPersons(ContactedPerson contactedPersons){
        this.contactedPersons = contactedPersons;
    }

    //Method for printing out
    public String toString(){
        return "Patient Name: " + this.patientName
            +"\nPhone Number: " + this.patientPhoneNumber
            +"\nE-mail: " + this.patientEmailAddress
            +"\nCity: " + this.patientCity + "  State: " + this.patientState
            +"\n\t\t\t --SYMPTOMS--"
            +"\n\t\t\t " + this.patientSymptoms
            +"\n\t\t\t Overall Number of Days with Symptoms: " + this.patientNumDaysWithSymptoms;
    }

}
