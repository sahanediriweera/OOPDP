import java.util.ArrayList;
import java.util.List;

public class CommandLineArguments implements Arguments{

    private String[] args;

    CommandLineArguments(String[] args){
        this.args = args;
    }

    public String getOperator(){
        return args[0];
    }

    public List<Double> getOperands(){
        List<Double> operands = new ArrayList<>();
        for(int i = 1;i< args.length;i++){
            operands.add(Double.parseDouble(args[i]));
        }
        return operands;
    }

}
