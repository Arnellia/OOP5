package Controller;

import View.StudentView;
import model.Student;
import model.Type;
import model.User;
import service.DataService;

import javax.swing.*;

public class Controller {
    private final DataService service = new DataService ();

    private final StudentView view = new StudentView();

    public void createStudent (String firstName, String lastName, String middleName) {
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }

    public void getAllStudent(){
    List<User> userList = service.getAllStudent();
for (User user : userList) {
    Student student = (Student) user;
    view.printOnConsole(student);
}
    }

    public Group createGroup (int teacherId, int studentId) {
        Teacher teacher = getTeacherById(teacherId);

    }
}
