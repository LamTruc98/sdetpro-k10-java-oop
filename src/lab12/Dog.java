package lab12;

public class Dog implements IFlyAble, IMoveAble {


    @Override
    public boolean isflyable() {
        return false;
    }

    @Override
    public int speed() {
        return 60   ;
    }
    public String toString(){
        return isflyable() +","+ speed();
    }
}




