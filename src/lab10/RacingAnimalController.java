package lab10;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class RacingAnimalController {
    public static List getAnimalRacing(List<RacingAnimals> animalList) {
        List<RacingAnimals> listRacer = new ArrayList<>();
        for (RacingAnimals animal : animalList) {
            if (!animal.isFlyable()) {
                listRacer.add(animal);
            }
        }
        return listRacer;
    }

    public static List getRandomSpeed(List<RacingAnimals> animalList) {
        List<RacingAnimals> randomSpeedList = new ArrayList<>();
        for (RacingAnimals animal : animalList) {
            int randomSpeed = new SecureRandom().nextInt(900);
            randomSpeedList.add(new RacingAnimals.Builder().setName(animal.getName()).setSpeed(randomSpeed).builder());
            System.out.println("The speed of " + animal.getName() + " is: " + randomSpeed);
        }
        return randomSpeedList;
    }

    public static String winner(List<RacingAnimals> animalList) {
        int winSpeed = animalList.get(0).getSpeed();
        String winner = animalList.get(0).getName();

        for (RacingAnimals animal : animalList) {
            if (winSpeed < animal.getSpeed()) {
                winSpeed = animal.getSpeed();
                winner = animal.getName();
            }
        }
        return winner;
    }
}
