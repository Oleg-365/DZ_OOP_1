package HW6.Data;
/*
 *  Single responsibility principle (Принцип единственной ответственности)
        Абстрактный класс User выполняет функцию хранения ФИО
 *  Open-closed principle (Принцип открытости/закрытости)
        Здесь не применимо
 *  Liskov substitution principle (Принцип подстановки Лисков)
        Здесь не применимо
 *  Interface segregation principle (Принцип разделения интерфейса)
        Здесь не применимо
 *  Dependency inversion principle (Принцип инверсии зависимостей)
        Здесь не применимо
 */
abstract class User {
    protected String name;
    protected String surname;
    protected String patronymic;

    public User(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }
    @Override
    public String toString() {
        return name + ' ' +
                surname + ' ' +
                patronymic + ' ';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
