import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //read all the args
        //select operator and operands
        //covert operands to double
        //if min calculate min
        //if max calculate max
        //print result

        String operator;
        List<Double> operands = new ArrayList<>();

        operator = args[0];

        for(int i = 1;i<args.length;i++){
            operands.add(Double.parseDouble(args[i]));
        }

        double result = operands.get(0);
        if(operator.equals("min")){
            for(int i = 1;i<operands.size();i++){
                result  = Math.min(result,operands.get(i));
            }
        } else if (operator.equals("max")){
            for(int i = 1;i<operands.size();i++){
                result = Math.max(result,operands.get(i));
            }
        } else if (operator.equals("sum")) {
            for (int i = 1; i<operands.size();i++){
                result+= operands.get(i);
            }
        }

        System.out.println(result);

    }
}