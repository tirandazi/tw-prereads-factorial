public class Factorial {
    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    public int getResult() {
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
