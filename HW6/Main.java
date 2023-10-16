package HW6;

// import HW6.Controller.*;
import HW6.Controller.GroupController;
import HW6.Controller.GroupHeadController;
import HW6.Controller.StudentController;
import HW6.Data.*;
import HW6.View.View;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        GroupController<Student, GroupHead> groupController = new GroupController<>();

        Student student1 = new Student("George", "Washington", "Alexandrovich");
        Student student2 = new Student("James", "Bond", "Viktorovich");
        Student student3 = new Student("John", "Dow", "Igorevich");


        groupController.createGroup("A");
        groupController.addStudentToGroup(student1);
        groupController.addStudentToGroup(student2);
        groupController.addStudentToGroup(student3);
        groupController.setHeadGroup(student1);

        View view = new View(groupController);
        view.viewStudents();

    }
}