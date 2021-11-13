package lesson5_lab2;

public class Staff {
    private String staffId;
    private String fullname;
    private String country;
    private String gender;
    private boolean status;
    private String note;

    public Staff() {
    }

    public Staff(String staffId, String fullname, String country, String gender, boolean status, String note) {
        this.staffId = staffId;
        this.fullname = fullname;
        this.country = country;
        this.gender = gender;
        this.status = status;
        this.note = note;
    }

    public Staff(String staffId, String fullname, String country, String gender, boolean status) {
        this.staffId = staffId;
        this.fullname = fullname;
        this.country = country;
        this.gender = gender;
        this.status = status;
        this.note = "";
    }

    public String getStaffId() {
        return staffId;
    }

    public String getFullname() {
        return fullname;
    }

    public String getCountry() {
        return country;
    }

    public String getGender() {
        return gender;
    }

    public boolean getStatus() {
        return status;
    }

    public String getNote() {
        return note;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
}
