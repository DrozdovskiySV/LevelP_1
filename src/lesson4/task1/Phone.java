package lesson4.task1;

public class Phone {
    private String number; // раз уж попросили только 1 геттер создать
    String model;
    double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number,model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + ". Номер телефона "+ number);
    }

    public static void sendMessages(String[] phonesArr, String mess) {
        for (String phone: phonesArr) {
            System.out.println(phone);
        }
    }

    public String getNumber() {
        return number;
    }
}
