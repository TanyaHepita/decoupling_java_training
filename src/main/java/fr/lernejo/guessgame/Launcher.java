package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {
    public static void main() {
        Simulation simulation = new Simulation(new HumanPlayer());
        SecureRandom random = new SecureRandom();
        simulation.initialize(random.nextInt(100));
        simulation.loopUntilPlayerSucceed();
    }
}
