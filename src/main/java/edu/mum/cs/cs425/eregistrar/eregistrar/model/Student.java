package edu.mum.cs.cs425.eregistrar.eregistrar.model;

public class Student {
    private Long studentId;
    private String studentNumber;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private int cgpa;
    private String enrollmentDate;
    private String isInternational;

    public Student(Long studentId, String studentNumber, String firstName, String middleName, String lastName, int cgpa, String enrollmentDate, String isInternational) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        FirstName = firstName;
        MiddleName = middleName;
        LastName = lastName;
        this.cgpa = cgpa;
        this.enrollmentDate = enrollmentDate;
        this.isInternational = isInternational;
    }

    public Student(String studentNumber, String firstName, String middleName, String lastName, int cgpa, String enrollmentDate, String isInternational) {
        this.studentNumber = studentNumber;
        FirstName = firstName;
        MiddleName = middleName;
        LastName = lastName;
        this.cgpa = cgpa;
        this.enrollmentDate = enrollmentDate;
        this.isInternational = isInternational;
    }

    public Student() {
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getCgpa() {
        return cgpa;
    }

    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getIsInternational() {
        return isInternational;
    }

    public void setIsInternational(String isInternational) {
        this.isInternational = isInternational;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", cgpa=" + cgpa +
                ", enrollmentDate='" + enrollmentDate + '\'' +
                ", isInternational='" + isInternational + '\'' +
                '}';
    }
}
