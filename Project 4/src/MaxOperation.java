import java.util.List;

public class MaxOperation extends Operation {
    public double execute(List<Double> operand){
        double result = operand.get(0);

        for(int i = 1; i< operand.size();i++){
            result = Math.max(result,operand.get(i));
        }
        return result;
    }
}
