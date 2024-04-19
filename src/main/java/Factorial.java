public class Factorial {
    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    public int getResult() {
//        6! = 6 * 5 * 4 * 3 * 2 * 1
        if (this.number < 0) {
            throw new IllegalArgumentException();
        }
        int result = 1;
        while (this.number > 0) {
            result *= this.number;
            this.number -= 1;
        }
        return result;
    }
}
