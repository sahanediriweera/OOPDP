import java.util.List;

public class SumOperation extends Operation {
    public double execute(List<Double> operand){
        double result = operand.get(0);

        for (int i = 1; i<operand.size();i++){
            result+=operand.get(i);
        }

        return result;
    }
}
