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
    int amtOfDoctors = 0;
    Doctor doctor = new Doctor();
    while(amtOfDoctors < 3) {
        System.out.println("Give your doctor a name ");
        doctor.setName((scanner.nextLine()));
        while(doctor.getName().isBlank()) {
            doctor.setName(scanner.nextLine());
        }
        System.out.println("Give your doctor a specialty");
        System.out.println("Which speciality are you interested in? ");
        System.out.println("1. Emergency Medicine \n 2. Dermatology \n 3. Surgery");
        int specialityNum = scanner.nextInt();
        switch(specialityNum) {
            case 1:
                doctor.setSpeciality("Emergency Medicine");
                break;
            case 2:
                doctor.setSpeciality("Dermatology");
            case 3:
                doctor.setSpeciality("surgery");
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
// Match patients with speciality
    System.out.println("It's time to create some patients");
    System.out.println("Let's add 5 patients to the schedule");
    Patient patient = new Patient();
    int amtOfPatients = 0;
    while(amtOfPatients < 5){
        System.out.println("Name of patient ");
        patient.setName(scanner.nextLine());
         System.out.println("Which speciality are you interested in? ");
         System.out.println("1. Emergency Medicine \n 2. Dermatology \n 3. Surgery");
         int specialityNum = scanner.nextInt();
         switch(specialityNum) {
             case 1:
                 patient.setSpecialityNeed("Emergency Medicine");
                 break;
             case 2:
                 patient.setSpecialityNeed("Dermatology");
             case 3:
                 patient.setSpecialityNeed("surgery");
         }
         doctor.patients.add(patient);
         System.out.println("You have successfully created a patient");
        amtOfPatients = amtOfPatients + 1;
         // Use Switch case to return reducedHealth total int value
//         hospital.getDoctorSpecMap();
    }
    // We need to pair patients w the right doctors
    System.out.println("Pick a doctor to treat your patient");



    }

}
}


