import java.util.ArrayList;
import java.util.List;

public class CommandLineArguments implements Argument{

    private String[] args;

    CommandLineArguments(String[] args){
        this.args = args;
    }

    @Override
    public List<Double> getOperands() {
        List<Double> operands = new ArrayList<>();

        for(int i = 1; i<operands.size();i++){
            operands.add(Double.parseDouble(args[i]));
        }

        return operands;

    }

    @Override
    public String getOperator() {
        return args[0];
    }
}
