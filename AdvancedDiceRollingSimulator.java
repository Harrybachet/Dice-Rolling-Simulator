import java.util.Random;

public class AdvancedDiceRollingSimulator {

    // Array to represent the dice faces
    private static final String[][] DICE_FACES = {
        {   // Face 1
            " ------- ",
            "|       |",
            "|   *   |",
            "|       |",
            " ------- "
        },
        {   // Face 2
            " ------- ",
            "| *     |",
            "|       |",
            "|     * |",
            " ------- "
        },
        {   // Face 3
            " ------- ",
            "| *     |",
            "|   *   |",
            "|     * |",
            " ------- "
        },
        {   // Face 4
            " ------- ",
            "| *   * |",
            "|       |",
            "| *   * |",
            " ------- "
        },
        {   // Face 5
            " ------- ",
            "| *   * |",
            "|   *   |",
            "| *   * |",
            " ------- "
        },
        {   // Face 6
            " ------- ",
            "| *   * |",
            "| *   * |",
            "| *   * |",
            " ------- "
        }
    };

    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();

        // Simulate rolling the dice
        int diceRoll = random.nextInt(6);  // Generates a number between 0 and 5

        // Display the result
        System.out.println("You rolled a " + (diceRoll + 1) + "!\n");
        printDiceFace(diceRoll);
    }

    // Method to print the dice face
    private static void printDiceFace(int diceRoll) {
        String[] face = DICE_FACES[diceRoll];
        for (String line : face) {
            System.out.println(line);
        }
    }
}
