import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String operator;
        List<Double> operands = new ArrayList<>();

        operator = args[0];

        for(int i = 1; i< args.length;i++){
            operands.add(Double.parseDouble(args[i]));
        }

        double result = operands.get(0);

        if(operator.equals("min")){
            MinOperation minOperation = new MinOperation();
            result = minOperation.execute(operands);
        } else if (operator.equals("max")) {
            MaxOperation maxOperation = new MaxOperation();
            result = maxOperation.execute(operands);
        } else if (operator.equals("sum")) {
            SumOperation sumOperation = new SumOperation();
            result = sumOperation.execute(operands);
        }

        System.out.println(operator + "==" + result);
    }
}