package lab9_2;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animals hors = new Horse();
        Animals tiger = new Tiger();
        Animals dog = new Dog();

        List<Animals> animalsList = Arrays.asList(hors, tiger, dog);
        List<Animals> setRandomSpeed = AnimalController.setRandomSpeed(animalsList);
        System.out.println("Winner is" + AnimalController.speedUp(animalsList));

    }
}
