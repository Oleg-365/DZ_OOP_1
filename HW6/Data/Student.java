package HW6.Data;

/*
 *  Single responsibility principle (Принцип единственной ответственности)
        Класс студент наследуется от User (хранит ФИО) и хранит идентификационный номер.
 *  Open-closed principle (Принцип открытости/закрытости)
        Расширяет класс User, не вносим изменения в него.
 *  Liskov substitution principle (Принцип подстановки Лисков)
        Методы по работе с ФИО из класса User будут также работать и с классом Student
 *  Interface segregation principle (Принцип разделения интерфейса)
        Здесь не применимо
 *  Dependency inversion principle (Принцип инверсии зависимостей)
        Здесь не применимо
 */
public class Student extends User {
    private final int id;
    private static int idCounter = 1;

    public Student(String name, String surname, String patronymic) {
        super(name, surname, patronymic);
        this.id = idCounter++;
    }
    @Override
    public String toString() {
        return " [" + id + "] " + super.toString();
    }
}

// Параметризованный класс для представления группы студентов








