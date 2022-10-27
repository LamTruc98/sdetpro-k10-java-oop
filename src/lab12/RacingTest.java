package lab12;

import lab11.AnimalController;

import java.util.Arrays;
import java.util.List;

public class RacingTest {


    public static void main(String[] args) {
        RacingController racingController = new RacingController();
        Dog dog = new Dog();
        Eagle eagle = new Eagle();
        Horse horse = new Horse();
        Falcon falcon = new Falcon();
        List raceable = racingController.raceable(Arrays.asList(dog,eagle,horse,falcon));
        System.out.println(raceable);
        IMoveAble winner = racingController.getWinner(raceable);
        System.out.println(winner);





    }
}
