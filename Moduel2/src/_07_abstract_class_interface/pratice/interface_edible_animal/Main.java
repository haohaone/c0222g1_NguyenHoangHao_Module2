package _07_abstract_class_interface.pratice.interface_edible_animal;

import _07_abstract_class_interface.pratice.interface_edible_animal.animals.Animal;
import _07_abstract_class_interface.pratice.interface_edible_animal.animals.Chicken;
import _07_abstract_class_interface.pratice.interface_edible_animal.animals.Tiger;
import _07_abstract_class_interface.pratice.interface_edible_animal.fruit.Fruit;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        Fruit [] fruits = new Fruit[2];
    }
}
