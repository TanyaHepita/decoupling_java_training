package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type
    Scanner scanner = new Scanner(System.in);
    public Simulation(Player player) {
        this.player=player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        logger.log("donnez un nombre");
        long p = player.askNextGuess();
        if (p == numberToGuess) {
            return true;
        }
        if (p > numberToGuess) {
            logger.log("plus petit");
            player.respond(false);
        }else{
            logger.log("plus grand");
            player.respond(true);
        }
        return false;
    }

    public void loopUntilPlayerSucceed() {
        boolean a = nextRound() ;
        while(!a){
            a = nextRound();
        }
    }
}
