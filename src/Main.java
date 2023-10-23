public class Main {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian("Богдан");
        Animal animalCat = new Animal();
        Animal animalDog = new Animal();
        Cat cat = new Cat("Рыба", "Оранжевый", 6, "Барсик");
        Dog dog = new Dog("Мясо", "Белый", 12, "Честер");
        animalCat = cat;
        animalDog = dog;
        veterinarian.treatment(animalCat);
        veterinarian.treatment(animalDog);
        cat.sleep();
        dog.sleep();
    }
}