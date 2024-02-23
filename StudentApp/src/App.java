import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentStream;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Дима", 22);
        Student s4 = new Student("Сергей", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);
        Student s7 = new Student("Вова", 21);
        Student s8 = new Student("Катя", 20);

        List<Student> listStud = new ArrayList<Student>();
        List<Student> listStud2 = new ArrayList<Student>();
        List<Student> listStud3 = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);
        listStud3.add(s7);
        listStud3.add(s8);

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        StudentGroup group4581 = new StudentGroup(listStud2, 4581);
        StudentGroup group4579 = new StudentGroup(listStud3, 4579);
        System.out.println(group4580);
        System.out.println(group4581);
        System.out.println(group4579);

        System.out.println("=========================================================");
        // Создал список групп, который содержит в себе список студентов и номер группы
        StudentStream potok1 = new StudentStream(1);
        potok1.add(group4580);
        potok1.add(group4581);
        potok1.add(group4579);
        System.out.println(potok1);

        System.out.println("Список групп в потоке: " + potok1.getGrList().get(0).getIdGroup() +
                ", " + potok1.getGrList().get(1).getIdGroup() +
                ", " + potok1.getGrList().get(2).getIdGroup());

        System.out.println("=========================================================");


        for (Student std : group4580) {
            System.out.println(std);
        }

        System.out.println("=========================================================");
        //Вывод списка групп. Доавблено два варианта вывода списка групп
        System.out.println("Первый вариант вывода списка групп\n");
        for (StudentGroup grp : potok1) {
            System.out.println(grp);
        }

        System.out.println("\nВторой вариант вывода списка групп\n");

        for (int i = 0; i < potok1.getGrList().size(); i++) {
            System.out.println("Группа номер: " + potok1.getGrList().get(i).getIdGroup());
            for (int j = 0; j < potok1.getGrList().get(i).getGroup().size(); j++) {
                System.out.println(potok1.getGrList().get(i).getGroup().get(j).getName());
            }
        }
        System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());

        for (Student std : group4580.getGroup()) {
            System.out.println(std);
        }

        System.out.println("=========================================================");
        // Сортировка групп по количеству студентов и номеру группы
        System.out.println("Сортировка групп по количеству студентов в группе и номеру группы\n");
        Collections.sort(potok1.getGrList());

        for (StudentGroup grpSort : potok1.getGrList()) {
            System.out.println(grpSort);
        }

    }
}
