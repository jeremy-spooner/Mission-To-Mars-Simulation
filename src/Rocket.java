/**
 * Rocket class implements the SpaceShip interface.
 * This class is extended by the U1 and U2 classes
 *
 * @author Jeremy Spooner
 * @version 1.0
 */
public class Rocket implements SpaceShip {
    public int cost;
    public int weight;
    public int maxWeight;
    public double chanceOfLaunchExplosionCoef;
    public double chanceOfLandingCrashCoef;
    public int cargoCarried;
    public int cargoLimit;

    /**
     * Constructor to create a Rocket object.
     *
     * @param cost                        the cost of the Rocket
     * @param weight                      the weight of the Rocket
     * @param maxWeight                   the maximum total weight that the Rocket can hold
     * @param chanceOfLaunchExplosionCoef the coefficient of launch explosion
     * @param chanceOfLandingCrashCoef    the coefficient of landing explosion
     */
    Rocket(int cost, int weight, int maxWeight, double chanceOfLaunchExplosionCoef, double chanceOfLandingCrashCoef) {
        this.cost = cost;
        this.weight = weight;
        this.maxWeight = maxWeight;
        this.chanceOfLaunchExplosionCoef = chanceOfLaunchExplosionCoef;
        this.chanceOfLandingCrashCoef = chanceOfLandingCrashCoef;
        this.cargoCarried = 0;
        this.cargoLimit = maxWeight - weight;
    }

    /**
     * Indicates if the launch was successful or if the rocket has crashed.
     * This function is overwritten by the child classes U1 and U2.
     *
     * @return true
     */
    public Boolean launch() {
        return true;
    }

    /**
     * Indicates if the launch was successful or if the rocket has crashed on landing.
     * This function is overwritten by the child classes U1 and U2.
     *
     * @return true
     */
    public Boolean land() {
        return true;
    }

    /**
     * Determines if the item will exceed the Rocket's weight limit.
     *
     * @param item an Item to be carried on the Rocket
     * @return Boolean that determines if the Item will fit on the Rocket
     */
    public Boolean canCarry(Item item) {
        return item.weight <= maxWeight - weight;
    }

    /**
     * Adds an Item's weight to the Rocket's carriedCargo and weight
     *
     * @param item an Item to be carried on the Rocket
     */
    public void carry(Item item) {
        cargoCarried += item.weight;
        weight += item.weight;
    }
}
