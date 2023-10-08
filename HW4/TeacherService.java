package HW4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService <T extends Teacher> {
    private List<Teacher> teacherList;


    public List<Teacher> getAll() {
        return teacherList;
    }

    public TeacherService() {
        this.teacherList = new ArrayList<>();
    }


    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth);
        teacherList.add(teacher);
    }
    public void update(Teacher teacher) {
        int index = teacherList.indexOf(teacher);
        if (index != -1) {
            teacherList.set(index, teacher);
        }
    }

    @Override
    public String toString() {
        return "teacherList: \n" + teacherList +
                '\n';
    }

    public Teacher getTeacherByName(String firstName, String secondName, String patronymic) {
        for (Teacher teacher : teacherList) {
            if (teacher.getFirstName().equals(firstName) &&
                    teacher.getSecondName().equals(secondName) &&
                    teacher.getPatronymic().equals(patronymic)) {
                return teacher;
            }
        }
        return null;
    }
}
