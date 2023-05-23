import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BalanceServiceTest {

    @Parameterized.Parameters(name = "{index}: add {0} - expected {1}")
    public static Object[][] params() {
        return new Object[][]{
            {100, 90}, //0, 1
            {200, 190},
            {300, 290}
        };
    }

//    @Parameterized.Parameters
//    public static Object[] singleParam() {
//        return new Object[]{100, 200, 300, 400};
//    }

    public int count;

    public int expected;

    //0, 1
    public BalanceServiceTest(int expected, int count) {
        this.count = count;
        this.expected = expected;
    }

    @Test
    public void testAddBalance() {
        BalanceService service = new BalanceService();
        service.add(count);
        assertEquals(expected, service.getBalance());
    }
}
