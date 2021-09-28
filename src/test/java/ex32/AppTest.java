package ex32;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void getRandomNumber(){
        App AppTest = new App();
        int num = AppTest.getRandomNumber(1);
        Assertions.assertTrue(num < 10 && num > 1);
        int num2 = AppTest.getRandomNumber(5);
        Assertions.assertTrue(num2 < 100000 && num2 > 1);
    }
}
