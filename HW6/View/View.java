package HW6.View;

import HW6.Controller.*;
// import HW6.Controller.GroupController;
// import HW6.Controller.GroupHeadController;
// import HW6.Controller.StudentController;
import HW6.Data.GroupHead;
import HW6.Data.Student;

/*
 *  Single responsibility principle (Принцип единственной ответственности)
        View отвечает только за вывод информации
 *  Open-closed principle (Принцип открытости/закрытости)
        Здесь не применимо
 *  Liskov substitution principle (Принцип подстановки Лисков)
        Здесь не применимо
 *  Interface segregation principle (Принцип разделения интерфейса)
        Здесь не применимо
 *  Dependency inversion principle (Принцип инверсии зависимостей)
        Задействованные класс не затрагиваются при работе с View
 */

public class View {
    private GroupController<Student, GroupHead> groupController = new GroupController<>();

    public View(GroupController<Student, GroupHead> groupController) {
        this.groupController = groupController;
    }

    public void viewStudents() {
        String print = "Group [" + groupController.getGroup().getNameGroup() +
                "]\n" + "\tСтароста группы " + groupController.getGroup().getGroupHead() + "\n\tCписок студентов: \n";
        for (Student student : groupController.getGroup().getGroup()
        ) {
            print += "\t\t" + student + "\n";
        }
        System.out.println(print);
    }


}
