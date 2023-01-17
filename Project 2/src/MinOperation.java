import java.util.List;

public class MinOperation extends Operation {
    public double execute(List<Double> operands){
        double result = operands.get(0);
        for(int i = 1;i<operands.size();i++){
            result = Math.min(result,operands.get(i));
        }
        return result;
    }
}
