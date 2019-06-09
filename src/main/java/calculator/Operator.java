package calculator;

public enum Operator {
    PLUS("+"), DIVIDE("/"), SUBSTRACT("-"), MULTIPLY("*");

     private final String operator;

     Operator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }
}
