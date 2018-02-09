package expressionevaluator;

public class Operand {

  private int value;  
    
  public Operand( String token ) {
      if (check(token)){
          this.value = Integer.parseInt(token);
      }
  }

  public Operand( int value ) {
      this.value = value;
  }

  public int getValue() {
      return value;
  }

  public static boolean check( String token ) {
      int size = token.length();
      if (size == 0) return false;
      else {
          int i = 0;
          if (token.charAt(0)=='-') i++;
         do { 
              if (Character.isDigit(token.charAt(i))) {
                  i++;
                  return true;
              }
              else {
                  return false;
              }
          } while (Character.isDigit(token.charAt(i)) && i < size);
      }
  }
  
}
