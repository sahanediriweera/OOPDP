import java.util.List;

public class AvgOperation extends SumOperation{

    public AvgOperation(List<Double> operands){
        super(operands);
    }

    @Override
    public double execute() {
        return super.execute()/super.getOperandSize();
    }
}
