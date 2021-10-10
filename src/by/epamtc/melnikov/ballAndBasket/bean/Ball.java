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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colorType == null) ? 0 : colorType.hashCode());
		result = prime * result + ((materialType == null) ? 0 : materialType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Ball other = (Ball) obj;
		if (colorType != other.colorType)
			return false;
		if (materialType != other.materialType)
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
    
}
