package lesson4.task2;

public class Test {
    public static void main(String[] args) {
        Reader[] readers = new Reader[5];
        readers[0] = new Reader("Иванов А.А.", "000456", "+79051234567");
        readers[1] = new Reader("Петров С.С.", "001234", "+79052345678");
        readers[2] = new Reader("Сидоров В.В.", "000067", "+79057654321");

        Book[] books = new Book[3];
        books[0] = new Book("Приключения");
        books[1] = new Book("Словарь");
        books[2] = new Book("Энциклопедия");
        String[] bookNames = new String[]{"Приключения","Словарь","Энциклопедия"};

        // int
        readers[1].takeBook(3);
        readers[1].returnBook(3);
        // массив String
        readers[1].takeBook(bookNames);
        readers[1].returnBook(bookNames);
        // массив Book
        readers[1].takeBook(books);
        readers[1].returnBook(books);

    }
}
