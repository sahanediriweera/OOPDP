public class CommandLineUI implements UI{
    private String[] args;

    CommandLineUI(String[] args){
        this.args = args;
    }

    public void show(){
        Arguments arguments = new CommandLineArguments(args);
        Operation operation = OperationFactory.create(arguments.getOperator(),arguments.getOperands());
        Double result = operation.execute();
        System.out.println(arguments.getOperator() + " " + result);
    }
}
