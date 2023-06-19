
abstract class natural {
    //abstract method 
 public abstract void number ( ) ;
    }
class odd extends natural {
 public void number ( ) {
System.out.println ("5" );
}
public static void main ( String args [ ] ) {
natural obj = new odd ( );
obj. number ();
}
}