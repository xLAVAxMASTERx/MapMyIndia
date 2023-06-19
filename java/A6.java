// class add {
//     int m;
//     int b;
//     void set (int x, int y) {
//     m=x;
//     b=y;
//     }
//     }
// public class b extends add {
// int total;
// int sum (int x,int y) {
//     total=x+y;
// }
// public static void main (String args [ ] ) {
//     b ob= new b ( );
//     ob.set (10, 12);
//     ob.sum ( ) ;
//     System.out.println("total =" + ob.sum(x,y));
//     }
//     } 


interface printable{
    void print();
    }
    
    class A6 implements printable{
    public void print(){System.out.println("test");}
    
    public static void main(String args[]){
    A6 obj = new A6();
    obj.print();
     }
}
    