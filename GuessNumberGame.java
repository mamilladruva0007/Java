import java.util.*;

class GuessNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int target = r.nextInt(1, 101);
        int guess = 0;

        System.out.println("I'm thinking of a number between 1 and 100!");

        while (guess != target) {
            System.out.println("Take a guess:");
            guess = sc.nextInt();

            if (guess > target) {
                System.out.println("Too high, try again!");
            }

            if (guess < target) {
                System.out.println("Too low, try again!");
            }

            if (guess == target) {
                System.out.println("That's it! You guessed right. You win!");
            }
        }

        sc.close();
    }
}
