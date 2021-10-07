package by.epamtc.melnikov.ballAndBasket.bean.type;

public enum MaterialType {
    PU("Полиуретан"),
    PVC("Поливинилхлорид");

    private final String value;

    private MaterialType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
