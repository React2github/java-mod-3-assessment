import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private String speciality; 
    private Boolean Registered = true;
    private int healingPower;
    
    List<Patient> patients = new ArrayList<>();

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
    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    } 

}
