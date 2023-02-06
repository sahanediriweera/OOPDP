import java.util.List;

public class MinOperation implements Operation{

    List<Double> operands;

    public MinOperation(List<Double> operands){
        this.operands = operands;
    }

    @Override
    public double execute() {
        double result = operands.get(0);

        for(int i = 1;i<operands.size();i++){
            result = Math.min(result,operands.get(i));
        }

        return result;
    }
}
