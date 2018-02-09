package expressionevaluator;

/**
 *
 * @author hjaco
 */
public class AdditionOperator extends Operator {

    @Override
    public int priority() {
        return 2;
    }

    @Override
    public Operand execute(Operand op1, Operand op2) {
       Operand newOperand = new Operand(op1.getValue()+op2.getValue());
       return newOperand;
    }
    
}
