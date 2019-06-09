package calculator;

import java.util.List;

public class FindOperator {


    public FindOperator() {
    }

    public boolean findPriorityOperator(String arr) {
        if (arr.equals(Operator.MULTIPLY.getOperator()) || arr.equals(Operator.DIVIDE.getOperator())) {
            return true;
        }
        return false;
    }

    public boolean findSecondBestOperator(String arr) {
        if (arr.equals(Operator.PLUS.getOperator()) || arr.equals(Operator.SUBSTRACT.getOperator())) {
            return true;
        }
        return false;
    }

    public boolean isMultiplyOperator(String priorityOperator) {
        return priorityOperator.equals(Operator.MULTIPLY.getOperator());
    }

    public boolean isDivideOperator(String priorityOperator) {
        return priorityOperator.equals(Operator.DIVIDE.getOperator());
    }

    public boolean isMinusOperator(String priorityOperator) {
        return priorityOperator.equals(Operator.SUBSTRACT.getOperator());
    }

    public boolean isPlusOperator(String priorityOperator) {
        return priorityOperator.equals(Operator.PLUS.getOperator());
    }


    public int findPriorityOperatorCount(List<String> arr) {
        int count = 0;
        for (String s : arr) {
            if (s.equals(Operator.DIVIDE.getOperator())) {
                count++;
            }

            if (s.equals(Operator.MULTIPLY.getOperator())) {
                count++;
            }
        }

        return count;
    }

    public int findSecondaryOperatorCount(List<String> arr) {
        int count = 0;
        for (String s : arr) {
            if (s.equals(Operator.PLUS.getOperator())) {
                count++;
            }

            if (s.equals(Operator.SUBSTRACT.getOperator())) {
                count++;
            }
        }
        return count;

    }
}
