import org.w3c.dom.ls.LSInput;

import java.util.List;

public class MaxOperation extends Operation{

    protected List<Double> operands;

    MaxOperation(List<Double> operands){
        this.operands = operands;
    }

    @Override
    public double execute() {
        double result = this.operands.get(0);

        for (int i = 1; i<this.operands.size();i++){
            result = Math.max(result,this.operands.size());
        }

        return result;
    }
}
