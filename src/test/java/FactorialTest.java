import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    @Test
    void shouldReturnOneForFactorialZero() {
        Factorial factorial = new Factorial(0);
        int factorialResult = factorial.getResult();
        assertEquals(1, factorialResult);
    }

    @Test
    void shouldReturnFactorialOfSix() {
        Factorial factorial = new Factorial(6);
        int factorialResult = factorial.getResult();
        assertEquals(720, factorialResult);
    }

    @Test
    void shouldThrowException() {
        Factorial factorial = new Factorial(-5);
        assertThrowsExactly(IllegalArgumentException.class, factorial::getResult);
    }

    @Test
    void shouldNotThrowException() {
        Factorial factorial = new Factorial(50);
        assertDoesNotThrow(factorial::getResult);
    }
}
