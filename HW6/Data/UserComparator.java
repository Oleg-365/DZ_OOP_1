package HW6.Data;

import java.util.Comparator;
/*
 *  Single responsibility principle (Принцип единственной ответственности)
        Класс UserComparator выполняет только одну функцию - сравнение двух объектов Класса User по ФИО
 *  Open-closed principle (Принцип открытости/закрытости)
        Здесь не применимо
 *  Liskov substitution principle (Принцип подстановки Лисков)
        Здесь не применимо
 *  Interface segregation principle (Принцип разделения интерфейса)
        Здесь не применимо
 *  Dependency inversion principle (Принцип инверсии зависимостей)
        Здесь не применимо
 */
class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSurname().compareTo(o2.getSurname());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getName().compareTo(o2.getName());
            if (resultOfComparing == 0) {
                return o1.getPatronymic().compareTo(o2.getPatronymic());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}