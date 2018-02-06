public class Operand {

  int value;  
    
  public Operand( String token ) {
      if (check(token)==true){
          
      }
  }

  public Operand( int value ) {
      this.value = value;
  }

  public int getValue() {
      return value;
  }

  public static boolean check( String token ) {
      return false;
  }
}
