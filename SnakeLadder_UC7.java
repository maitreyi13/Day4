import java.lang.Math;
public class SnakeLadder_UC7 {
    public static void main(String[] args) {
        int player1Pos = 0;
        int player2Pos = 0;
        int dieRolls = 0;
        boolean is_player = false;

        while (player1Pos < 100 && player2Pos < 100) {
            int dice = (int) (Math.random() * 6) + 1;
            System.out.println("Player rolled: " + dice);
            dieRolls += 1;

            int opt = (int) (Math.random() * 3) + 1;
            switch (opt) {
                case 1:
                    if (is_player) {
                        System.out.println("No Play :(");
                        System.out.println("Position of player 1: " + player1Pos);
                        is_player = true;
                    }else {
                        System.out.println("No Play :(");
                        System.out.println("Position of player 2: " + player2Pos);
                        is_player = false;
                    }
                    break;

                case 2:
                    if (is_player) {
                        System.out.println("Ladder :D");
                        player1Pos += dice;
                        if (player1Pos > 100) {
                            player1Pos = 100;
                        }
                        System.out.println("Position of player 1: " + player1Pos);
                        is_player = true;
                    }else {
                        System.out.println("Ladder :D");
                        player2Pos += dice;
                        if (player2Pos > 100) {
                            player2Pos = 100;
                        }
                        System.out.println("Position of player 2: " + player2Pos);
                        is_player = false;
                    }
                    break;

                case 3:
                    if (is_player) {
                        System.out.println("Sanke :/");
                        if (player1Pos <= 0) {
                            System.out.println("Position of player 1: 0");
                        } else {
                            player1Pos -= dice;
                            System.out.println("Position of player 1: " + player1Pos);
                        }
                        is_player = true;
                    } else {
                        System.out.println("Sanke :/");
                        if (player2Pos <= 0) {
                            System.out.println("Position of player 2: 0");
                        } else {
                            player2Pos -= dice;
                            System.out.println("Position of player 2: " + player2Pos);
                        }
                        is_player = false;
                    }
                    break;

                default:
                    System.out.println("Roll Again :)");
            }

        }
        System.out.println("Number of times die has rolled: "+dieRolls);
        if (player1Pos == 100){
            System.out.println("Player 1 has won!!");
        } else if (player2Pos == 100){
            System.out.println("Player 2 has won!!");
        }
    }
}
