import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    private String specialityNeed;
    private int healthIndex = 0;
    List<Doctor> Doctors = new ArrayList<>();

    public Patient(String name, String specialityNeed) {
        this.name = name;
        this.specialityNeed = specialityNeed;
    }



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
    public int getHealthIndex(String speciality) {
            switch (speciality) {
                    case "Emergency Medicine":
                    this.healthIndex = 80;
                    break;
                    case "Dermatology":
                    this.healthIndex = 90;
                    break;
                    case "surgery":
                    this.healthIndex = 40;
                    break;
                    }
        return healthIndex;
    }
    public void setHealthIndex(int healthIndex) {
        this.healthIndex = healthIndex;
    }

}
