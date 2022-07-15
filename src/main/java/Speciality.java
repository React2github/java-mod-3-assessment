
public class Speciality {
    private String name;
    private int numberOfTreatments;
    private boolean cureable;
    private int ailmentScore;
    private int treatmentGain;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumberOfTreatments() {
        return numberOfTreatments;
    }
    public void setNumberOfTreatments(int numberOfTreatments) {
        this.numberOfTreatments = numberOfTreatments;
    }
    public boolean isCureable() {
        return cureable;
    }
    public void setCureable(boolean cureable) {
        this.cureable = cureable;
    }
    public int getAilmentScore() {
        return ailmentScore;
    }
    public void setAilmentScore(int ailmentScore) {
        this.ailmentScore = ailmentScore;
    }
    public int getTreatmentGain() {
        return treatmentGain;
    }
    public void setTreatmentGain(int treatmentGain) {
        this.treatmentGain = treatmentGain;
    } 

}
