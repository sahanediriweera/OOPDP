public class OperationFactory {
    public static Operation create(String operator){
        Operation operation = null;

        if (operator.equals("min")){
            operation = new MinOperation();
        } else if (operator.equals("max")) {
            operation = new MinOperation();
        } else if (operator.equals("sum")) {
            operation = new SumOperation();
        } else if (operator.equals("avg")) {
            operation = new AvgOperation();
        }
        return operation;
    }
}
