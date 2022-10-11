package lab9_2;

import lab9_1.Employee;

import java.security.SecureRandom;
import java.util.List;

public class AnimalController {
    public static List setRandomSpeed(List<Animals> animalsList) {
        for (Animals animals : animalsList) {
            int randomSpeed = new SecureRandom().nextInt(animals.getMaxSpeed());
            animals.setSpeed(randomSpeed);
            System.out.println("name"+ animals.getAnimalName()+ "speed" +animals.getSpeed());
        }
        return animalsList;
    }

    public static String speedUp(List<Animals> animalsList) {
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
