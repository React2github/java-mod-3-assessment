import java.util.List;
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
    hospital.setName(response);
}
    System.out.println("Your hospital will now be called " + hospital.getName());
// Create 3 doctor instances w/ names and specialities
    System.out.println("It's time to hire some doctors!");
    System.out.println("Let's add 3 doctors to the team. ");
//    int amtOfDoctors = 0;
//    Doctor doctor = new Doctor();
    for(int i = 0; i < 3; i++) {
        System.out.println("Give your doctor a name ");
        String inputName = scanner.nextLine();
        System.out.println("Give your doctor a specialty");
        System.out.println("Which speciality are you interested in? ");
        System.out.println("1. Emergency Medicine \n 2. Dermatology \n 3. Surgery");
        int specialityNum = scanner.nextInt();
        scanner.nextLine();
        String specialityContainer = "";
        switch(specialityNum) {
            case 1:
               specialityContainer = "Emergency Medicine";
                break;
            case 2:
                specialityContainer = "Dermatology";
                break;
            case 3:
               specialityContainer = "surgery";
                break;
        }
        Doctor doctor = new Doctor(inputName, specialityContainer);
        System.out.println("Congrats! You added " + doctor.getName() + " to the team!");
        System.out.println(doctor.getSpeciality());
        hospital.addDoctorToSpecMap(doctor.getSpeciality(), doctor);
        System.out.println(hospital.getSpecMap());
    }
    System.out.println("We have enough doctors now!");
// Check Doctor is Registered 
    System.out.println("Let's register the doctors");
//    if(doctor.getRegistered()) {
//        System.out.println("Your doctor is in the system!");
//    } else {
//        System.out.println("We couldn't find your doctor in our system");
//    }
// Create 5 patients for the hospital 
// Display list of all specialities by doctors and let patients pick 
// Match patients with speciality
    System.out.println("It's time to create some patients");
    System.out.println("Let's add 5 patients to the schedule");
    for(int i = 0; i < 5; i++) {
        System.out.println("Name of patient ");
        String inputName = scanner.nextLine();
        System.out.println("Which speciality are you interested in? ");
        System.out.println("1. Emergency Medicine \n 2. Dermatology \n 3. Surgery");
        int specialityNum = scanner.nextInt();
        String specialityContainer = "";
        switch (specialityNum) {
            case 1:
                specialityContainer = "Emergency Medicine";
                break;
            case 2:
                specialityContainer = "Dermatology";
                break;
            case 3:
                specialityContainer = "surgery";
                break;
        }
        Patient patient = new Patient(inputName, specialityContainer);
        // Give patient option to add to doctor
        if(hospital.getSpecMap().containsKey(patient.getSpecialityNeed())) {
            List<Doctor> doctorsList = hospital.getDoctors(patient.getSpecialityNeed());

            System.out.println("Pick the number of a doctor to treat you");
            int amtOfDoctors = 0;
            for (Doctor doctor : doctorsList) {
                amtOfDoctors += 1;
                System.out.println(amtOfDoctors + ". " + doctor.getName());
            }
            int indexOfDoctor = scanner.nextInt();
            scanner.nextLine();
            Doctor inputDoctor = doctorsList.get(indexOfDoctor - 1);
            inputDoctor.addPatientToList(patient);
        }
    }

    // Time to treat patients
    System.out.println("Let's proceed to treat a patient");
    System.out.println("Please pick an aliment to treat: ");
    System.out.println("1. Emergency Medicine \n 2. Dermatology \n 3. Surgery");
    int inputAliment = scanner.nextInt();
    scanner.nextLine();
    String alimentContainer = "";
    switch(inputAliment) {
        case 1:
            alimentContainer = "Emergency Medicine";
            break;
        case 2:
            alimentContainer = "Dermatology";
            break;
        case 3:
            alimentContainer = "surgery";
            break;
    }
    System.out.println("You picked " + alimentContainer);
    System.out.println("Pick a doctor who specialize in " + alimentContainer);
    if(hospital.getSpecMap().containsKey(alimentContainer)) {
        List<Doctor> availableDoctors = hospital.getDoctors(alimentContainer);
        int indexOfAvailableDoctors = 0;
        for(Doctor doctor : availableDoctors) {
            indexOfAvailableDoctors += 1;
            System.out.println(indexOfAvailableDoctors + ". " + doctor.getName());
        }
        int chosenAvailableDoctor = 0;
        try {
            chosenAvailableDoctor = scanner.nextInt();
        } catch(Exception e) {
            System.out.println("Hey put a number dummy!");
        }

        Doctor chosenDoctor = availableDoctors.get(chosenAvailableDoctor);
        System.out.println("Which of these patients do you wanna treat?");
        chosenDoctor.retrievePatientsList();
        int chosenPatientToTreat = scanner.nextInt();
        String chosenPatientName = chosenDoctor.patients.get(chosenPatientToTreat).getName();
        System.out.println("You choose " + chosenPatientName);
        int healthIndex = chosenDoctor.patients.get(chosenPatientToTreat).getHealthIndex(chosenDoctor.getSpeciality());
        System.out.println(chosenPatientName + " has a health index of " + healthIndex);
        System.out.println(chosenDoctor.getName() + " attempts healing on " + chosenPatientName);
        chosenDoctor.setHealingPower(chosenDoctor.getSpeciality());
        int healingPower = chosenDoctor.getHealingPower();
        int newHealth = healthIndex + healingPower;
        chosenDoctor.patients.get(chosenPatientToTreat).setHealthIndex(newHealth);
        System.out.println(chosenPatientName + " has a new health Index of " + chosenDoctor.patients.get(chosenPatientToTreat).getHealthIndex(chosenDoctor.getSpeciality()));


    }
    }

}
}


