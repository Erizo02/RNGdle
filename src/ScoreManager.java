public class ScoreManager {
    private static int score;

    //Changed to add score based on original and removed zeros
    public static int calculateScore(int[] original, int[] processed) {
        if (isSame(original)) score += 10000;
        if (isZero(processed)) score += 39800;
        if (isMillion(original)) score += 39800;
        return score;
    }

    private static boolean isZero(int[] numbers) { //1 in a million + 1
        return numbers.length == 1 && numbers[0] == 0;
    }

    private static boolean isMillion(int[] numbers) { //1 in a million + 1
        return numbers.length == 7;
    }

    private static boolean isSame(int[] numbers) { //1 in 100k
        int start = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != start) {
                return false;
            }
        }
        return true;
    }
}
