import java.lang.Math;
public class SnakeLadder_UC6 {
    public static void main(String[] args) {
        int playerPos = 0;
        int dieRolls = 0;

        while (playerPos < 100) {
            int dice = (int) (Math.random() * 6) + 1;
            System.out.println("Player rolled: " + dice);
            dieRolls += 1;

            int opt = (int) (Math.random() * 3) + 1;
            switch (opt) {
                case 1:
                    System.out.println("No Play :(");
                    System.out.println("Position: " + playerPos);
                    break;

                case 2:
                    System.out.println("Ladder :D");
                    playerPos += dice;
                    if (playerPos > 100){
                        playerPos = 100;
                    }
                    System.out.println("Position: " + playerPos);
                    break;

                case 3:
                    System.out.println("Sanke :/");
                    if (playerPos <= 0) {
                        System.out.println("Position: 0");
                    } else {
                        playerPos -= dice;
                        System.out.println("Position: " + playerPos);
                    }

                    break;

                default:
                    System.out.println("Roll Again :)");
            }

        }
        System.out.println("Number of times die has rolled: "+dieRolls);
        if (playerPos == 100){
            System.out.println("Player has won!!");
        }
    }
}
