package abstract_class_interface;

public class Test {
    public static void main(String[] args) {
        Animal cow = new Cow();
        cow.eat();
        Animal lion = new Lion();
        lion.eat();
        
        AnimalInterface animalInterface = new LionImplement();
        animalInterface.eat();
    }
}
