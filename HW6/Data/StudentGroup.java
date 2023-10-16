package HW6.Data;

import java.util.ArrayList;

/*
 *  Single responsibility principle (Принцип единственной ответственности)
        Класс ГруппаСтудентов отвечает только за хранение информации о группе студентов:
        * Имя группы
        * Список студентов
        * Староста группы
 *  Open-closed principle (Принцип открытости/закрытости)
        Здесь не применимо
 *  Liskov substitution principle (Принцип подстановки Лисков)
        Здесь не применимо
 *  Interface segregation principle (Принцип разделения интерфейса)
        Здесь не применимо
 *  Dependency inversion principle (Принцип инверсии зависимостей)
        Здесь не применимо
 */
public class StudentGroup<T extends Student, S extends GroupHead> {
    private String nameGroup;
    private S groupHead;


    private ArrayList<T> group;

    public S getGroupHead() {
        return groupHead;
    }

    public void setGroupHead(T student) {
        S head = (S) new GroupHead(student, nameGroup);
        this.groupHead = head;
    }


    public StudentGroup(String nameGroup, S groupHead, ArrayList<T> group) {
        this.nameGroup = nameGroup;
        this.group = group;
        this.groupHead = groupHead;
    }

    public StudentGroup(String nameGroup) {
        this.group = new ArrayList<>();
        this.nameGroup = nameGroup;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public ArrayList<T> getGroup() {
        return group;
    }

    public void setGroup(ArrayList<T> group) {
        this.group = group;
    }

    public void add(T student) {
        this.group.add(student);
    }

    public void remove(T student) {
        this.group.remove(student);
    }

}
