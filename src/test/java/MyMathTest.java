import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyMathTest {
    @Test()
    public void zeroDenominationShouldThrowException(){
        Assertions.assertThrows(ArithmeticException.class, () ->{
           MyMath myMath = new MyMath();
           myMath.divide(1, 0);
        });
    }
}
