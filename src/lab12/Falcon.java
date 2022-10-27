package lab12;

public class Falcon  implements IFlyAble, IMoveAble {


    @Override
    public boolean isflyable() {
        return true;
    }

    @Override
    public int speed() {
        return 390;
    }

    public String toString() {
        return isflyable() + "," + speed();
    }

}
