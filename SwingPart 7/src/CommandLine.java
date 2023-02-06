public class CommandLine implements UI{

    private String[] args;

    public CommandLine(String[] args){
        this.args = args;
    }

    @Override
    public void show() {
        Arguments arguments = new CommandLineArguments(args);
        Operation operation = OperationFactory.create(arguments.getOperator(),arguments.getOperands());
        Double result = operation.execute();
        System.out.println(arguments.getOperator()+ " == "+result);
    }
}
