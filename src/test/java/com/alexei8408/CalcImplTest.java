package com.alexei8408;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalcImplTest {
    private CalcImpl calcImpl = new CalcImpl();

    private BigDecimal actual(char operation) {
        return calcImpl.calc(5, 7, operation);

    }

    @Test
    void calc_Num_a_Add_Num_b() {
        assertEquals(new BigDecimal(12), actual('+'));
    }

    @Test
    void calc_Num_a_Subtract_Num_b() {
        assertEquals(new BigDecimal(-2), actual('-'));
    }

    @Test
    void calc_Num_a_Multiply_Num_b() {
        assertEquals(new BigDecimal(35), actual('*'));
    }

    @Test
    void calc_Num_a_Divide_Num_b() {
        BigDecimal expected = new BigDecimal(5).divide(new BigDecimal(7), 9, BigDecimal.ROUND_CEILING);
        assertEquals(expected, actual('/'));
    }
}