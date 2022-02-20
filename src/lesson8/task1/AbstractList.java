package lesson8.task1;

// Абстрактный класс
//  1. Нельзя создать объект данного класса
//  2. Абстрактный класс может иметь абстрактные методы
public abstract class AbstractList implements Structure {

    protected int size;

    public abstract void add(int value);

    // addArray(int[] array)
    public void addArray(int[] array) {
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
