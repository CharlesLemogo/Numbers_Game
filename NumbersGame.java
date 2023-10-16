import java.util.Random;

public class NumbersGame {
    public static void main(String[] args) {
        System.out.println("Hello, human. I am thinking of a number between 0 and 10.");
        System.out.println("*********************************************************");
        System.out.println("Can you guess the number?");
        System.out.println("If you are not up to the task, you can always type 'q' to quit.");


        while (true) {
            int answer = new Random().nextInt(0, 10);
            String guess = System.console().readLine();

            try {
                if (guess.equals("q") || guess.equals("Q")) {
                    System.out.println("I knew you didn't have it in you.");
                    System.out.println("Shutting down...");
                    break;
                }

                int numGuess = Integer.parseInt(guess);

                if (numGuess < 0 || numGuess > 10) {
                    System.out.println("Invalid input. Please enter a number between 0 and 10 or 'q' to quit.");
                    System.out.println("Please try again.");
                    continue;
                }

                if (numGuess == answer) {
                    System.out.println("Lucky guess! But can you do it again? or press 'q' to quit");
                    continue;
                } else {
                    System.out.println("Swing and a miss! Keep trying...");
                }



            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 0 and 10 or 'q' to quit.");
                System.out.println("Please try again.");
            }
        }

        System.out.println("Game over. Shutting down...");
    }
}
