import Factory.Dialog;
import Factory.HtmlDialog;
import Factory.WindowsDialog;

public class Main {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure(){
        if(System.getProperty("os.name").equals("Windows 11")){
            dialog = new WindowsDialog();
        }else{
            dialog = new HtmlDialog();
        }
    }

    private static void runBusinessLogic(){
        dialog.renderWindow();
    }
}