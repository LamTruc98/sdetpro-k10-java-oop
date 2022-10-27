package lab12;

import lab11.Animals;

import java.util.ArrayList;
import java.util.List;

public class RacingController {
    public List<IFlyAble> raceable(List<IFlyAble> flyAbleList) {
        List<IFlyAble> raceable = new ArrayList<>();
        for (IFlyAble animal : flyAbleList) {
            if (!animal.isflyable()) {
                raceable.add(animal);
            }
        }
        return raceable;
    }

    public IMoveAble getWinner(List<IMoveAble> animals) {
        IMoveAble winner = animals.get(0);
        for (IMoveAble animal : animals) {
            if (animal.speed()> winner.speed()) {
                winner=animal;
            }
        }
        return winner;

    }


}
