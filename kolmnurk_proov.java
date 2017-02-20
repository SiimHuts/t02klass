public class kolmnurk_proov{
 	public static void main(String[] args){
 		kolmnurk nr1=new kolmnurk(10, 7, 12);
 		kolmnurk nr2=new kolmnurk(12, 17, 20);
 		kolmnurk nr3=new kolmnurk(13, 16, 21);

 		System.out.println(nr1.toString());
 		System.out.println(nr2.toString());
 		System.out.println(nr3.toString());
 	}
}

/*
[siimhuts@greeny t02klass]$ java kolmnurk_proov
Kolmnurga ümbermõõt on 29.0 ja pindala 35.0 ruutmeetrit.
Kolmnurga ümbermõõt on 49.0 ja pindala 102.0 ruutmeetrit.
Kolmnurga ümbermõõt on 50.0 ja pindala 104.0 ruutmeetrit.
[siimhuts@greeny t02klass]$
 */
