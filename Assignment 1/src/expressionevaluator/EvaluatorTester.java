package expressionevaluator;

public class EvaluatorTester {
  public static void main(String[] args) {
    Evaluator evaluator = new Evaluator();

        System.out.println(evaluator.eval("1+22*4/3"));
    
    /*for ( String arg : args ) {
      System.out.format( "%s = %d\n", arg, evaluator.eval( arg ) );
      System.out.println( arg + " = " + evaluator.eval( arg ) );
    }*/
  }
}
