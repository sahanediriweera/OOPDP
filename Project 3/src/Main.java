import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String operator;
        List<Double> operand = new ArrayList<>();
        operator = args[0];
        for (int i=1;i<args.length;i++){
            operand.add(Double.parseDouble(args[i]));
        }

        Operation operation = OperationFactory.create(operator);

        System.out.println(operator + "=="+ operation.execute(operand));
    }
}