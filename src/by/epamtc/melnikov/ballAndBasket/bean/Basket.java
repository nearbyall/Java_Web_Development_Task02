package by.epamtc.melnikov.ballAndBasket.bean;

import java.util.Arrays;

public class Basket {
    private final int capasity;
    private int ballsCount;
    private Ball[] balls;

    public Basket() {
        this.capasity = 10;
        this.ballsCount = 0;
        this.balls = new Ball[this.capasity];
    }

    public Basket(int capasity) {
        this.capasity = capasity;
        this.ballsCount = 0;
        this.balls = new Ball[capasity];
    }

    public Basket(Basket basket) {
        this.capasity = basket.capasity;
        this.ballsCount = basket.ballsCount;
        this.balls = basket.balls.clone();
    }

    public int getCapasity() {
        return capasity;
    }

    public int getBallsCount() {
        return ballsCount;
    }

    public void setBallsCount(int ballsCount) {
        this.ballsCount = ballsCount;
    }

    public Ball[] getBalls() {
        return balls;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() +
                "{capasity=" + capasity +
                ", ballsCount=" + ballsCount +
                ", balls=" + Arrays.toString(balls) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Basket basket = (Basket) o;

        if (getCapasity() != basket.getCapasity()) return false;
        if (getBallsCount() != basket.getBallsCount()) return false;
        return Arrays.equals(getBalls(), basket.getBalls());
    }

    @Override
    public int hashCode() {
        int result = getCapasity();
        result = 31 * result + getBallsCount();
        result = 31 * result + Arrays.hashCode(getBalls());
        return result;
    }
}
