package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class StoreTest {
    @Test
    public void testStore() {
        Store store1 = new Store();
        Flower fl = new Flower();
        fl.setPrice(13);
        fl.setColor(FlowerColor.RED);
        store1.add(fl);
        Flower fl1 = new Flower();
        fl1.setPrice(13);
        fl1.setColor(FlowerColor.BLUE);
        store1.add(fl1);
        Flower fl2 = new Flower();
        fl2.setPrice(13);
        fl2.setColor(FlowerColor.RED);
        store1.add(fl2);
        Flower fl3 = new Flower();
        fl3.setPrice(11);
        fl3.setColor(FlowerColor.RED);
        store1.add(fl3);
        Flower fl7 = new Flower();
        fl7.setPrice(13);
        fl7.setColor(FlowerColor.RED);
        Assertions.assertEquals(store1.search(fl7), 2);
        Flower fl6 = new Flower();
        fl6.setPrice(10);
        fl6.setColor(FlowerColor.BLUE);
        Assertions.assertEquals(store1.search(fl6), 0);
        Flower fl5 = new Flower();
        fl5.setPrice(13);
        fl5.setColor(FlowerColor.BLUE);
        Assertions.assertEquals(store1.search(fl5), 1);
    }
}
