import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    private String specialityNeed; 
    private int healthIndex;
    List<Doctor> Doctors = new ArrayList<>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSpecialityNeed() {
        return specialityNeed;
    }
    public void setSpecialityNeed(String specialityNeed) {
        this.specialityNeed = specialityNeed;
    }
    public int getHealthIndex() {
        return healthIndex;
    }
    public void setHealthIndex(int healthIndex) {
        this.healthIndex = healthIndex;
    }

}
