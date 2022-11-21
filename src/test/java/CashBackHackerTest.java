import org.junit.Assert;
import org.junit.Test;

public class CashBackHackerTest {

    @Test
    public void remain() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

}
