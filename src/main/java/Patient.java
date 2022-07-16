public class Patient {
    private String name;
    private int amtOfTreatment;
    private String specialityNeed;

    public int getAmtOfTreatment() {
        return amtOfTreatment;
    }

    private int healthIndex = 0;

    public Patient(String name, String specialityNeed) {
        this.name = name;
        this.specialityNeed = specialityNeed;

        switch (specialityNeed) {
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
    public void setHealthIndex(int healthIndex) {
        this.healthIndex = healthIndex;
    }
    public void setAmtOfTreatment(int amtOfTreatment) {
        this.amtOfTreatment = amtOfTreatment;
    }
    public int getHealthIndex(){
        return healthIndex;
    }

}
