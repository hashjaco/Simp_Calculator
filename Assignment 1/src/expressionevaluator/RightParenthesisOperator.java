/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionevaluator;

/**
 *
 * @author hjaco
 */
public class RightParenthesisOperator extends Operator {
    @Override
    public int priority() {
        return 0;
    }

    @Override
    public Operand execute(Operand op1, Operand op2) {
       return null;
    }
}
