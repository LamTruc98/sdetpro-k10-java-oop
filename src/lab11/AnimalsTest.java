package lab11;

import lab11.AnimalController;
import lab11.Animals;
import lab11.Dog;
import lab11.Horse;
import lab11.Tiger;

import java.util.Arrays;
import java.util.List;

public class AnimalsTest {
    public static void main(String[] args) {
        Animals hors = new Horse();
        Animals tiger = new Tiger();
        Animals dog = new Dog();

        List<Animals> animalsList = Arrays.asList(hors, tiger, dog);
        List<Animals> setRandomSpeed = AnimalController.setRandomSpeed(animalsList);
        System.out.println("Winner is: " + AnimalController.winner(animalsList));

    }
}
