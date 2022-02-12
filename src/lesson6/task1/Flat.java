package lesson6.task1;

import java.util.Objects;

public class Flat {
    private String adressStr; // строка адреса до дома включительно
    private int num; // номер квартиры
    private Double square; // площадь
    private int floor; // этаж

    public Flat(String adressStr, int num, Double square, int floor) {
        this.adressStr = adressStr;
        this.num = num;
        this.square = square;
        this.floor = floor;
    }

    // уникальность квартиры достигается по 2 полям - адрес и номер
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flat flat = (Flat) o;
        return Objects.equals(adressStr,flat.adressStr) && Objects.equals(num, flat.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adressStr, num);
    }

}
