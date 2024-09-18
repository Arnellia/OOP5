package model;

public class Student extends User {
    private int StudentId;

    public Student(String firstName, String lastName, String middleName, int studentId) {
        super(firstName, lastName, middleName);
        StudentId = studentId;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                '}';
    }
}
