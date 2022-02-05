package lesson4.task1;

public class Test {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+79052984882","Xiaomi", 200d);
        Phone phone2 = new Phone("+79114945778", "Iphone", 100d);
        Phone phone3 = new Phone("+79634567878","Samsung", 170d);

        System.out.println(phone1.model + " " + phone1.getNumber() + " " + phone1.weight);
        System.out.println(phone2.model + " " + phone2.getNumber() + " " + phone2.weight);
        System.out.println(phone3.model + " " + phone3.getNumber() + " " + phone3.weight);

        System.out.println();
        phone1.receiveCall("Вася");
        phone2.receiveCall("Маша");
        phone3.receiveCall("Петя");

        System.out.println();
        phone1.receiveCall("Вася","+79115677878");
        phone2.receiveCall("Маша", "+79631234567");
        phone3.receiveCall("Петя", "+79062223344");

        System.out.println();
        System.out.println("Отправка сообщений на номера:");
        String[] phonesArr = new String[]{phone1.getNumber(), phone2.getNumber(), phone3.getNumber()};
        Phone.sendMessages(phonesArr, "Hello");
    }
}
