package Factory;

import Buttons.Button;
import Buttons.HtmlButton;

public class HtmlDialog extends Dialog{
    public Button createButton(){
        return new HtmlButton();
    }
}
