package flower.store;

public class FlowerPack {
    Flower flower;
    int quantity;
    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }
    public double getPrice() {
        double sum = this.flower.getPrice() * this.quantity;
        return sum;
    }

}
