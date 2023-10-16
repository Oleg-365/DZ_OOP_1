package HW6.Controller;

import HW6.Data.GroupHead;
import HW6.Data.Student;

/*
 *  Single responsibility principle (Принцип единственной ответственности)
        StudentController отвечает только за работу с определенным студентом
 *  Open-closed principle (Принцип открытости/закрытости)
        Здесь не применимо
 *  Liskov substitution principle (Принцип подстановки Лисков)
        Здесь не применимо
 *  Interface segregation principle (Принцип разделения интерфейса)
        Здесь не применимо
 *  Dependency inversion principle (Принцип инверсии зависимостей)
        Здесь не применимо
 */
public class GroupHeadController <T extends GroupHead>{
    private T head;

    public void load(T head){
        this.head = head;
    }

    public void create(Student student, String groupName){
        this.head = (T) new GroupHead(student, groupName);
    }

    public void changeName(String name, String lName, String pName){
        this.head.setName(name);
        this.head.setSurname(lName);
        this.head.setPatronymic(pName);
    }

    public void setGroup(String groupName){
        this.head.setGroupName(groupName);
    }
    public String getGroup(){
        return this.head.getGroupName();
    }

    public T getHead() {
        return head;
    }
}