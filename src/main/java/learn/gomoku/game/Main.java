package learn.gomoku.game;

import learn.gomoku.players.Player;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Gomoku!");

        Player[] players = Start.createPlayers();
        Player one = players[0];
        Player two = players[1];
        Gomoku game = new Gomoku(one, two);

//        while game is not over:
//        do {
//            print board


//        check who current player is
//            Player currentPlayer = game.getCurrent();
//            String name = currentPlayer.getName();
////            System.out.println(name+"'s turn");
//            Stone newStone = currentPlayer.generateMove(stones);
//        if computer, place stone
//            check if stone placement is valid
//        if human, as for stone placement; if generateMove() == null, player is human

//          check if new stone has valid placement
//              (if yes, place stone
//              if no, ask for new stone)
//        print board

//            } while (!game.isOver());

    }

//    public static void createPlayers() {
//        Scanner newScanner = new Scanner(System.in);
//
//        System.out.println("Is Player One human? Enter 1 for human, 2 for computer:");
//        String playerOneIsHuman = newScanner.nextLine();
//        if (playerOneIsHuman.equals("1")) {
//            System.out.println("Enter player name:");
//            String name1 = newScanner.nextLine();
//            HumanPlayer one = new HumanPlayer(name1);
//            String player1Name = one.getName();
//            System.out.println(player1Name);
//        } else if (playerOneIsHuman.equals("2")) {
//            RandomPlayer one = new RandomPlayer();
//        } else {
//            System.out.println("please enter either 1 or 2");
//        }
//
//        System.out.println("Is Player Two human? Enter 1 for human, 2 for computer:");
//        String player2isHuman = newScanner.nextLine();
//        if (player2isHuman.equals("1")) {
//            System.out.println("Enter player name:");
//            String name2 = newScanner.nextLine();
//            HumanPlayer two = new HumanPlayer(name2);
//            String player1Name = two.getName();
//            System.out.println(player1Name);
//        } else {
//            if (player2isHuman.equals("2")) {
//                RandomPlayer two = new RandomPlayer();
//                System.out.println("Player name is:");
//                System.out.println(two.getName());
//            } else {
//                System.out.println("please enter either 1 or 2");
//            }
//        }

}

