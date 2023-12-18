import java.util.ArrayList;

public class ArrayListThreadSafe<Object> {
    private ArrayList<Object> arrayList;

    public ArrayListThreadSafe() {
        arrayList = new ArrayList<>();
    }

    public synchronized void addElement(Object element) {
        arrayList.add(element);
    }

    public synchronized void removeElement(Object element) {
        arrayList.remove(element);
    }

    public synchronized int getSize() {
        return arrayList.size();
    }

}
