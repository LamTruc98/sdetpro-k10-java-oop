package lab11;

import lab11.Animals;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

public class AnimalController {
    public static List setRandomSpeed(List<Animals> animalsList) {
        for (Animals animals : animalsList) {
            Random random = new SecureRandom();
            int randomSpeed = random.nextInt(animals.getSpeed());
            animals.setSpeed(randomSpeed);
            System.out.println("The speed of animal "+ animals.getAnimalName()+ "is: " +animals.getSpeed());
        }
        return animalsList;

    }

    public static String winner(List<Animals> animalsList) {
        int winSpeed = animalsList.get(0).getSpeed();
        String winner = animalsList.get(0).getAnimalName();
        for (Animals animals : animalsList) {
            if (winSpeed < animals.getSpeed()) {
                winSpeed = animals.getSpeed();
                winner = animals.getAnimalName();
            }
        }
        return winner;
    }
}
