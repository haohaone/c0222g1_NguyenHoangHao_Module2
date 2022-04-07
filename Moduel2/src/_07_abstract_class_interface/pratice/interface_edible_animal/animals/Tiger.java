package _07_abstract_class_interface.pratice.interface_edible_animal.animals;

//import .pratice.interface_edible_animal.Edible;
import _07_abstract_class_interface.pratice.interface_edible_animal.Edible;


public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrrrr!";
    }

    @Override
    public String howToEat() {
        return "Can't eat tiger meat";
    }
}
