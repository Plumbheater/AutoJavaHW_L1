public class CashBackHackerService {
    private final int boundary = 1000;
    public int remain (int amout) {
        return boundary - amout % boundary;
    }

}
