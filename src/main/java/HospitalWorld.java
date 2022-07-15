import java.util.Scanner;

public class HospitalWorld {
    public static void main(String[] args) {
System.out.println("Welcome, you are the new CEO of a major hospital. ");
System.out.println("Start by naming the new hospital ");
try (Scanner scanner = new Scanner(System.in)) {
    String response = scanner.nextLine();
    Hospital hospital = new Hospital(response);
// Error handling for hospital name
while(hospital.getName().isBlank()) {
    response = scanner.nextLine();
}
    System.out.println("Your hospital will now be called " + hospital.getName());
// Create 3 doctor instances w/ names and specialities
    System.out.println("It's time to hire some doctors!");
    System.out.println("Let's add 3 doctors to the team. ");
    int amtOfDoctors = 0;
    Doctor doctor = new Doctor();
    while(amtOfDoctors < 3) {
        System.out.println("Give your doctor a name ");
        doctor.setName((scanner.nextLine()));
        while(doctor.getName().isBlank()) {
            doctor.setName(scanner.nextLine());
        }
        System.out.println("Give your doctor a specialty");
        doctor.setSpeciality((scanner.nextLine()));
        while(doctor.getSpeciality().isBlank()) {
            doctor.setSpeciality(scanner.nextLine());
        }
        System.out.println("Congrats! You added " + doctor.getName() + " to the team!");
        hospital.addDoctorToSpecMap(doctor.getSpeciality(), doctor);
        System.out.println(hospital.getSpecMap());
        amtOfDoctors = amtOfDoctors + 1;
    }
    System.out.println("We have enough doctors now!");
// Check Doctor is Registered 
    System.out.println("Let's register the doctors");
    if(doctor.getRegistered()) {
        System.out.println("Your doctor is in the system!");
    } else {
        System.out.println("We couldn't find your doctor in our system");
    }
// Create 5 patients for the hospital 
// Display list of all specialities by doctors and let patients pick 
// Match patients with doctors based on speciality
    System.out.println("It's time to create some patients");
    System.out.println("Let's add 5 patients to the schedule");
    Patient patient = new Patient();
    // Patient.getName() = new ArrayList<>();
    // Patient.speciality = new ArrayList<>();
    // Patient.pairList = new ArrayList<>();
    int amtOfPatients = 0;
    while(amtOfPatients < 5){
        System.out.println("Name of patient ");
        patient.setName(scanner.nextLine());
        while(patient.getName().isBlank()) {
            patient.setName(scanner.nextLine());
        }
        // System.out.println("Which speciality are you interested in? ");
        // System.out.println("1: " + doctors.speciality.get(0));
        // System.out.println("2: " + doctors.speciality.get(1));
        // System.out.println("3: " + doctors.speciality.get(2));
        // int specialityNum = reader.nextInt();
        // String pairings = Patient.name.get(amtOfPatients) + " paired with " + doctors.name.get(specialityNum-1);
        // Patient.pairList.add(pairings);
        // System.out.println(pairings);
        amtOfPatients = amtOfPatients + 1;
    }

// Create new hospital instance using hospital class here with name 

// use Logger to create three doctors using Doctor class (name & speciality)

// Check if doctors are in the system using boolean logic 

// Create 5 patients using patient class 
// Allow patients to match with doctors based on need 


    }

}
}


