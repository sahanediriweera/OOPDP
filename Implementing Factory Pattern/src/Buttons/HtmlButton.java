package Buttons;

public class HtmlButton implements Button {
    @Override
    public void render(){
        System.out.println("<button> Click </button>");
    }

    @Override
    public void onClick() {
        System.out.print("Click Button Says Hellow World");
    }
}
