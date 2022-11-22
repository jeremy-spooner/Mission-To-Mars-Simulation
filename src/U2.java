/**
 * U2 class extends the Rocket Superclass to represent a U2 rocket (as opposed to a U1 rocket).
 * The predefined values are:
 * <p>
 * Rocket cost = $120 Million
 * Rocket weight = 18 Tonnes
 * Max weight (with cargo) = 29 Tonnes
 * Chance of launch explosion = 4% * (cargo carried / cargo limit)
 * Chance of landing crash = 8% * (cargo carried / cargo limit)
 *
 * @author Jeremy Spooner
 * @version 1.0
 */
public class U2 extends Rocket {
    /**
     * Default constructor for the U2 class using the Rocket Super Class constructor.
     */
    U2() {
        super(120, 18, 29, .04, .08);
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
        double landingExplosionOdds = (chanceOfLandingCrashCoef * ((double) cargoCarried) / ((double) cargoLimit));
        double random = (Math.random() * 100);
        return landingExplosionOdds < Math.random() * 100;
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
