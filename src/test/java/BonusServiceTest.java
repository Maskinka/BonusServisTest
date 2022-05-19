import myservice.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class BonusServiceTest {
    // @Test
    //public void shouldCalculateForRegisteredAndUnderLimit() {

//   @Test
//    public void shouldCalculateForRegisteredAndUnderLimit() {
//        BonusService service = new BonusService();
//
//        long actual = service.calculate(1000_60, true);
//        long expected = 30;
//
//        Assertions.assertEquals(expected, actual);
//    }

    //    @Test
//    public void shouldCalculateForRegisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        long actual = service.calculate(1_000_000_60, true);
//        long expected = 500;
//
//        Assertions.assertEquals(expected, actual);
//    }
//
    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"})
    public void test(int amount, boolean registered, int expected) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);
        // long expected = 10;

        Assertions.assertEquals(expected, actual);
    }
//
//    @Test
//    public void shouldCalculateForNotRegisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        long actual = service.calculate(1_000_000_60, false);
//        long expected = 500;
//
//        Assertions.assertEquals(expected, actual);
    // }
}


