import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {
    private String name;
    private Map<String, List<Doctor>> doctorSpecMap;
    public Map<String, List<Doctor>> getDoctorSpecMap() {
        return doctorSpecMap;
    }

    public Hospital(String name){
        this.name = name;
        this.doctorSpecMap = new HashMap<>();
    }

    public void addDoctorToSpecMap(String speciality, Doctor doctor) {
        List<Doctor> specialityCollection = doctorSpecMap.get(speciality);
        if(specialityCollection == null) {
            specialityCollection = new ArrayList<Doctor>();
            specialityCollection.add(doctor);
            this.doctorSpecMap.put(speciality, specialityCollection);
        } else {
            specialityCollection.add(doctor);
        }
    }

    public Map<String, List<Doctor>> getSpecMap() {
        return this.doctorSpecMap;
    }


    public String getName() {
        return name;
    }

}
