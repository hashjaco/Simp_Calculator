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
      if (token == null) return false;
      else {
          int length = token.length();
          int i = 0;
         do { 
              if (Character.isDigit(token.charAt(i))) {
                  i++;
                  return true;
              }
              else {
                  return false;
              }
          } while (Character.isDigit(token.charAt(i)) && i < length);
      }
  }
  
}
