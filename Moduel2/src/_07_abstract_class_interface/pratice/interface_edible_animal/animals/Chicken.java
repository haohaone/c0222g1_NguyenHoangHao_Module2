package _07_abstract_class_interface.pratice.interface_edible_animal.animals;

import _07_abstract_class_interface.pratice.interface_edible_animal.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "Chicken meat could fry it";
    }
}
