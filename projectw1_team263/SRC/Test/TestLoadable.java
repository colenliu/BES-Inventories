package Test;

import Model.Loadable;
import Stock.Inventory;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestLoadable {
    private Inventory inventory;

    public void testLoad(Loadable loadable) throws IOException {
        inventory.loadInventory();
    }

    @Test
    public void testLoadable () {
    }
}
