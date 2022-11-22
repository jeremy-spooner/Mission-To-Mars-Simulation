import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Simulation represents the simulation used for the Space challenge in the main class.
 * It is responsible for reading item data and filling up the rockets.
 *
 * @author Jeremy Spooner
 * @version 1.0
 */
public class Simulation {
    /**
     * Default constructor for the Simulation class.
     */
    Simulation() {

    }

    /**
     * Return the Item contents of the file passed in as a String.
     *
     * @param fileName name of the file containing the items.
     * @return the ArrayList of Items loaded from the file
     * @throws FileNotFoundException the exception for a file not found
     */
    public ArrayList<Item> loadItems(String fileName) throws FileNotFoundException {
        return TxtFileIngestor.ingest(fileName);
    }

    /**
     * Takes the ArrayList of Items returned from loadItems and starts creating U1 rockets. It first tries to fill up 1
     * Rocket with as many items as possible before creating a new rocket object and filling that one until all items
     * are loaded.
     *
     * @param items a list of Items to be loaded
     * @return ArrayList of Rockets that hold all the Items
     */
    public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
        ArrayList<Rocket> u1s = new ArrayList<Rocket>();
        u1s.add(new U1());
        int currentIndex = 0;
        Rocket currentU1 = u1s.get(currentIndex);
        for (Item item : items) {
            if (currentU1.canCarry(item)) {
                currentU1.carry(item);
            } else {
                currentIndex++;
                u1s.add(new U1());
                currentU1 = u1s.get(currentIndex);
                currentU1.carry(item);
            }
        }
        return u1s;
    }

    /**
     * Takes the ArrayList of Items and starts creating U2 rockets and filling them with those items the same way as
     * with U1 until all items are loaded. The method then returns the ArrayList of those U2 rockets that are fully
     * loaded.
     *
     * @param items a list of Items to be loaded
     * @return ArrayList of Rockets that hold all the Items
     */
    public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        ArrayList<Rocket> u2s = new ArrayList<Rocket>();
        u2s.add(new U2());
        int currentIndex = 0;
        Rocket currentU2 = u2s.get(currentIndex);
        for (Item item : items) {
            if (currentU2.canCarry(item)) {
                currentU2.carry(item);
            } else {
                currentIndex++;
                u2s.add(new U2());
                currentU2 = u2s.get(currentIndex);
                currentU2.carry(item);
            }
        }
        return u2s;
    }

    /**
     * Takes an ArrayList of Rockets and calls launch and land methods for each of the rockets in the ArrayList
     * Every time a rocket explodes or crashes (i.e. if launch or land return false) it will have to send that rocket
     * again. All while keeping track of the total budget required to send each rocket safely to Mars.
     *
     * @param rockets ArrayList of Rockets that hold all the Items
     * @return the total budget required to send all rockets to Mars (including the crashed ones)
     */
    public int runSimulation(ArrayList<Rocket> rockets) {
        int cost = 0;
        for (Rocket rocket : rockets) {
            cost += rocket.cost;
            while (!(rocket.land() && rocket.launch())) {
                cost += rocket.cost;
            }
        }
        return cost;
    }

}
