package com.ggoomsigi.hotstudy;

import com.ggoomsigi.hotstudy.test.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @DisplayName("나누기 테스트")
    @Test
    public void divideTest() {
        Calculator calculator = new Calculator();
        int expect = 3;
        int result = calculator.divide(9,3);
        assertEquals(expect,result);
    }
}
