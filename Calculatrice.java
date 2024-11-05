public class Calculatrice {

    public static void main(String Args[]){

        Expression deux = new Nombres(2);
        Expression trois = new Nombres(3) ;
        Expression dixSept = new Nombres(17) ;
        Expression s = new Soustraction(dixSept, deux) ;
        Expression a = new Addition(deux, trois) ;
        Expression d = new Division(s, a) ;
        Expression e = new Multiplication(a,d);
        System.out.println(d + " = " + d.valeur()) ; // affiche ((17 - 2) / (2 + 3)) = 3
        System.out.println(e + "=" +  e.valeur());


    }
}
