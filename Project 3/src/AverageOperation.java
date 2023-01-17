import java.util.List;

public class AverageOperation extends SumOperation{
    public double execute(List<Double> operands){
        double sum = super.execute(operands);
        return sum/(operands.size());
    }
}
