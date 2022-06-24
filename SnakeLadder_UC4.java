import java.lang.Math;
public class SnakeLadder_UC4 {
    public static void main(String[] args) {
        int playerPos = 0;

        while (playerPos <= 100) {
            int dice = (int) (Math.random() * 6) + 1;
            System.out.println("Player rolled: " + dice);

            int opt = (int) (Math.random() * 3) + 1;
            switch (opt) {
                case 1:
                    System.out.println("No Play :(");
                    System.out.println("Position: " + playerPos);
                    break;

                case 2:
                    System.out.println("Ladder :D");
                    playerPos += dice;
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
    }
}
