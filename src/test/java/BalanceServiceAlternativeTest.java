import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.Parameters;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class BalanceServiceAlternativeTest {

    @Test
    @Parameters(method = "balanceServiceWithdrawData")
    public void withdrawBalance(int count, int expected) {
        BalanceService service = new BalanceService();
        service.withdraw(count);
        assertEquals(expected, service.getBalance());
    }

    public Object[][] balanceServiceWithdrawData() {
        return new Object[][] {
                {100, -110},
                {200, -210},
                {300, -400}
        };
    }
}
