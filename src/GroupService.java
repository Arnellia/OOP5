import Controller.List;
import model.Teacher;

public class GroupService {
    public Group createGroup(Teacher teacher, List<Student> students){
        return new Group(teacher, students);

    }
}