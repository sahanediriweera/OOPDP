import java.util.List;

public class MaxOperation implements Operation{

    private List<Double> operands;

    public MaxOperation(List<Double> operands){
        this.operands = operands;
    }

    @Override
    public double execute() {
        double result = operands.get(0);

        for (int i = 1; i< operands.size();i++){
            result = Math.max(result,operands.get(i));
        }

        return result;
    }
}
