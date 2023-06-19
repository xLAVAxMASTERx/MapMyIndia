class number {
    private int natural;
    public int getnatural ( ) {
    return natural;
    }
    public void setnatural ( int natural ) {
    this.natural = natural;
    }
    }
    public class main {
    public static void main (String args []){
    number a1= new number ();
    a1.setnatural(12);
    System.out.println("natural number is " + a1. getnatural ( ) );
    }
    }