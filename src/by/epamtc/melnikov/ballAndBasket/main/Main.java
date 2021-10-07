package by.epamtc.melnikov.ballAndBasket.main;

import by.epamtc.melnikov.ballAndBasket.bean.Ball;
import by.epamtc.melnikov.ballAndBasket.bean.Basket;
import by.epamtc.melnikov.ballAndBasket.bean.type.ColorType;
import by.epamtc.melnikov.ballAndBasket.bean.type.MaterialType;
import by.epamtc.melnikov.ballAndBasket.logic.BasketLogic;
import by.epamtc.melnikov.ballAndBasket.logic.LogicProvider;

public class Main {

    public static void main(String[] args) {

        LogicProvider provider = LogicProvider.getInstance();
        BasketLogic basketLogic = provider.getBasketLogic();

        Ball ball1 = new Ball(12, ColorType.BLACK, MaterialType.PU);
        Ball ball2 = new Ball(14, ColorType.BLUE, MaterialType.PVC);
        Ball ball3 = new Ball(11, ColorType.BLUE, MaterialType.PU);
        Ball ball4 = new Ball(13, ColorType.BLACK, MaterialType.PVC);
        Ball ball5 = new Ball(16, ColorType.BROWN, MaterialType.PVC);

        Basket basket = new Basket(5);

        basketLogic.addBall(basket, ball1);
        basketLogic.addBall(basket, ball2);
        basketLogic.addBall(basket, ball3);
        basketLogic.addBall(basket, ball4);
        basketLogic.addBall(basket, ball5);

        basketLogic.sortBallsByWeight(basket);

        int blueCount = basketLogic.ballsCount(basket, ColorType.BLUE);
        double basketWeight = basketLogic.basketWeight(basket);

        System.out.printf("Кол-во синих шариков: %d\n" +
                          "Вес корзины: %.2f\n",
                           blueCount, basketWeight);

        basketLogic.clear(basket);

    }

}
