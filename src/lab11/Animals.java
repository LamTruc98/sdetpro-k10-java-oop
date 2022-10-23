package lab11;

public abstract class Animals {
    private String animalName;
    private int speed;
    private int maxSpeed;
    public abstract int getSpeed();


    public abstract int getMaxSpeed();

    public abstract String getAnimalName();

    public abstract void setSpeed(int randomSpeed);
}
