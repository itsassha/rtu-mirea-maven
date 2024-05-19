import org.example.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        // Подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // Вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // Производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        // Подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // Вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // Производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
