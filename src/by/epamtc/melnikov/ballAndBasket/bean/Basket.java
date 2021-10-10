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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(balls);
		result = prime * result + ballsCount;
		result = prime * result + capasity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Basket other = (Basket) obj;
		if (!Arrays.equals(balls, other.balls))
			return false;
		if (ballsCount != other.ballsCount)
			return false;
		if (capasity != other.capasity)
			return false;
		return true;
	}

}
