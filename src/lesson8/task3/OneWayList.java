package lesson8.task3;

// Однонаправленный связный список
public class OneWayList<T> extends AbstractList<T> {

    private ListElement head;

    @Override
    public void add(T value) {
        ListElement el = new ListElement(value);
        if (head == null) {
            head = el;
        } else {
            ListElement cursor = head;
            while (cursor.getNext() != null) {
                cursor = cursor.getNext();
            }
            // cursor указывает на последний элемент списка
            cursor.setNext(el);
        }
        size++;
    }

    @Override
    public String toString() {
        ListElement el = head;
        String res = "";
        while (el != null) {
            res = res + el.getValue().toString();
            el = el.getNext();
            if (el != null) res = res + ", ";
        }
        return "OneWayList{" + res + '}';

    }

    @Override
    public void remove(T value) {
        ListElement el = head;
        ListElement elPrev = null;
        while (el != null) {
            if (el.getValue().equals(value)) {
                if (el == head) head = el.getNext();
                else elPrev.setNext(el.getNext());
                size--;
                break;
            }
            else {
                elPrev = el;
                el = el.getNext();
            }
        }
    }

    @Override
    public void removeByIndex(int index) {
        ListElement el = head;
        ListElement elPrev = null;
        int ind = 0;
        while (el != null) {
            if (ind == index) {
                if (el == head) head = el.getNext();
                else elPrev.setNext(el.getNext());
                size--;
                break;
            }
            else {
                elPrev = el;
                el = el.getNext();
                ind++;
            }
        }
    }


}