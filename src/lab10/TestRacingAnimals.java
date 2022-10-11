package lab10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static lab10.RacingAnimals.Builder;
public class TestRacingAnimals {
    public static void main(String[] args) {
       Builder builder = new Builder();

        RacingAnimals dog = builder.setName("Dog").setFlyable(false).builder();
        RacingAnimals tiger = builder.setName("Tiger").setFlyable(false).builder();
        RacingAnimals horse = builder.setName("Horse").setFlyable(false).builder();
        RacingAnimals falcon = builder.setName("Falcon").setFlyable(true).builder();
        RacingAnimals eagle = builder.setName("Eagle").setFlyable(true).builder();
        RacingAnimals snake = builder.setName("Snake").setFlyable(false).builder();

        List<RacingAnimals> animalList = Arrays.asList(dog, tiger, horse, falcon, eagle, snake);
        List<RacingAnimals> getAnimalRacing = RacingAnimalController.getAnimalRacing(animalList);
        List<RacingAnimals> getRandomNumber = RacingAnimalController.getRandomSpeed(getAnimalRacing);

        System.out.println("The winner is: " + RacingAnimalController.winner(getRandomNumber));
    }
}
