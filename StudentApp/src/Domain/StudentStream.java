package Domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// Класс для потока групп, показывающий поток и список групп.
public class StudentStream implements Iterable<StudentGroup>{
    private int numStream;

    private List<StudentGroup> grList; // Список групп одного потока

    public StudentStream(int numStream) {
        grList = new ArrayList<>();
        this.numStream = numStream;
    }

    public int getNumStream() {
        return numStream;
    }

    public List<StudentGroup> getGrList() {
        return grList;
    }

    public void add(StudentGroup group) {
        grList.add(group);
    }


    @Override
    public String toString() {
        return "Номер потока: " + numStream +
                ", список групп: " + grList +
                '.';
    }

//Итератор групп студентов
    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator(grList);
    }

}
