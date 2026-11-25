import java.util.Arrays;
import java.util.Random;

public class RNG {
    private final Random random;
    private boolean million;

    public RNG() {
        random = new Random();
        million = false;
    }

    //Generating array of random numbers with possible leading zeros
    public int[] generateNumbers() {
        million = random.nextInt(1_000_001) == 1_000_000;
        if (million) return new int[] {1, 0, 0, 0, 0, 0, 0};

        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        return numbers;
    }

    //Check for leading zeros
    public int[] removeLeadingZeros(int[] numbers) {
        int leadingZeros = 0;
        while (leadingZeros < numbers.length && numbers[leadingZeros] == 0) {
            leadingZeros++;
        }

        //If there are leading zeros, shrink an array
        int[] result = Arrays.copyOfRange(numbers, leadingZeros, numbers.length);
        //If it's all zeros, print zero
        if (result.length == 0) result = new int[] {0};
        return result;
    }
}
