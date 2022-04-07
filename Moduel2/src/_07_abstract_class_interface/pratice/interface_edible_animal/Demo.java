package _07_abstract_class_interface.pratice.interface_edible_animal;

import _07_abstract_class_interface.pratice.interface_edible_animal.animals.Animal;
import _07_abstract_class_interface.pratice.interface_edible_animal.animals.Chicken;
import _07_abstract_class_interface.pratice.interface_edible_animal.animals.Tiger;
import _07_abstract_class_interface.pratice.interface_edible_animal.fruit.Apple;
import _07_abstract_class_interface.pratice.interface_edible_animal.fruit.Fruit;
import _07_abstract_class_interface.pratice.interface_edible_animal.fruit.Orange;

public class Demo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound() + ((Edible) animal).howToEat());
        }

        Fruit [] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
