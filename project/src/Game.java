import java.util.Random;

public class Game {
    private int secret;
    private int attempts;

    public Game(int maxNumber) {
        Random random = new Random();
        secret = random.nextInt(maxNumber) + 1;
        attempts = 0;
    }

    public String guess(int number) {
        attempts++;
        if (number < secret) {
            return "Too low!";
        } else if (number > secret) {
            return "Too high!";
        } else {
            return "Correct! You guessed it in " + attempts + " tries.";
        }
    }

    public boolean isCorrect(int number) {
        return number == secret;
    }
}