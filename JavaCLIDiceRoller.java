import java.util.*;

class JavaCLIDiceRoller {
    public static void main(String[] args) {
        int numberOfDice;
        int total = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of dice:");
        numberOfDice = scanner.nextInt();

        for (int i = 0; i < numberOfDice; i++) {
            int roll = random.nextInt(1, 7);
            printDice(roll);
            total += roll;
        }

        System.out.println("The total: " + total);
        scanner.close();
    }

    static void printDice(int roll) {
        String dice1 = """
                -----
               |     |
               |  0  |
               |     |
                -----
                """;

        String dice2 = """
                -----
               | 0   |
               |     |
               |   0 |
                -----
                """;

        String dice3 = """
                -----
               | 0   |
               |  0  |
               |   0 |
                -----
                """;

        String dice4 = """
                -----
               | 0 0 |
               |     |
               | 0 0 |
                -----
                """;

        String dice5 = """
                -----
               | 0 0 |
               |  0  |
               | 0 0 |
                -----
                """;

        String dice6 = """
                -----
               | 0 0 |
               | 0 0 |
               | 0 0 |
                -----
                """;

        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }
    }
}
