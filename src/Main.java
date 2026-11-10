import java.util.Arrays;

public class Main {
    static void main() {
        RNG rng = new RNG();

        int[] numbers = rng.generateNumbers();
        int score = ScoreManager.calculateScore(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(score);
    }
}
