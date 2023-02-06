public class UIFactory {

    static UI create(String[] args){
        UI ui = null;

        if(args.length == 0){
            ui = new GUI();
        } else {
            ui = new CommandLine(args);
        }
        return ui;
    }

}
