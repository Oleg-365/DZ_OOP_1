package HW4;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class TeacherController <T extends Teacher>{

    private final TeacherService dataService = new TeacherService();
    private final TeacherGroupService teacherGroupService = new TeacherGroupService();
    private final TeacherView teacherView = new TeacherView();


    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }

    public void createTeacherGroup(String teacher, List<Teacher> teachers){
        teacherGroupService.createTeacherGroup(teacher, teachers);
        teacherView.sendOnConsoleUserGroup(teacherGroupService.getTeacherGroup());
    }


    public void getTeacherInTeacherGroup(String firstName, String secondName){
        Teacher teacher = teacherGroupService.getTeacherFromTeacherGroup(firstName, secondName);
        teacherView.sendOnConsole(Collections.singletonList(teacher));
    }

    public void getSortedListTeacherFromTeacherGroup(){
        List<Teacher> teachers = teacherGroupService.getSortedTeacherGroup();
        teacherView.sendOnConsole(teachers);
    }

    public void getSortedListByFIOTeacherFromTeacherGroup(){
        List<Teacher> teachers = teacherGroupService.getSortedByFIOTeacherGroup();
        teacherView.sendOnConsole(teachers);
    }
    public void updateTeacherName(String firstName, String secondName, String patronymic, String newFirstName, String newSecondName, String newPatronymic) {
        Teacher teacher = dataService.getTeacherByName(firstName, secondName, patronymic);
        if (teacher != null) {
            teacher.setFirstName(newFirstName);
            teacher.setSecondName(newSecondName);
            teacher.setPatronymic(newPatronymic);
            dataService.update(teacher);
            teacherView.sendOnConsole(dataService.getAll());
        } else {
            teacherView.sendOnConsole(Collections.emptyList());
        }
    }

    @Override
    public String toString() {
        return " TeacherController: " +
                " dataService: " + dataService +
                "\n" + teacherGroupService +
                " teacherView: " + teacherView +
                ' ';
    }
}
