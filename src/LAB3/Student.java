package LAB3;

public class Student {
    private String stID;
    private String stName;
    private String stClass;

    public Student() {
        this.stID = "";
        this.stName ="";
        this.stClass = "";
    }

    public Student(String stID, String stName, String stClass) {
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
    }

    public Student (Student st){
        this.stID = st.getStID();
        this.stName = st.getStName();
        this.stClass = st.getStClass();

    }

    public String getStID() {
        return stID;
    }

    public void setStID(String stID) {
        this.stID = stID;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStClass() {
        return stClass;
    }

    public void setStClass(String stClass) {
        this.stClass = stClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stID='" + stID + '\'' +
                ", stName='" + stName + '\'' +
                ", stClass='" + stClass + '\'' +
                '}';
    }
}
