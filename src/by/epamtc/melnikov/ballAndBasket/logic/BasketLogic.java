package by.epamtc.melnikov.ballAndBasket.logic;

import by.epamtc.melnikov.ballAndBasket.bean.Ball;
import by.epamtc.melnikov.ballAndBasket.bean.Basket;
import by.epamtc.melnikov.ballAndBasket.bean.type.ColorType;
import by.epamtc.melnikov.ballAndBasket.bean.type.MaterialType;

public interface BasketLogic {

    void addBall(Basket basket, Ball ball);

    void addBall(Basket basket, double weight, ColorType colorType, MaterialType materialType);

    void sortBallsByWeight(Basket basket);

    void clear(Basket basket);

    double basketWeight(Basket basket);

    int ballsCount(Basket basket, ColorType colorType);

    int ballsCount(Basket basket, MaterialType materialType);

}
