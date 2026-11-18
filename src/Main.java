import java.util.Arrays;

public class Main {
    static void main() {
        RNG rng = new RNG();

        int[] numbers = rng.generateNumbers();
        int[] displayNumbers = rng.removeLeadingZeros(numbers);
        int score = ScoreManager.calculateScore(numbers, displayNumbers);
        System.out.println(Arrays.toString(displayNumbers));
        System.out.println(score);
    }
}
