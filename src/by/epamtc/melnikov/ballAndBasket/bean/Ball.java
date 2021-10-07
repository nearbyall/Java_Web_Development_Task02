package by.epamtc.melnikov.ballAndBasket.bean;

import by.epamtc.melnikov.ballAndBasket.bean.type.ColorType;
import by.epamtc.melnikov.ballAndBasket.bean.type.MaterialType;

public class Ball {
    private final double weight;
    private final ColorType colorType;
    private final MaterialType materialType;

    public Ball(double weight, ColorType colorType, MaterialType materialType) {
        this.weight = weight;
        this.colorType = colorType;
        this.materialType = materialType;
    }

    public double getWeight() {
        return weight;
    }

    public ColorType getColorType() {
        return colorType;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() +
                "{weight=" + weight +
                ", colorType=" + colorType +
                ", materialType=" + materialType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        if (Double.compare(ball.getWeight(), getWeight()) != 0) return false;
        if (getColorType() != ball.getColorType()) return false;
        return getMaterialType() == ball.getMaterialType();
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getWeight());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + getColorType().hashCode();
        result = 31 * result + getMaterialType().hashCode();
        return result;
    }
}
