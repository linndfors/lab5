package flower.store;

public class FlowerPack {
    private int quantity;
    private Flower flower;
    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }
    public Flower getFlower() {
        return this.flower;
    }

    public void setFlower(Flower myFlower) {
        this.flower = myFlower;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int myQuantity) {
        this.quantity = myQuantity;
    }
    public double getPrice() {
        double sum = this.flower.getPrice() * this.quantity;
        return sum;
    }

}
