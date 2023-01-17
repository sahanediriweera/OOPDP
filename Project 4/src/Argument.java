import java.util.ArrayList;
import java.util.List;

public class Argument {

    protected String[] args;

    Argument(String[] args){
        this.args = args;
    }

    public String getOperator(){
        return args[0];
    }

    public List<Double> getOperands(){

        List<Double> operands = new ArrayList<>();

        for( int i = 1; i<this.args.length;i++){
            operands.add(Double.parseDouble(this.args[i]));
        }

        return operands;
    }
}
