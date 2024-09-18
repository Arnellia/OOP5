import Controller.List;
import model.Teacher;

}import model.Teacher;

public class Group {
    private Teacher teacher;
    private List<Student> students;

    public GroupService(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Group(Teacher teacher, List<Student> students) {
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}