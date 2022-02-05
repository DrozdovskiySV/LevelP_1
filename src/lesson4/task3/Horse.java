package lesson4.task3;

public class Horse extends Animal {
    String owner;
    String nickname;

    public Horse(String food, String location, String owner, String nickname) {
        super(food, location);
        this.owner = owner;
        this.nickname = nickname;
    }

    @Override
    public void makeNoise() {
        System.out.println("Игого");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест");
    }

    @Override
    public void sleep() {
        System.out.println("Лошадь спит");
    }
}
