package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements  Player{
    private Logger logger = LoggerFactory.getLogger("player");
    Scanner scanner = new Scanner(System.in);
    @Override
    public long askNextGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un nombre :");
        return scanner.nextInt();
    }

    @Override
    public void respond(boolean lowerOrGreater) {

    }
}
