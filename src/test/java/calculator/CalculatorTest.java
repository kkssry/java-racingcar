package calculator;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class CalculatorTest {
    Calculator cal = new Calculator(new String[]{"3","+","3"});

    @Test
    public void addTest() {
        assertThat(cal.add(3,3)).isEqualTo(6);
    }

    @Test
    public void substractTest() {
        assertThat(cal.substract(4,3)).isEqualTo(1);
    }

    @Test
    public void divideTest() {
        assertThat(cal.divide(4,2)).isEqualTo(2);
    }

    @Test
    public void multiplyTest() {
        assertThat(cal.multiply(3,4)).isEqualTo(12);
    }
}