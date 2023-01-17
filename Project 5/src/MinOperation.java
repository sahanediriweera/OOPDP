import java.util.List;

public class MinOperation extends Operation{
    protected List<Double> operands;

    MinOperation(List<Double> operands){
        this.operands = operands;
    }
    @Override
    public double execute() {
        double result = this.operands.get(0);

        for(int i = 1;i<this.operands.size();i++){
            result = Math.min(result,this.operands.get(i));
        }

        return result;
    }
}
