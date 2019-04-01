package Test;

import Model.Exceptions.RedundantEntryException;
import Model.Saveable;
import Stock.Inventory;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class TestSaveable {
    private Inventory inventory;

    public void testSave(Saveable saveable) throws IOException, RedundantEntryException {
        inventory.saveInventory();
    }

    @Test
    public void testSaveable() {

    }
}
