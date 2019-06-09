package calculator;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputValues = InputView.inputScreen();
        String[] inputValue = inputValues.split(" ");
        List<String> list = Arrays.stream(inputValue).collect(Collectors.toList());

        Calculator calculator = new Calculator(list);
        calculator.calculatePriorityOperator();
        calculator.calculateSecondaryOperator();

        calculator.result();

    }
}
