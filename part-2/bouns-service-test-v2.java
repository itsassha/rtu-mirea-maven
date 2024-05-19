package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/mocks/mock-data.csv", numLinesToSkip = 1)
    void shouldCalculateCorrectly(int income, int expenses, int threshold, int expected) {
        BonusService service = new BonusService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
