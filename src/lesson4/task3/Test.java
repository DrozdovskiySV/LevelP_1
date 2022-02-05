package lesson4.task3;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Cat("Grandorf for cats", "Home", "Сергей", "Кастиэль");
        animals[1] = new Cat("Garbage", "Street", null, "Барсик");
        animals[2] = new Dog("Grandorf for dogs", "Home", "Василий", "Корвин");
        animals[3] = new Dog("Garbage", "Street", null, "Жучка");
        animals[4] = new Horse("food for horses", "farm", "Мария", "Шанс");

        for (Animal animal : animals) {
            Veterinar.treatAnimal(animal);
            // не зря же писал остальные методы
            animal.makeNoise();
            animal.eat();
            animal.sleep();
            System.out.println();
        }


    }
}
