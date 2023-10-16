package HW6.Controller;

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
public class StudentController <T extends Student>{
    private T student;
    public void loadStudent(T student){
        this.student = student;
    }

    public void createStudent(String name, String surname, String patronymic){
        this.student = (T) new Student(name,surname, patronymic);
    }
    public void changeName(String name, String lName, String pName){
        this.student.setName(name);
        this.student.setSurname(lName);
        this.student.setPatronymic(pName);
    }

    public T getStudent() {
        return student;
    }
}
