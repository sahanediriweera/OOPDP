import org.w3c.dom.ls.LSInput;

import java.util.List;

public class AvgOperation extends SumOperation{

    AvgOperation(List<Double> operands){
        super(operands);
    }

    @Override
    public double execute() {
        return super.execute()/super.getOperandSize();
    }
}
