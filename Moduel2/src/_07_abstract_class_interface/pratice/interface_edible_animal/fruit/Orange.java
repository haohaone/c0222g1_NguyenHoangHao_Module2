package _07_abstract_class_interface.pratice.interface_edible_animal.fruit;

import _07_abstract_class_interface.pratice.interface_edible_animal.Edible;

public class Orange extends Fruit implements Edible {
    @Override
    public String howToEat() {
        return "Orange could eat fresh";
    }
}
