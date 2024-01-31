public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps2(30));
    }

    public static int numberOfSteps1(int num) {
        int steps = 0;

        while (num > 0) {
            boolean isEven = num % 2 == 0;

            if (isEven) {
                num /= 2;
            } else {
                num--;
            }

            steps++;
        }

        return steps;
    }

    public static int numberOfSteps2(int num) {
        int steps = 0;

        while (num > 0) {
            boolean isEven = (num & 1) == 0;

            if (isEven) {
                num >>= 1;
            } else {
                num--;
            }

            steps++;
        }

        return steps;
    }
}