import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Vector2DTest {
    @Test
    public void newVectorShouldHaveZeroLength(){
        Vector2D v1 = new Vector2D(); // action

        // assertion
        Assertions.assertEquals(0, v1.length(), 1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroX(){
        Vector2D v1 = new Vector2D();

        Assertions.assertEquals(0, v1.getX(), 1e-9);
    }

    @Test
    public void newVectorShouldHaveZero(){
        Vector2D v1 = new Vector2D();
        Assertions.assertEquals(0, v1.getY(), 1e-9);
    }
}
