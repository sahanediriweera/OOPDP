import java.util.List;

public class SumOperation implements Operation{

    private List<Double> operands;

    SumOperation(List<Double> operands){
        this.operands = operands;
    }

    @Override
    public double execute() {
        double result = operands.get(0);

        for (int i = 1 ; i<operands.size();i++){
            result += operands.get(i);
        }

        return result;

    }

    public int getOperandSize(){
        return operands.size();
    }
}
