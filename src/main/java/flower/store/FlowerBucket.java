package flower.store;

import java.util.ArrayList;

public class FlowerBucket {
    private ArrayList<FlowerPack> flowers;
    private double whole_price;
    public FlowerBucket() {
        this.flowers = new ArrayList<>();
    }
    public void add(FlowerPack pack) {
        flowers.add(pack);
    }
    public double getPrice() {
        for (FlowerPack pack : flowers) {
            whole_price += pack.getPrice();
        }
        return whole_price;
    }
}
