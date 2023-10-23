import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;

public class Cat extends Animal{
    private String name;

    public Cat(String ration, String color, int weight, String name) {
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
        return "Мяу";
    }

    @Override
    public void eat() {
        System.out.println("Рыбу");
    }

    @Override
    public void sleep() {
        System.out.println("Звук спящего кота");
    }

    @Override
    public String toString() {
        return "Кота " + "по имени " + name + ' ' + super.toString();
    }
}