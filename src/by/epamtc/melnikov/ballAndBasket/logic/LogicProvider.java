package by.epamtc.melnikov.ballAndBasket.logic;

import by.epamtc.melnikov.ballAndBasket.logic.impl.BasketLogicImpl;

public class LogicProvider {

    private static final LogicProvider instance = new LogicProvider();

    private LogicProvider() {};

    public static LogicProvider getInstance() {
        return instance;
    }

    private final BasketLogic basketLogic = new BasketLogicImpl();

    public BasketLogic getBasketLogic() {
        return basketLogic;
    }

}
