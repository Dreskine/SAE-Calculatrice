public class CalculatriceSimple {
    public static void main(String[] args) {
        try 
        {
            Nombres six = new Nombres(6);
            Nombres dix = new Nombres(10);
            Nombres zero = new Nombres(0);

            Operation addition = new Addition(dix, six);
            System.out.println(addition + " = " + addition.valeur()); // 10 + 6 = 16

            Operation soustraction = new Soustraction(dix, six);
            System.out.println(soustraction + " = " + soustraction.valeur()); //  10 - 6 = 4

            Operation multiplication = new Multiplication(dix, six);
            System.out.println(multiplication + " = " + multiplication.valeur()); //  10 * 6 = 60

            Operation division = new Division(dix, six);
            System.out.println(division + " = " + division.valeur()); // 10 / 6 = 1

            // Test de la division par zéro pour vérifier la gestion des exceptions
            Operation divisionParZero = new Division(dix, zero);
            System.out.println(divisionParZero + " = " + divisionParZero.valeur()); // doit lancer une exception

        } 
      catch(InputMismatchException e)
        {
            System.out.println("la valeur entre n'est pas la bonne 
            veuillez en entrez une nouvelle");
        }
    }
}
