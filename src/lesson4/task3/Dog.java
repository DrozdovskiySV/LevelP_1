package lesson4.task3;

public class Dog extends Animal{
    String owner;
    String nickname;

    public Dog(String food, String location, String owner, String nickname) {
        super(food, location);
        this.owner = owner;
        this.nickname = nickname;
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    @Override
    public void sleep() {
        System.out.println("Собака спит");
    }
}
