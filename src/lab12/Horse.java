package lab12;

public class Horse  implements IFlyAble, IMoveAble {


    @Override
    public boolean isflyable() {
        return false;
    }

    @Override
    public int speed() {
        return 70;
    }
    public String toString(){
        return isflyable() +","+ speed();
    }


}
