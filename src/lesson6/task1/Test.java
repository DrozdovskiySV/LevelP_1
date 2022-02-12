package lesson6.task1;

public class Test {

    public static void main(String[] args) {
        Flat[] flats = new Flat[10];
        flats[0] = new Flat("Адрес1",10, 32.2, 3);
        flats[1] = new Flat("Адрес1",15, 52.5, 10);
        flats[2] = new Flat("Адрес2",10, 32.2, 3);
        flats[3] = new Flat("Адрес2",15, 52.5, 9);

        Flat flatForFind1 = new Flat("Адрес2",10, 32d, 3);
        Flat flatForFind2 = new Flat("Адрес2",11, 100d, 3);

        FlatStorage flatStorage = new FlatStorage(flats);
        System.out.println("Квартира flatForFind1 " + (flatStorage.exist(flatForFind1) ? "найдена" : "не найдена"));
        System.out.println("Квартира flatForFind2 " + (flatStorage.exist(flatForFind2) ? "найдена" : "не найдена"));

    }
}
