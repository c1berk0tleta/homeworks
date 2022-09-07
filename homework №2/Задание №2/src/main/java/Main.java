public class Main {
    public static void main(String[] msi) {
        Vet vet = new Vet();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Джей", "мясо", "улица Пушкина, дом Колотушкина");
        animals[1] = new Cat("Кузя", "рыба", "улица Сапковского, дом Островского, переулок Склифософского");
        animals[2] = new Horse("Плотва", "сено", "Новиград");

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}