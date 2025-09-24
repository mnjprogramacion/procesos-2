import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Game game = new Game(100);

        System.out.println("Guess the number between 1 and 100!");

        boolean correct = false;
        while (!correct) {
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();
            String result = game.guess(guess);
            System.out.println(result);
            correct = game.isCorrect(guess);
        }

        input.close();
    }
}