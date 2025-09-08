package alg;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-12, 2, 6, 78, 41, 25, -126, -8, -7, -52, 458, 5};

        double avg = calculateAvg(numbers);
        System.out.println("Avg: " + avg);

        boolean containsNumberDividedBy11 = containsNumberDividedBy11(numbers);
        System.out.println("ContainsNumberDividedBy11: " + containsNumberDividedBy11);

        int max = findMax(numbers);
        System.out.println("Max: " + max);

        //swap: [0], [1]
        int tmp = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = tmp;
    }

    public static double calculateAvg(int[] values) {
        int count = values.length;
        double sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }

        return sum / count;
    }

    //True, if a number can be divided by 11
    public static boolean containsNumberDividedBy11(int[] values) {
        boolean result = false;

        for (int i = 0; i < values.length; i++) {
            if (values[i] % 11 == 0) {
                result = true;
                break;
            }
        }

        return result;
    }

    public static int findMax(int[] values) {
        int max = values[0];

        for (int i = 0; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }

        return max;
    }

}