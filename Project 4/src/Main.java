public class Main {
    public static void main(String[] args) {
        Argument argument = new Argument(args);

        Operation operation = OperationFactory.create(argument.getOperator());

        double result = operation.execute(argument.getOperands());

        System.out.println(argument.getOperator()+ "==" + result);
    }
}