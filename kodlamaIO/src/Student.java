public class Student extends User{

        public Student (String firstName,String lastName,String TCNo,String schoolNumber){
            this.schoolNumber = schoolNumber;
            this.firstName = firstName;
            this.lastName = lastName;
            this.TCNo = TCNo;

        }
    private String schoolNumber;

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber;
    }
}

