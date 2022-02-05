package lesson4.task3;

public class Cat extends Animal {
    String owner;
    String nickname;

    public Cat(String food, String location, String owner, String nickname) {
        super(food, location);
        this.owner = owner;
        this.nickname = nickname;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест");
    }

    @Override
    public void sleep() {
        System.out.println("Кошка спит");
    }


}
