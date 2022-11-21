import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class CashBackHackerTest {

    @Test
    public void remain() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assertions.assertEquals(actual, expected);
    }

}
