public class kolmnurk{
   double a, b, c;
   public kolmnurk(double alus, double korgus, double kulg){
     a = alus;
     b = korgus;
     c = kulg;
     if(a <=0){throw new RuntimeException("Sobimatu alus");}
 		if(b <=0){throw new RuntimeException("Sobimatu korgus");}
     if(c <=0){throw new RuntimeException("Sobimatu kulg");}
   }

   public double pindala(){
     return (a * b) / 2;
   }

   public double umbermoot(){
     return a + b + c;
   }

   public String toString(){
     return "Kolmnurga ümbermõõt on "+
            umbermoot()+" ja pindala "+pindala()+" ruutmeetrit.";
  }
 }
