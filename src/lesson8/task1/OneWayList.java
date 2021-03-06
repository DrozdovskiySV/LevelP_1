package lesson8.task1;

import java.util.Arrays;
import java.util.Collections;

// Однонаправленный связный список
public class OneWayList extends AbstractList {

    private ListElement head;
    // private ListElement tail;
    // private int size;

    // add(57):
    //   el1(34) -> el2(54) -> el3(23)
    //   el4(57) - объект класса ListElement
    //   el1.next -> el2, el2.next -> el3, el3.next = null,
    //   el3.next = el4
    @Override
    public void add(int value) {
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
            res = res + el.getValue();
            el = el.getNext();
            if (el != null) res = res + ", ";
        }
        return "OneWayList{" + res + '}';

    }

    @Override
    public void remove(int value) {
        ListElement el = head;
        ListElement elPrev = null;
        while (el != null) {
            if (el.getValue() == value) {
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