import java.util.List;

public class OperationFactory {
    public static Operation create(String operator, List<Double> operands){
        Operation operation = null;

        if(operator.equals("min")){
            operation = new MinOperation(operands);
        } else if (operator.equals("max")) {
            operation = new MaxOperation(operands);
        } else if (operator.equals("sum")) {
            operation = new SumOperation(operands);
        } else if (operator.equals("avg")) {
            operation = new AvgOperation(operands);
        }

        return operation;
    }
}
