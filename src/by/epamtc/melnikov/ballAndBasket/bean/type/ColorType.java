package by.epamtc.melnikov.ballAndBasket.bean.type;

public enum ColorType {
    RED("Красный"),
    BROWN("Коричневый"),
    WHITE("Белый"),
    BLACK("Черный"),
    GREEN("Зелёный"),
    BLUE("Синий");

    private final String value;

    private ColorType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
