import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private String speciality; 
    private Boolean Registered = true;
    private int healingPower;
    
    List<Patient> patients = new ArrayList<>();


    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;

        switch(speciality){
            case "Emergency Medicine":
                this.healingPower = 10;
                break;
            case "Dermatology":
                this.healingPower = 15;
                break;
            case "surgery":
                this.healingPower = 5;
                break;
        }
    }

    
    @Override
    public String toString() {
        return "Doctor [name=" + name + "]";
    }


    public void addPatientToList(Patient patient){
        patients.add(patient);
    }

    public void removePatient(Patient patient) { patients.remove(patient); }

    public void retrievePatientsList(){
        int i = 1;
        for(Patient patient : patients){
            System.out.println(i + ". " + patient.getName());
            i++;
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public Boolean getRegistered() {
        return Registered;
    }
    public void setRegistered(Boolean registered) {
        Registered = registered;
    }
    public int getHealingPower() {
        return healingPower;
    }
//    public void setHealingPower(String speciality) {
//        switch(speciality){
//            case "Emergency Medicine":
//                this.healingPower = 10;
//                break;
//            case "Dermatology":
//                this.healingPower = 15;
//                break;
//            case "surgery":
//                this.healingPower = 5;
//                break;
//        }
//        this.healingPower = healingPower;
//    }

}
