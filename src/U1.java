/**
 * U1 class extends the Rocket Superclass to represent a U1 rocket (as opposed to a U2 rocket).
 * The predefined values are:
 * Rocket cost = $100 Million
 * Rocket weight = 10 Tonnes
 * Max weight (with cargo) = 18 Tonnes
 * Chance of launch explosion = 5% * (cargo carried / cargo limit)
 * Chance of landing crash = 1% * (cargo carried / cargo limit)
 *
 * @author Jeremy Spooner
 * @version 1.0
 */
public class U1 extends Rocket {
    /**
     * Default constructor for the U1 class using the Rocket Super Class constructor.
     */
    U1() {
        super(100, 10, 18, .05, .01);
    }

    /**
     * Indicates if the launch was successful or if the rocket has crashed.
     *
     * @return true if the launch is successful and false if it fails
     */
    public Boolean launch() {
        double launchExplosionOdds = (chanceOfLaunchExplosionCoef * ((double) cargoCarried) / ((double) cargoLimit));
        return launchExplosionOdds < Math.random() * 100;
    }

    /**
     * Indicates if the launch was successful or if the rocket has crashed on landing.
     *
     * @return true if the landing is successful and false if it fails
     */
    public Boolean land() {
        return (chanceOfLandingCrashCoef * ((double) cargoCarried) / ((double) cargoLimit)) < (Math.random() * 100);
    }

    /**
     * Determines if the item will exceed the Rocket's weight limit.
     *
     * @param item an Item to be carried on the Rocket
     * @return Boolean that determines if the Item will fit on the Rocket
     */
    public Boolean canCarry(Item item) {
        return super.canCarry(item);
    }

    /**
     * Adds an Item's weight to the Rocket's carriedCargo and weight
     *
     * @param item an Item to be carried on the Rocket
     */
    public void carry(Item item) {
        super.carry(item);
    }
}
