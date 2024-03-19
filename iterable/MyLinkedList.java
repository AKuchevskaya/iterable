package iterable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyLinkedList<T> implements Iterable<T> {
    private List<T> items;

    public MyLinkedList(){
        this.items = new ArrayList<>();
    }
    
    // Метод добавления элемента
    public void add(T item) {
        items.add(item);
    }

    // Метод удаления элемента
    public void remove(T item) {
        items.remove(item);
    }

    // Метод получения элементов
    public void getDocuments() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    @Override
    public Iterator<T> iterator(){
        return items.iterator();
    }
}