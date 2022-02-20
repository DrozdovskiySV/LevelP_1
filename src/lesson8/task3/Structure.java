package lesson8.task3;

public interface Structure {

    int MAX_CAPACITY = 10;

    void add(Object value);

    void remove(Object value);

    void removeByIndex(int index);

    int getSize();

    boolean isEmpty();

//    default void addArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            add(array[i]);
//        }
//    }

}
