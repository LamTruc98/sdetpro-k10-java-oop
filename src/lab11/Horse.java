package lab11;

public class Horse extends Animals{
    @Override
    public int getSpeed() {
        return 75;
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public String getAnimalName() {
        return "Horse";
    }

    @Override
    public void setSpeed(int randomSpeed) {

    }
}
