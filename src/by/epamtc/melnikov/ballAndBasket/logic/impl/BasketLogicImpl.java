package by.epamtc.melnikov.ballAndBasket.logic.impl;

import by.epamtc.melnikov.ballAndBasket.bean.Ball;
import by.epamtc.melnikov.ballAndBasket.bean.Basket;
import by.epamtc.melnikov.ballAndBasket.bean.type.ColorType;
import by.epamtc.melnikov.ballAndBasket.bean.type.MaterialType;
import by.epamtc.melnikov.ballAndBasket.logic.BasketLogic;

public class BasketLogicImpl implements BasketLogic {

    @Override
    public void addBall(Basket basket, Ball ball) {
        if (basket.getBallsCount() < basket.getCapasity()) {
            basket.getBalls()[basket.getBallsCount()] = ball;
            basket.setBallsCount(basket.getBallsCount() + 1);
        }
    }

    @Override
    public void addBall(Basket basket, double weight, ColorType colorType, MaterialType materialType) {
        if (basket.getBallsCount() < basket.getCapasity()) {
            Ball ball = new Ball(weight, colorType, materialType);
            basket.getBalls()[basket.getBallsCount()] = ball;
            basket.setBallsCount(basket.getBallsCount() + 1);
        }
    }

    @Override
    public void sortBallsByWeight(Basket basket) {
        if (basket.getBallsCount() > 1) {
            Ball[] balls = basket.getBalls();
            boolean needIteration = true;
            while (needIteration) {
                needIteration = false;
                for (int i = 1; i < balls.length; i++) {
                    if (balls[i].getWeight() < balls[i - 1].getWeight()) {
                        Ball temp = balls[i];
                        balls[i] = balls[i - 1];
                        balls[i - 1] = temp;
                        needIteration = true;
                    }
                }
            }
        }
    }

    @Override
    public void clear(Basket basket) {
        basket.setBallsCount(0);
        Ball[] balls = basket.getBalls();
        for (int i = 0; i < balls.length; i++) {
            balls[i] = null;
        }
    }

    @Override
    public double basketWeight(Basket basket) {
        if (basket.getBallsCount() > 0) {
            Ball[] balls = basket.getBalls();
            double weight = 0;
            for (int i = 0; i < balls.length; i++) {
                weight += balls[i].getWeight();
            }
            return weight;
        } else {
            return 0;
        }
    }

    @Override
    public int ballsCount(Basket basket, ColorType colorType) {
        if (basket.getBallsCount() > 0) {
            Ball[] balls = basket.getBalls();
            int count = 0;
            for (int i = 0; i < balls.length; i++) {
               if (balls[i].getColorType().equals(colorType)) {
                   count++;
               }
            }
            return count;
        } else {
            return 0;
        }
    }

    @Override
    public int ballsCount(Basket basket, MaterialType materialType) {
        if (basket.getBallsCount() > 0) {
            Ball[] balls = basket.getBalls();
            int count = 0;
            for (int i = 0; i < balls.length; i++) {
                if (balls[i].getMaterialType().equals(materialType)) {
                    count++;
                }
            }
            return count;
        } else {
            return 0;
        }
    }

}
