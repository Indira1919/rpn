import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {

    ReversePolishNotationCalculator rpc = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        int expectedSum = 1;
        int resultSum = rpc.calculatePolishNotation("-4  3 2  + +");

        Assertions.assertEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldCalculateSubtraction() {
        int expectedSum = -30;
        int resultSum = rpc.calculatePolishNotation("-25   10 5  - -");

        Assertions.assertEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldCalculateMultiplication() {
        int expectedSum = 400;
        int resultSum = rpc.calculatePolishNotation("-2  10   5  -4 * * *");

        Assertions.assertEquals(expectedSum, resultSum);
    }
}
