public class Main {
    public static void main(String[] args) {

        Argument argument = new Argument(args);

        Operation operation = OperationFactory.create(argument.getOperator(), argument.getOperands());

        double result = operation.execute();

        System.out.println(argument.getOperator() + " == "+ result);

    }
}