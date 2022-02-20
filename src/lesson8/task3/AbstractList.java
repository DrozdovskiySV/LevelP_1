package lesson8.task3;

// Абстрактный класс
//  1. Нельзя создать объект данного класса
//  2. Абстрактный класс может иметь абстрактные методы
public abstract class AbstractList<T> implements Structure<T> {

    protected int size;

    public abstract void add(T value);

    public void addArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            add(array[i]);
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
