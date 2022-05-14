package p2;

import p1.*;

class c2 implements I {

   public int mult(int a, int b) {
    return (a*b);
   }
   
  public static void main(String args[]) {
   c1 c = new c1();
   c2 x = new c2();
   System.out.println( c.sum(5,6) );

   System.out.println( c.div(5,6) );

   System.out.println( x.mult(5,6) );
  }    
}
