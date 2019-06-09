package calculator;


import java.util.List;

public class Calculator {
    List<String> inputValuesOne;

    public Calculator(List<String> inputValuesOne) {
        this.inputValuesOne = inputValuesOne;
    }

    public Calculator() {

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int i, int i1) {
        return i - i1;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }



    public void calculatePriorityOperator() {
        FindOperator findOperator = new FindOperator();
        int priorityCount = findOperator.findPriorityOperatorCount(inputValuesOne);
        for (int j = 0; j < priorityCount; j++) {
            for (int i = 0; i < inputValuesOne.size(); i++) {
                if (findOperator.findPriorityOperator(inputValuesOne.get(i))) {
                    if (findOperator.isMultiplyOperator(inputValuesOne.get(i))) {
                        String value = (Change.Integer(inputValuesOne.get(i - 1)) * Change.Integer(inputValuesOne.get(i + 1))) + "";
                        inputValuesOne.set(i - 1, value);
                        inputValuesOne.remove(i);
                        inputValuesOne.remove(i);
                        break;
                    }

                    if (findOperator.isDivideOperator(inputValuesOne.get(i))) {
                        String value = (Change.Integer(inputValuesOne.get(i - 1)) / Change.Integer(inputValuesOne.get(i + 1))) + "";
                        inputValuesOne.set(i - 1, value);
                        inputValuesOne.remove(i);
                        inputValuesOne.remove(i);
                        break;
                    }
                }
            }
        }
        System.out.println(inputValuesOne);
    }

    public void calculateSecondaryOperator() {
        FindOperator findOperator = new FindOperator();
        int priorityCount = findOperator.findSecondaryOperatorCount(inputValuesOne);
        for (int j = 0; j < priorityCount; j++) {
            for (int i = 0; i < inputValuesOne.size(); i++) {
                if (findOperator.findSecondBestOperator(inputValuesOne.get(i))) {
                    if (findOperator.isPlusOperator(inputValuesOne.get(i))) {
                        String value = (Change.Integer(inputValuesOne.get(i - 1)) + Change.Integer(inputValuesOne.get(i + 1))) + "";
                        inputValuesOne.set(i - 1, value);
                        inputValuesOne.remove(i);
                        inputValuesOne.remove(i);
                        break;
                    }

                    if (findOperator.isMinusOperator(inputValuesOne.get(i))) {
                        String value = (Change.Integer(inputValuesOne.get(i - 1)) - Change.Integer(inputValuesOne.get(i + 1))) + "";
                        inputValuesOne.set(i - 1, value);
                        inputValuesOne.remove(i);
                        inputValuesOne.remove(i);
                        break;
                    }
                }
            }
        }
    }

    public void result() {
        System.out.println(inputValuesOne);
    }


}

