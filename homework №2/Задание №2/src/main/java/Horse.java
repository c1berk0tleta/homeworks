public class Horse extends Animal {
    String name;
    public Horse(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    public void rush() {
        System.out.println("Шевелись, " + name + " !");
    }

    @Override
    public void makeNoise() {
        System.out.println("Iго-go!");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест");
    }
}