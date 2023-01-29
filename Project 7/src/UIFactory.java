public class UIFactory {
    public static UI create(String[] args){

        UI ui = null;

        if (args == null){
            ui = new GUI();
        }else {
            ui = new CommandLineUI(args);
        }

        return ui;
    }
}
