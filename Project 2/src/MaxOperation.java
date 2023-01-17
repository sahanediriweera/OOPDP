import java.util.List;

public class MaxOperation extends Operation {
    public double execute(List<Double> operands){
        double result = operands.get(0);
        for (int i = 1; i< operands.size();i++) {
            result = Math.max(result, operands.get(i));
        }
        return result;
    }
}
