import java.util.List;

public class Avg extends SumOperation{

    public Avg(List<Double> operands){
        super(operands);
    }

    @Override
    public double execute() {
        return super.execute()/super.getOperandSize();
    }
}
