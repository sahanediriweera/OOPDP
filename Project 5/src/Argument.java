import java.util.ArrayList;
import java.util.List;

public class Argument {
    private String operator;
    private List<Double> operands;

    Argument(String[] args){
        this.operator = args[0];

        List<Double> operands = new ArrayList<>();

        for(int i = 1; i<args.length;i++){
            operands.add(Double.parseDouble(args[i]));
        }

        this.operands = operands;

    }

    public String getOperator(){
        return this.operator;
    }

    public List<Double> getOperands(){
        return this.operands;
    }
}
