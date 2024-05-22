package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VacationServiceTest {

    @Test
    void testCalculateVacationExample1() {
        VacationService service = new VacationService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int vacationMonths = service.calculateVacation(income, expenses, threshold);

        assertEquals(3, vacationMonths);
    }

    @Test
    void testCalculateVacationExample2() {
        VacationService service = new VacationService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;

        int vacationMonths = service.calculateVacation(income, expenses, threshold);

        assertEquals(2, vacationMonths);
    }
}
