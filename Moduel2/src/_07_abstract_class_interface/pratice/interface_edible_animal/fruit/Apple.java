package _07_abstract_class_interface.pratice.interface_edible_animal.fruit;

import _07_abstract_class_interface.pratice.interface_edible_animal.Edible;

public class Apple extends Fruit implements Edible {
    @Override
    public String howToEat() {
        return "Apple could eat fresh";
    }
}
