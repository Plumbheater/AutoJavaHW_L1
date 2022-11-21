import org.testng.Assert;
import org.testng.annotations.Test;

public class CashBackHackerTest {

    @Test
    public void AmountZero() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void AmountThousand() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void Amount999() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }
}
