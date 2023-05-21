public class CLI implements UI{

    String argument;

    CLI(String[] args){
        this.argument = args[0];
    }

    @Override
    public void show() {

        while (true){
            Arguments arguments = ArguementFactory.createArgument(argument);
            arguments.run();
        }
    }
}
