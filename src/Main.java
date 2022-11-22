import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Main class that is used to run the Mission to Mars Simulation
 *
 * @author Jeremy Spooner
 * @version 1.0
 */
public class Main {
    /**
     * Main function that runs the simulation.
     * <p>
     * The simulation executes in the following steps:
     * 1. Create a Simulation object
     * 2. Load Items for Phase-1 and Phase-2
     * 3. Load a fleet of U1 rockets for Phase-1 and then for Phase-2
     * 4. Run the simulation using the fleet of U1 rockets and display the total budget required.
     * 5. Run the simulation using the fleet of U2 rockets and display the total budget required.
     *
     * @param args user command line input
     * @throws FileNotFoundException the exception for a file not found
     */
    public static void main(String[] args) throws FileNotFoundException {
        // 1. Create a Simulation object
        Simulation simulation = new Simulation();
        // 2. Load Items for Phase-1 and Phase-2
        ArrayList<Item> phase1 = simulation.loadItems("input/phase-1.txt");
        ArrayList<Item> phase2 = simulation.loadItems("input/phase-2.txt");
        // 3. Load a fleet of U1 rockets for Phase-1 and then for Phase-2
        ArrayList<Rocket> u1sPhase1 = simulation.loadU1(phase1);
        ArrayList<Rocket> u1sPhase2 = simulation.loadU1(phase2);
        u1sPhase1.addAll(u1sPhase2);
        // 4. Run the simulation using the fleet of U1 rockets and display the total budget required.
        int u1Cost = simulation.runSimulation(u1sPhase1);
        System.out.println("Cost of using U1 Rockets: $" + u1Cost + " Million");
        // 5. Run the simulation using the fleet of U2 rockets and display the total budget required
        ArrayList<Rocket> u2sPhase1 = simulation.loadU2(phase1);
        ArrayList<Rocket> u2sPhase2 = simulation.loadU2(phase2);
        u2sPhase1.addAll(u2sPhase2);
        int u2Cost = simulation.runSimulation(u2sPhase1);
        System.out.println("Cost of using U2 Rockets: $" + u2Cost + " Million");
    }
}