package learn.gomoku.game;

import learn.gomoku.players.HumanPlayer;
import learn.gomoku.players.Player;
import learn.gomoku.players.RandomPlayer;

import java.util.Scanner;

public class Start {

    public static Player[] createPlayers() {

        Scanner newScanner = new Scanner(System.in);

        Player[] players = new Player[2];
        System.out.println("Is Player One human? Enter 1 for human, 2 for computer:");
        String playerOneIsHuman = newScanner.nextLine();
        if (playerOneIsHuman.equals("1")) {
            System.out.println("Enter player name:");
            String name1 = newScanner.nextLine();
            HumanPlayer one = new HumanPlayer(name1);
            String player1Name = one.getName();
            System.out.println(player1Name);
            players[0] = one;
        } else if (playerOneIsHuman.equals("2")) {
            RandomPlayer one = new RandomPlayer();
            players[0] = one;
        } else {
            System.out.println("please enter either 1 or 2");
        }

        System.out.println("Is Player Two human? Enter 1 for human, 2 for computer:");
        String player2isHuman = newScanner.nextLine();
        if (player2isHuman.equals("1")) {
            System.out.println("Enter player name:");
            String name2 = newScanner.nextLine();
            HumanPlayer two = new HumanPlayer(name2);
            String player1Name = two.getName();
            System.out.println(player1Name);
            players[1] = two;
        } else {
            if (player2isHuman.equals("2")) {
                RandomPlayer two = new RandomPlayer();
                System.out.println("Player name is:");
                System.out.println(two.getName());
                players[1] = two;
            } else {
                System.out.println("please enter either 1 or 2");
            }
        }

        return players;
    }
}
