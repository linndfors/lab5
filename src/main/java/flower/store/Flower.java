package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    private double sepalLength;
    @Getter
    private FlowerType flowerType;
    private FlowerColor color;
    private double price;
    public double getPrice() {
        return price;
    }
    public String getColor() {
        return color.toString();
    }
}
