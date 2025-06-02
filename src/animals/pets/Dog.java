package animals.pets;

import animals.Animal;
import data.ColorData;

public class Dog extends Animal {
    // конструктор
    public Dog(String name, int age, int weight, ColorData colorData) {
        super(name, age, weight, colorData);
    }


    // переопределяем метод
    @Override
    public void say() {
        System.out.println("Гав");
    }
}