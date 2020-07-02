import java.util.ArrayList;
import java.util.Scanner;

public class ContactTracingAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<String> symptoms = new ArrayList<>();
        ContactedPerson contactedPerson;

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

        System.out.println("We will now begin checking for symptoms, please enter one symptom to get started. " +
                "\nThen we will go through a list of common symptoms.");
            String symptom = sc.nextLine();
            symptoms.add(symptom);

            System.out.println("Has the patient experienced a fever? (Y/N)");
            String fever = sc.nextLine();
            if (fever.equalsIgnoreCase("y")) {
                switch (fever) {
                    case "y":
                        fever = "Fever";
                        break;
                }
                symptoms.add(fever);
                System.out.println("For how many days?");
                int days = sc.nextInt();
                sc.nextLine();
            }

            System.out.println("Has the patient experienced any coughing? (Y/N)");
            String cough = sc.nextLine();
            if (cough.equalsIgnoreCase("y")) {
                switch (cough) {
                    case "y":
                        cough = "Cough";
                        break;
                }
                symptoms.add(cough);
                System.out.println("For how many days?");
                int days = sc.nextInt();
                sc.nextLine();
            }

            System.out.println("Has the patient experienced any shortness of breath or difficulty breathing? (Y/N)");
            String breath = sc.nextLine();
            if (breath.equalsIgnoreCase("y")) {
                switch (breath) {
                    case "y":
                        breath = "Shortness of Breath";
                        break;
                }
                symptoms.add(breath);
                System.out.println("For how many days?");
                int days = sc.nextInt();
                sc.nextLine();
            }

            System.out.println("Has the patient experienced any tiredness? (Y/N)");
            String tired = sc.nextLine();
            if (tired.equalsIgnoreCase("y")) {
                switch (tired) {
                    case "y":
                        tired = "Tiredness";
                        break;
                }
                symptoms.add(tired);
                System.out.println("For how many days?");
                int days = sc.nextInt();
                sc.nextLine();
            }

            System.out.println("Has the patient experienced any aches? (Y/N)");
            String aches = sc.nextLine();
            if (aches.equalsIgnoreCase("y")) {
                switch (aches) {
                    case "y":
                        aches = "Aches";
                        break;
                }
                symptoms.add(aches);
                System.out.println("For how many days?");
                int days = sc.nextInt();
                sc.nextLine();
            }

            System.out.println("Has the patient experienced any chills? (Y/N)");
            String chills = sc.nextLine();
            if (chills.equalsIgnoreCase("y")) {
                switch (chills) {
                    case "y":
                        chills = "Chills";
                        break;
                }
                symptoms.add(chills);
                System.out.println("For how many days?");
                int days = sc.nextInt();
                sc.nextLine();
            }

            System.out.println("Has the patient experienced a sore throat? (Y/N)");
            String throat = sc.nextLine();
            if (throat.equalsIgnoreCase("y")) {
                switch (throat) {
                    case "y":
                        throat = "Sore Throat";
                        break;
                }
                symptoms.add(throat);
                System.out.println("For how many days?");
                int days = sc.nextInt();
                sc.nextLine();
            }

            System.out.println("Has the patient experienced loss of smell? (Y/N)");
            String smell = sc.nextLine();
            if (smell.equalsIgnoreCase("y")) {
                switch (smell) {
                    case "y":
                        smell = "Loss of Smell";
                        break;
                }
                symptoms.add(smell);
                System.out.println("For how many days?");
                int days = sc.nextInt();
                sc.nextLine();
            }

            System.out.println("Has the patient experienced loss of taste? (Y/N)");
            String taste = sc.nextLine();
            if (taste.equalsIgnoreCase("y")) {
                switch (taste) {
                    case "y":
                        taste = "Loss of Taste";
                        break;
                }
                symptoms.add(taste);
                System.out.println("For how many days?");
                int days = sc.nextInt();
                sc.nextLine();
            }

            System.out.println("Has the patient experienced headaches? (Y/N)");
            String headaches = sc.nextLine();
            if (headaches.equalsIgnoreCase("y")) {
                switch (headaches) {
                    case "y":
                        headaches = "Headache";
                        break;
                }
                symptoms.add(headaches);
                System.out.println("For how many days?");
                int days = sc.nextInt();
                sc.nextLine();
            }

            System.out.println("Has the patient experienced any diarrhea? (Y/N)");
            String diarrhea = sc.nextLine();
            if (diarrhea.equalsIgnoreCase("y")) {
                switch (diarrhea) {
                    case "y":
                        diarrhea = "Diarrhea";
                        break;
                }
                symptoms.add(diarrhea);
                System.out.println("For how many days?");
                int days = sc.nextInt();
                sc.nextLine();
            }

            System.out.println("Has the patient experienced severe vomiting? (Y/N)");
            String vomiting = sc.nextLine();
            if (vomiting.equalsIgnoreCase("y")) {
                switch (vomiting) {
                    case "y":
                        vomiting = "Vomiting";
                        break;
                }
                symptoms.add(vomiting);
                System.out.println("For how many days?");
                int days = sc.nextInt();
                sc.nextLine();
            }

            System.out.println("About how many days overall has the patient been experiencing symptoms?");
            int days = sc.nextInt();

            sc.nextLine();
            System.out.println("\nPlease enter information for one person the patient had contact with.");

            System.out.println("Enter the contacted person's name:");
            String contactName = sc.nextLine();

            System.out.println("Enter the contacted person's phone number:");
            String contactPhone = sc.nextLine();

            System.out.println("Enter the contacted person's e-mail address:");
            String contactEmail = sc.nextLine();

            Patient patient = new Patient(patientName, patientEmailAddress, patientPhoneNumber, patientCity, patientState, symptoms, days);
            patients.add(patient);

            contactedPerson = new ContactedPerson(contactName, contactPhone, contactEmail);


            System.out.println("\n --- COVID Tracing Report ---");
            for (Patient report : patients) {
                System.out.println(patients.toString());
                System.out.println(contactedPerson.toString('t'));
            }

    }
}
