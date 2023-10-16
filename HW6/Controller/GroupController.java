package HW6.Controller;

import HW6.Data.GroupHead;
import HW6.Data.Student;
import HW6.Data.StudentGroup;

import java.util.ArrayList;
/*
 *  Single responsibility principle (Принцип единственной ответственности)
        GroupController отвечает только за работу с группой студентов
 *  Open-closed principle (Принцип открытости/закрытости)
        Здесь не применимо
 *  Liskov substitution principle (Принцип подстановки Лисков)
        Здесь не применимо
 *  Interface segregation principle (Принцип разделения интерфейса)
        Здесь не применимо
 *  Dependency inversion principle (Принцип инверсии зависимостей)
        Здесь не применимо
 */


// Контроллер для работы с группами студентов
public class GroupController<T extends Student, S extends GroupHead> {
    private StudentGroup<T,S> group;

    public void createGroup(String groupName) {
        this.group = new StudentGroup<>(groupName);
    }

    public void initializeStudents(ArrayList<T> students){
        this.group.setGroup(students);
    }

    public void loadGroup(StudentGroup<T,S> group){
        this.group = group;
    }

    public void addStudentToGroup(T student) {
        group.add(student);
    }

    public void removeStudentFromGroup(T student) {
        group.remove(student);
    }
    public void setHeadGroup(T student) {
        group.setGroupHead(student);
    }

    public void removeHeadGroup() {;
        group.setGroupHead(null);
    }

    public StudentGroup<T, S> getGroup() {
        return group;
    }
}
