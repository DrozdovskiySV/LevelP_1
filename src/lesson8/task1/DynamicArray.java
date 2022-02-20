package lesson8.task1;

// Структура данных - список на основе массива
// Список - набор однотипных элементов
//   - присутствуют дубликаты
//   - у списков есть индексы (т.е. можно получить элемент списка по индексу)
//   - вставка
//      - в начало, в середину и в конец
//          add(int index, int value) -> add(1, 5);
//          [1, 44, 85, 23] -> [1, 5, 44, 85, 23]
//          add(int value) -> add(6)
//          [1, 5, 44, 85, 23] -> [1, 5, 44, 85, 23, 6]
//          addFirst(int value) -> addFirst(50); (add(0, 50))
//          [1, 5, 44, 85, 23, 6] -> [50, 1, 5, 44, 85, 23, 6]
//   - удаление
//      - из начала, из середина и из конца

import java.util.Arrays;

// new Object[59] -> DynamicArray -> add()
public class DynamicArray extends AbstractList {

    private int[] elements;
    // Размер списка (количетсво элементов в списке)
    // Индексы для вставки в конец массива elements
    // private int size;

    // elements: [0, 0, 0], size = 0
    // add(78): [78, 0, 0], size = 1
    // add(98): [78, 98,0], size = 2
    // add(4):  [78, 98, 4], size = 3
    // add(12): [78, 98, 4, 0, 0, 0] -> [78, 98, 4, 12, 0, 0], size = 4

    public DynamicArray() {
        this.elements = new int[3];
        this.size = 0;
    }

    // Добавляет элемент в спиок (в конец списка)
    @Override
    public void add(int value) {
        if (elements.length == size) {
            ensureCapacity();
        }
        elements[size] = value;
        size++; // -> size = size + 1;
    }

    // Добавляет элемент в начало списка
    public void addFirst(int value) {
        if (elements.length == size) {
            ensureCapacity();
        }
        // addFirst(9): [3, 5, 4] -> [9, 3, 5, 4]
        // addFirst(2): [4, 5, 0, 0, 0] -> [2, 4, 5, 0, 0]

        // [4, 5, 0, 0, 0] -> [2, 4, 5, 0, 0]
        // [4, 5, 0, 0]    -> [4, 4, 5, 0, 0]
        System.arraycopy(elements, 0, elements, 1, size - 1);
        elements[0] = value;  // [4, 5, 0, 0]    -> [4, 4, 5, 0, 0]  -> [2, 4, 5, 0, 0]
        size++;
    }

    private void ensureCapacity() {
        // 1. Сохранение текущего массива
        int[] temp = elements;
        // 2. Создние нового массива
        elements = new int[temp.length * 2];
        // 3. Копирование старого массива в новый
        System.arraycopy(temp, 0, elements, 0, temp.length);
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < size; i++) {
            res = res + elements[i] + (i+1 == size ? "" : ", ");
        }
        return "DynamicArray{" + res + '}';
    }

    @Override
    public void remove(int value) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == value) {
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

