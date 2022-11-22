/**
 * Represents an item that has a name and weight.
 *
 * @author Jeremy Spooner
 * @version 1.0
 */
public class Item {
    String name;
    int weight;

    /**
     * Creates an Item with the specified name and weight.
     *
     * @param name   the name of the item
     * @param weight the weight of the item in Tonnes
     */
    Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
}
