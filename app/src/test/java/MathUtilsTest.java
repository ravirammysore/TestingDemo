import com.rkr.testingdemo.MathUtils;
import junit.framework.TestCase;

public class MathUtilsTest extends TestCase {

    public void testAdd() {
        MathUtils mu = new MathUtils();
        assertEquals(10, mu.add(5,5));
    }

    public void testSub() {
        MathUtils mu = new MathUtils();
        assertEquals(1, mu.sub(5,4));
    }
}