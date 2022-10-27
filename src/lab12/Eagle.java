package lab12;

public class Eagle implements IFlyAble, IMoveAble {


    @Override
    public boolean isflyable() {
        return true;
    }

    @Override
    public int speed() {
        return 100;
    }

    public String toString() {
        return isflyable() + "," + speed();
    }

}
