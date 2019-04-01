package Model;


import Model.Exceptions.RedundantEntryException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public interface Saveable {
    void saveInventory() throws IOException, RedundantEntryException;
}
