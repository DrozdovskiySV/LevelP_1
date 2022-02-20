package lesson8.task1;

public interface Structure {

    int MAX_CAPACITY = 10;

    void add(int value);

    void remove(int value);

    void removeByIndex(int index);

    int getSize();

    boolean isEmpty();

//    default void addArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            add(array[i]);
//        }
//    }

}
