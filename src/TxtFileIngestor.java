import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Static class that reads in a txt file of items in a predefined format.
 *
 * @author Jeremy Spooner
 * @version 1.0
 */
public class TxtFileIngestor {
    /**
     * Return the Item contents of the file passed in as a String.
     *
     * @param fileName name of the file containing the items.
     * @return the ArrayList of Items loaded from the file
     * @throws FileNotFoundException the exception for a file not found
     */
    static public ArrayList<Item> ingest(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        ArrayList<Item> items = new ArrayList<Item>();
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split("=");
            items.add(new Item(line[0], Integer.parseInt(line[1])));
        }
        return items;
    }
}
