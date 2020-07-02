import java.util.ArrayList;
import java.util.Scanner;

public class ContactTracingAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<String> symptoms = new ArrayList<>();
        ContactedPerson contactedPerson;
        ContactedPerson contactedPerson2;

        System.out.println("COVID Contact Tracing \nGet Started by entering the patient's information. \n");


            System.out.println("Please enter the patient's name:");
            String patientName = sc.nextLine();

            System.out.println("Please enter the patient's phone number:");
            String patientPhoneNumber = sc.nextLine();

            System.out.println("Please enter the patient's e-mail address:");
            String patientEmailAddress = sc.nextLine();

            System.out.println("Please enter the city where the patient lives:");
            String patientCity = sc.nextLine();

            System.out.println("Please enter the state where the patient lives:");
            String patientState = sc.nextLine();

        System.out.println();
            System.out.println("We will now begin checking for symptoms.");
            System.out.println("Has the patient experienced a fever? (Y/N)");
            String fever = sc.nextLine();
            if (fever.equalsIgnoreCase("y")) {
                System.out.println("For how many days?");
                int days2 = sc.nextInt();
                switch (fever) {
                    case "y":
                        fever = "\nFever for " + days2 + " days";
                        break;
                }
                symptoms.add(fever);
                sc.nextLine();
            }

            System.out.println("Has the patient experienced any coughing? (Y/N)");
            String cough = sc.nextLine();
            if (cough.equalsIgnoreCase("y")) {
                System.out.println("For how many days?");
                int days3 = sc.nextInt();
                switch (cough) {
                    case "y":
                        cough = "\nCough for " + days3 + " days";
                        break;
                }
                symptoms.add(cough);
                sc.nextLine();
            }

            System.out.println("Has the patient experienced any shortness of breath or difficulty breathing? (Y/N)");
            String breath = sc.nextLine();
            if (breath.equalsIgnoreCase("y")) {
                System.out.println("For how many days?");
                int days4 = sc.nextInt();
                switch (breath) {
                    case "y":
                        breath = "\nShortness of Breath for " + days4 + " days";
                        break;
                }
                symptoms.add(breath);
                sc.nextLine();
            }

            System.out.println("Has the patient experienced any tiredness? (Y/N)");
            String tired = sc.nextLine();
            if (tired.equalsIgnoreCase("y")) {
                System.out.println("For how many days?");
                int days5 = sc.nextInt();
                switch (tired) {
                    case "y":
                        tired = "\nTiredness for " + days5 + " days";
                        break;
                }
                symptoms.add(tired);
                sc.nextLine();
            }

            System.out.println("Has the patient experienced any aches? (Y/N)");
            String aches = sc.nextLine();
            if (aches.equalsIgnoreCase("y")) {
                System.out.println("For how many days?");
                int days6 = sc.nextInt();
                switch (aches) {
                    case "y":
                        aches = "\nAches for " + days6 + " days";
                        break;
                }
                symptoms.add(aches);
                sc.nextLine();
            }

            System.out.println("Has the patient experienced any chills? (Y/N)");
            String chills = sc.nextLine();
            if (chills.equalsIgnoreCase("y")) {
                System.out.println("For how many days?");
                int days7 = sc.nextInt();
                switch (chills) {
                    case "y":
                        chills = "\nChills for " + days7 + " days";
                        break;
                }
                symptoms.add(chills);
                sc.nextLine();
            }

            System.out.println("Has the patient experienced a sore throat? (Y/N)");
            String throat = sc.nextLine();
            if (throat.equalsIgnoreCase("y")) {
                System.out.println("For how many days?");
                int days8 = sc.nextInt();
                switch (throat) {
                    case "y":
                        throat = "\nSore Throat for " + days8 + " days";
                        break;
                }
                symptoms.add(throat);
                sc.nextLine();
            }

            System.out.println("Has the patient experienced loss of smell? (Y/N)");
            String smell = sc.nextLine();
            if (smell.equalsIgnoreCase("y")) {
                System.out.println("For how many days?");
                int days9 = sc.nextInt();
                switch (smell) {
                    case "y":
                        smell = "\nLoss of Smell for " + days9 + " days";
                        break;
                }
                symptoms.add(smell);
                sc.nextLine();
            }

            System.out.println("Has the patient experienced loss of taste? (Y/N)");
            String taste = sc.nextLine();
            if (taste.equalsIgnoreCase("y")) {
                System.out.println("For how many days?");
                int days10 = sc.nextInt();
                switch (taste) {
                    case "y":
                        taste = "\nLoss of Taste for " + days10 + " days";
                        break;
                }
                symptoms.add(taste);
                sc.nextLine();
            }

            System.out.println("Has the patient experienced headaches? (Y/N)");
            String headaches = sc.nextLine();
            if (headaches.equalsIgnoreCase("y")) {
                System.out.println("For how many days?");
                int days11 = sc.nextInt();
                switch (headaches) {
                    case "y":
                        headaches = "\nHeadache for " + days11 + " days";
                        break;
                }
                symptoms.add(headaches);
                sc.nextLine();
            }

            System.out.println("Has the patient experienced any diarrhea? (Y/N)");
            String diarrhea = sc.nextLine();
            if (diarrhea.equalsIgnoreCase("y")) {
                System.out.println("For how many days?");
                int days12 = sc.nextInt();
                switch (diarrhea) {
                    case "y":
                        diarrhea = "\nDiarrhea for " + days12 + " days";
                        break;
                }
                symptoms.add(diarrhea);
                sc.nextLine();
            }

            System.out.println("Has the patient experienced severe vomiting? (Y/N)");
            String vomiting = sc.nextLine();
            if (vomiting.equalsIgnoreCase("y")) {
                System.out.println("For how many days?");
                int days13 = sc.nextInt();
                switch (vomiting) {
                    case "y":
                        vomiting = "\nVomiting for " + days13 + " days";
                        break;
                }
                symptoms.add(vomiting);
                sc.nextLine();
            }

            System.out.println("About how many days overall has the patient been experiencing symptoms?");
            int days = sc.nextInt();

            sc.nextLine();
            System.out.println("\nPlease enter information for two people the patient had contact with.");

            System.out.println("Enter the contacted person's name:");
            String contactName = sc.nextLine();

            System.out.println("Enter the contacted person's phone number:");
            String contactPhone = sc.nextLine();

            System.out.println("Enter the contacted person's e-mail address:");
            String contactEmail = sc.nextLine();

            Patient patient = new Patient(patientName, patientEmailAddress, patientPhoneNumber, patientCity, patientState, symptoms, days);
            patients.add(patient);

            contactedPerson = new ContactedPerson(contactName, contactPhone, contactEmail);

        System.out.println("Enter the other contacted person's name:");
        String contactName2 = sc.nextLine();

        System.out.println("Enter the other contacted person's phone number:");
        String contactPhone2 = sc.nextLine();

        System.out.println("Enter the other contacted person's e-mail address:");
        String contactEmail2 = sc.nextLine();

        contactedPerson2 = new ContactedPerson(contactName2, contactPhone2, contactEmail2);

            System.out.println("\n --- COVID Tracing Report ---");
            for (Patient report : patients) {
                System.out.println(patients.toString());
                System.out.println(contactedPerson.toString('t'));
                System.out.println("\n" + contactedPerson2.toString(2));
            }

    }
}
