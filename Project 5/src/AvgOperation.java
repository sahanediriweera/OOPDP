import java.util.List;

public class AvgOperation extends SumOperation{


    AvgOperation(List<Double> operands){
        super(operands);
    }
    @Override
    public double execute() {
        return super.execute()/super.operands.size();
    }
}
