public class ArguementFactory {

    public static Arguments createArgument(String operation){
        Arguments arguments = null;
        if(operation.equals("store")){
            arguments = new Store();
        } else if (operation.equals("get")) {
            arguments = new Get();
        } else if (operation.equals("exit")) {
            arguments = new Exit();
        }

        return arguments;
    }
}
