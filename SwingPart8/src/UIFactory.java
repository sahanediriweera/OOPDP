public class UIFactory {

    public static UI createUI(String[] args){
        UI ui = null;
        if(args.length<1){
            ui = new GUI();
        }
        if (args[0].equals("cli")){
            ui = new CLI(args);
        }
        return ui;
    }

}
