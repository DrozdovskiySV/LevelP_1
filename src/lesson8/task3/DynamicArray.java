package lesson8.task3;

public class DynamicArray extends AbstractList {

    private Object[] elements;

    public DynamicArray() {
        this.elements = new Object[3];
        this.size = 0;
    }

    // Добавляет элемент в спиок (в конец списка)
    @Override
    public void add(Object value) {
        if (elements.length == size) {
            ensureCapacity();
        }
        elements[size] = value;
        size++;
    }

    // Добавляет элемент в начало списка
    public void addFirst(Object value) {
        if (elements.length == size) {
            ensureCapacity();
        }
        System.arraycopy(elements, 0, elements, 1, size - 1);
        elements[0] = value;
        size++;
    }

    private void ensureCapacity() {
        Object[] temp = elements;
        elements = new Object[temp.length * 2];
        System.arraycopy(temp, 0, elements, 0, temp.length);
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < size; i++) {
            res = res + elements[i].toString() + (i+1 == size ? "" : ", ");
        }
        return "DynamicArray{" + res + '}';
    }

    @Override
    public void remove(Object value) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(value)) {
                if (i+1 != size) System.arraycopy(elements, i+1, elements, i, size - i-1);
                size--;
                break;
            }
        }
    }

    @Override
    public void removeByIndex(int index) {
        if (index < size) {
            if (index+1 != size) System.arraycopy(elements, index+1, elements, index, size - index-1);
            size--;
        }
    }
}

