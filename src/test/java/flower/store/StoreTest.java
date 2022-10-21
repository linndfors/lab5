package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class StoreTest {
    private static final int PRICE = 13;
    private static final int PRICEI = 11;
    private static final int PRICEB = 10;
    @Test
    public void testStore() {
        Store store = new Store();
        Flower fl = new Flower();
        fl.setPrice(PRICE);
        fl.setColor(FlowerColor.RED);
        store.add(fl);
        Flower fll = new Flower();
        fll.setPrice(PRICE);
        fll.setColor(FlowerColor.BLUE);
        store.add(fll);
        Flower flll = new Flower();
        flll.setPrice(PRICE);
        flll.setColor(FlowerColor.RED);
        store.add(flll);
        Flower flwr = new Flower();;
        flwr.setPrice(PRICEI);
        flwr.setColor(FlowerColor.RED);
        store.add(flwr);
        Flower flw = new Flower();
        flw.setPrice(PRICE);
        flw.setColor(FlowerColor.RED);
        Assertions.assertEquals(store.search(flw), 2);
        Flower flo = new Flower();
        flo.setPrice(PRICEB);
        flo.setColor(FlowerColor.BLUE);
        Assertions.assertEquals(store.search(flo), 0);
        Flower flb = new Flower();
        flb.setPrice(PRICE);
        flb.setColor(FlowerColor.BLUE);
        Assertions.assertEquals(store.search(flb), 1);
    }
}
