package HW4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Создать класс Учитель
 * Создать класс УчительСервис ;(добавляем валидацию)
 * Создать класс УчительВью;(Выводим в консоль)
 * Создать класс УчительКонтроллер(Работа с данными: принимает данные в класс Учитель и отправляет в Учитель вью)
 * и реализовать возможность создания, редактирования конкретного учителя и отображения списка учителей, имеющихся в системе.
 * Создать класс ГруппаУчителей
 * Добавить поле учитель в учебную группу
 */
public class Main {
    public static void main(String[] args) {

       //  test of TeacherController
//        TeacherController teacherController = new TeacherController();
//        teacherController.create("boris", "alfredovich", "aaa", LocalDate.of(1983, 02, 10));
//        teacherController.create("jon", "bond", "bbb", LocalDate.of(1977, 03, 11));
//        teacherController.create("Vasa", "Krikov", "Fleshovich", LocalDate.of(2000, 10, 01));
//        teacherController.create("Kolya", "Hoolin", "Aleksandrovich", LocalDate.of(2004, 01, 10));
//        teacherController.create("Zoya", "Norina", "Firda", LocalDate.of(2010, 03, 15));
//        teacherController.create("Vova", "Shilov", "Yshkin", LocalDate.of(2011, 05, 11));
//        teacherController.create("Lizza", "Mecheva", "Igorevna", LocalDate.of(2009, 06, 19));
//        teacherController.create("Polya", "Kubikova", "Antonovna", LocalDate.of(2006, 01, 01));
//        teacherController.create("Kostya", "Kosticyin", "Zurabovich", LocalDate.of(2010, 04, 05));



        Teacher teacher = new Teacher("Aleksey", "Sinicin", "Sergeevich", LocalDate.of(1985, 05, 15));
        Teacher teacher1 = new Teacher("Svetlana", "Pudovkina", "Antonovna", LocalDate.of(1978, 04, 10));
        List<Teacher> teachers = new ArrayList<>(List.of(teacher,teacher1));

        TeacherController groupTecher = new TeacherController();
        groupTecher.createTeacherGroup("group1",teachers);

        groupTecher.updateTeacherName("Aleksey", "Sinicin", "Sergeevich",
                "Kolya", "Hoolin", "Aleksandrovich");
        System.out.println(groupTecher);

    }
}
