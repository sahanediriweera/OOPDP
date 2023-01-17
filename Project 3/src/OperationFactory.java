public class OperationFactory {
    static Operation create(String operator){
        Operation operation = null;

        if (operator.equals("min")){
            operation = new MinOperation();
        } else if (operator.equals("max")) {
            operation = new MaxOperation();
        } else if (operator.equals("sum")) {
            operation = new SumOperation();
        } else if (operator.equals("avg")) {
            operation = new AverageOperation();
        }

        return operation;

    }
}
