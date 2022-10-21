package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class StoreTest {
    int price = 13;
    int priceb = 10;
    @Test
    public void testStore() {
        Store store = new Store();
        Flower fl = new Flower();
        fl.setPrice(price);
        fl.setColor(FlowerColor.RED);
        store.add(fl);
        Flower fll = new Flower();
        fll.setPrice(price);
        fll.setColor(FlowerColor.BLUE);
        store.add(fll);
        Flower flll = new Flower();
        flll.setPrice(price);
        flll.setColor(FlowerColor.RED);
        store.add(flll);
        Flower flwr = new Flower();
        int pricee = price - 2;
        flwr.setPrice(pricee);
        flwr.setColor(FlowerColor.RED);
        store.add(flwr);
        Flower flw = new Flower();
        flw.setPrice(price);
        flw.setColor(FlowerColor.RED);
        Assertions.assertEquals(store.search(flw), 2);
        Flower flo = new Flower();
        flo.setPrice(priceb);
        flo.setColor(FlowerColor.BLUE);
        Assertions.assertEquals(store.search(flo), 0);
        Flower flb = new Flower();
        flb.setPrice(price);
        flb.setColor(FlowerColor.BLUE);
        Assertions.assertEquals(store.search(flb), 1);
    }
}