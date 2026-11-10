public class ScoreManager {
    private static int score;

    public static int calculateScore(int[] numbers) {
        if(isSame(numbers)) score += 10000;
        return score;
    }

    private static boolean isSame(int[] numbers) {
        int start = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != start) {
                return false;
            }
        }
        return true;
    }
}
