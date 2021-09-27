package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        //69.38218057582237
        PaymentCalculator paymentCalculator = new PaymentCalculator(5000, 12, 100);
        assertEquals(69.38218057582237, paymentCalculator.calculateMonthsUntilPaidOff());
    }
}