import java.util.*;

public abstract class Operator {
    // The Operator class should contain an instance of a HashMap
    // This map will use keys as the tokens we're interested in,
    // and values will be instances of the Operators.

    // Example:
    // Where does this declaration go? What should its access level be?
    // Class or instance variable? Is this the right declaration?
    // HashMap operators = new HashMap();
    // operators.put( "+", new AdditionOperator() );
    // operators.put( "-", new SubtractionOperator() );
    private static HashMap operators = new HashMap();
    static {   
        operators.put("+", new AdditionOperator() );
        operators.put("-", new SubtractionOperator() );
        operators.put("*", new MultiplicationOperator() );
        operators.put("/", new DivisionOperator() );
        operators.put("%", new ModulusOperator() );        
        operators.put("^", new ExponentOperator() );
        operators.put("!", new ExclamationOperator() );
        operators.put("#", new OctothorpeOperator() );
    }
    public abstract int priority();

    public abstract Operand execute(Operand op1, Operand op2);

  public static boolean check(String token) {
        return operators.containsValue(token);
    }
}
