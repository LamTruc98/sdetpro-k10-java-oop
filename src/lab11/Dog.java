package lab11;

public class Dog extends Animals{
    @Override
    public int getSpeed() {
        return 60;
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public String getAnimalName() {
        return "Dog";
    }

    @Override
    public void setSpeed(int randomSpeed) {

    }
}
