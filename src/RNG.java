import java.util.Arrays;
import java.util.Random;

public class RNG {
    private final Random random;

    public RNG() {
        random = new Random();
    }

    //Generating array of random numbers with possible leading zeros
    public int[] generateNumbers() {
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
