package flower.store;

public class FlowerPack {
    public Flower getFlower() {
        return flower;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    private Flower flower;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int quantity;
    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }
    public double getPrice() {
        double sum = this.flower.getPrice() * this.quantity;
        return sum;
    }

}
