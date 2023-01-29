import java.util.List;

public class OperationFactory {

    public static Operation create(String operator, List<Double> operands){

        Operation operation = null;

        if (operator.equals("max")){
            operation = new MaxOperation(operands);
        } else if (operands.equals("min")){
            operation = new MinOperation(operands);
        } else if (operands.equals("sum")) {
            operation = new SumOperation(operands);
        } else if (operands.equals("avg")) {
            operation = new Avg(operands);
        }

        return operation;
    }

}
