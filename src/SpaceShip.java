/**
 * SpaceShip is the interface that is used by the Rocket class.
 *
 * @author Jeremy Spooner
 * @version 1.0
 */
public interface SpaceShip {
    /**
     * Determines if a launch is successful.
     *
     * @return either true or false indicating if the launch was successful or if the rocket has crashed
     */
    Boolean launch();

    /**
     * Determines if a landing is successful.
     *
     * @return either true or false based on the success of the landing
     */
    Boolean land();

    /**
     * Determines if an Item can be carried based on its weight and the Rocket's max weight
     *
     * @param item an Item to be carried by the Rocket
     * @return true if the rocket can carry such item or false if it will exceed the weight limit.
     */
    Boolean canCarry(Item item);

    /**
     * Updates the current weight of the rocket.
     *
     * @param item an Item to be carried by the Rocket
     */
    void carry(Item item);
}
