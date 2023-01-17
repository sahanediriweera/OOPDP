import java.util.List;

public class AvgOperation extends SumOperation{
    public double execute(List<Double> operand){
        double sum = super.execute(operand);
        return sum/operand.size();
    }
}
