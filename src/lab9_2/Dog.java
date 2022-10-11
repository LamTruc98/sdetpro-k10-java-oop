package lab9_2;

public class Dog extends Animals{
    @Override
    public String getAnimalName() {
        return "Dog";
    }

    @Override
    public int getSpeed() {
        return 60;
    }
}
