package flower.store;

import java.util.ArrayList;

public class Store {
    private ArrayList<Flower> flowers;
    public Store() {
        this.flowers = new ArrayList<>();
    }
    public void add(Flower flower) {
        this.flowers.add(flower);
    }
    public int search(Flower special_flower) {
        int counter = 0;
        for (Flower flower:flowers) {
            if (flower.getColor().equals(special_flower.getColor())) {
                if (flower.getPrice() == special_flower.getPrice()) {
                    if (flower.getSepalLength() == special_flower.getSepalLength()) {
                        counter += 1;
                    }
                }
            }
        }
        return counter;
    }
}

