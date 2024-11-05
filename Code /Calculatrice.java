public class Calculatrice {

    public static void main(String Args[]){

        try{

        Scanner scanner = new Scanner(System.in);
        
        Expression deux = new Nombres(2);
        Expression trois = new Nombres(3) ;
        Expression dixSept = new Nombres(17) ;
        Expression zero = new Nombres(0);
        Expression s = new Soustraction(dixSept, deux) ;
        Expression a = new Addition(deux, trois) ;
        Expression b = new Division(trois, zero);
        Expression d = new Division(s, a) ;
        Expression e = new Multiplication(a,d);
        System.out.println(d + " = " + d.valeur()) ; // affiche ((17 - 2) / (2 + 3)) = 3
        System.out.println(e + "=" +  e.valeur());
        System.out.println(b + "=" + b.valeur());

        }

        catch (InputMismatchException e) {
            System.out.println("La valeur entrée n'est pas correcte. Veuillez entrer une nouvelle valeur.");
        }

         catch (ArithmeticException e) {
            System.out.println("Erreur arithmétique : Division par zéro ou opération invalide.");
        }

    }
}
git