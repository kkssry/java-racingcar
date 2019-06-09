package calculator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class FindOperatorTest {

    @Test
    public void 곱셈나눗셈연산자찾기() {
        FindOperator findOperator = new FindOperator();
        assertThat(findOperator
                .findPriorityOperator(new String[]{"2", "+", "3", "*", "4", "-", "6", "/", "2"}, "*","/"))
                .isEqualTo(3);
    }

    @Test
    public void 곱셈나눗셈연산자없는데찾기() {
        FindOperator findOperator = new FindOperator();
        assertThat(findOperator
                .findPriorityOperator(new String[]{"2", "+", "3", "+", "4", "-", "6", "-", "2"},"*","/"))
                .isEqualTo(0);
    }

    @Test
    public void 덧셈뺄셈연산자찾기() {
        FindOperator findOperator = new FindOperator();
        assertThat(findOperator
                .findSecondBestOperator(new String[]{"2", "*", "3", "+", "4", "/", "2"},"+", "-"))
                .isEqualTo(3);
    }

    @Test
    public void 덧셈뺄셈연산자없는데찾기() {
        FindOperator findOperator = new FindOperator();
        assertThat(findOperator
                .findSecondBestOperator(new String[]{"2", "*", "3", "/", "2"},"+", "-"))
                .isEqualTo(0);
    }

    @Test
    public void 연산자개수찾기() {
        FindOperator findOperator = new FindOperator();
        assertThat(findOperator.findOperatorCount(Arrays.asList("2", "+", "3", "-", "2", "*", "5", "+", "6", "/", "3"))).isEqualTo(5);
    }
}
