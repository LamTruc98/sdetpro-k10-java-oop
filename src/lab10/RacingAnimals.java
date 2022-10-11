package lab10;

/*
Racing animal with builder design pattern (adding attribute flyable)
Eagle, Falcon, Tiger, Snake....
 */
public class RacingAnimals {
    private boolean flyable;
    private String name;
    private int speed;

    protected RacingAnimals(Builder builder) {
        this.flyable = builder.flyable;
        this.name = builder.name;
        this.speed = builder.speed;


    }

    //    public boolean isCanFly() {
//        return this.canFly;
//    }
    public boolean isFlyable() {
        return flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public static class Builder {
        private boolean flyable;
        private String name;
        private int speed;

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;

        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder() {
        }

        public RacingAnimals builder() {
            return new RacingAnimals(this);
        }
    }


}
