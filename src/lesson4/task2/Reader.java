package lesson4.task2;

import java.util.Arrays;
import java.util.Date;

public class Reader {
    String fio;
    String ticket;
    String faculty;
    Date birthday;
    String phoneNum;

    public Reader() {
    }

    public Reader(String fio, String ticket, String phoneNum) {
        this.fio = fio;
        this.ticket = ticket;
        this.phoneNum = phoneNum;
    }

    public Reader(String fio, String ticket, String faculty, Date birthday, String phoneNum) {
        this(fio, ticket, phoneNum);
        this.faculty = faculty;
        this.birthday = birthday;
    }

    public void takeBook(int booksCount) {
        System.out.println(fio + " взял " + booksCount + " книги");
    }

    public void takeBook(String[] booksArr) {
        System.out.print(fio + " взял книги: ");
        for (int i = 0; i < booksArr.length; i++) {
            System.out.print(booksArr[i] + (i == booksArr.length-1 ? "." : ", "));
        }
        System.out.println();
    }

    public void takeBook(Book[] booksArr) {
        System.out.print(fio + " взял книги: ");
        for (int i = 0; i < booksArr.length; i++) {
            System.out.print(booksArr[i].bookName + (i == booksArr.length-1 ? "." : ", "));
        }
        System.out.println();
    }

    public void returnBook(int booksCount) {
        System.out.println(fio + " вернул " + booksCount + " книги");
    }

    public void returnBook(String[] booksArr) {
        System.out.print(fio + " вернул книги: ");
        for (int i = 0; i < booksArr.length; i++) {
            System.out.print(booksArr[i] + (i == booksArr.length-1 ? "." : ", "));
        }
        System.out.println();
    }

    public void returnBook(Book[] booksArr) {
        System.out.print(fio + " вернул книги: ");
        for (int i = 0; i < booksArr.length; i++) {
            System.out.print(booksArr[i].bookName + (i == booksArr.length-1 ? "." : ", "));
        }
        System.out.println();
    }
}
