package flower.store;

import java.util.ArrayList;

public class FlowerBucket {
    private ArrayList<FlowerPack> flowers;
    private double wholeprice = 0;
    public FlowerBucket() {
        this.flowers = new ArrayList<>();
    }
    public void add(FlowerPack pack) {
        flowers.add(pack);
    }
    public double getPrice() {
        for (FlowerPack pack : flowers) {
            wholeprice += pack.getPrice();
        }
        return wholeprice;
    }
}
