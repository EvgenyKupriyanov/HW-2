package Domain;

import java.util.Iterator;
import java.util.List;
// Итератор для группы студентов
public class GroupIterator implements Iterator<StudentGroup>{
    private int counter;
    private final List<StudentGroup> groups;

    public GroupIterator(List<StudentGroup> groups) {
        this.groups = groups;
        this.counter = 0;
    }


    public boolean hasNext() {
        return counter < groups.size();
    }

    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        // counter++;
        return groups.get(counter++);
    }

}
