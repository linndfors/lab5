package flower.store;

public class Main {
    public static void main() {
        Store store1 = new Store();
        Flower fl = new Flower();
        fl.setPrice(13);
        fl.setColor(FlowerColor.RED);
        store1.add(fl);
        Flower fl1 = new Flower();
        fl.setPrice(13);
        fl.setColor(FlowerColor.RED);
        store1.add(fl);
        Flower fl2 = new Flower();
        fl.setPrice(13);
        fl.setColor(FlowerColor.RED);
        store1.add(fl);
        Flower fl3 = new Flower();
        fl.setPrice(11);
        fl.setColor(FlowerColor.RED);
        store1.add(fl);
        Flower fl7 = new Flower();
        fl.setPrice(13);
        fl.setColor(FlowerColor.RED);
        store1.search(fl7);
    }
}


