public class Nombres extends Expression {
    private int valeurNombre;

    public Nombres(int valeur) {
        this.valeurNombre = valeur;
    }

    public double valeur() {
        return valeurNombre;
    }

    public String toString() {
        return "(" + this.valeurNombre + ")";
    }
}

