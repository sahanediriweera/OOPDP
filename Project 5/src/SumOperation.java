import java.util.List;

public class SumOperation extends Operation{

    protected List<Double> operands;

    SumOperation(List<Double> operands){
        this.operands = operands;
    }

    @Override
    public double execute() {
        double result = this.operands.get(0);

        for(int i = 1;i<this.operands.size();i++){
            result += this.operands.get(i);
        }

        return result;
    }
}
