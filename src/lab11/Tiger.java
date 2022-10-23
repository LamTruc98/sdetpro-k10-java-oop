package lab11;

public class Tiger extends Animals {
    @Override
    public int getSpeed() {
        return 100;
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public String getAnimalName() {
        return "Tiger";
    }

    @Override
    public void setSpeed(int randomSpeed) {

    }
}
