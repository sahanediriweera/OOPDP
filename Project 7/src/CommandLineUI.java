public class CommandLineUI implements UI{

    String[] args;

    CommandLineUI(String[] args){
        this.args = args;
    }

    public void show(){
        Argument argument = new CommandLineArguments(args);
        Operation operation = OperationFactory.create(argument.getOperator(),argument.getOperands());
        double result = operation.execute();
        System.out.println(argument.getOperator()+" "+result);
    }

}
