package HW6.Data;
 /*
    *  Single responsibility principle (Принцип единственной ответственности)
        Класс Староста отвечает только за хранение информации о старосте
    *  Open-closed principle (Принцип открытости/закрытости)
        Класс Староста расширяет класс Студент, не изменяя его.
    *  Liskov substitution principle (Принцип подстановки Лисков)
        Класс Староста будет работать корректно со всеми методами, которые используют студента
    *  Interface segregation principle (Принцип разделения интерфейса)
        Не использует интерфейс
    *  Dependency inversion principle (Принцип инверсии зависимостей)
        Класс Студент не зависит от класса Староста
*/

public class GroupHead extends Student{

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    private String groupName;
    private GroupHead(String name, String surname, String patronymic, String groupName) {
        super(name, surname, patronymic);
        this.groupName = groupName;
    }

    public GroupHead(Student student, String groupName){
        this(student.name, student.surname, student.patronymic, groupName);
    }

    @Override
    public String toString() {
        return '['+groupName + "] " + name + ' ' +
                surname + ' ' +
                patronymic + ' ';
    }
}
