public class Dog extends Animal{
    private String name;

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getVoice() {
        return "Гав";
    }

    @Override
    public void eat() {
        System.out.println("Мясо");
    }

    @Override
    public void sleep() {
        System.out.println("Звук спящей собаки");
    }

    @Override
    public String toString() {
        return "Собаку " + "по имени " + name + ' ' + super.toString();
    }
}