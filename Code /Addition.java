public class Addition extends Operation {
    public Addition(Expression op1, Expression op2) {
        super(op1, op2);
    }

    public double valeur() {
        return (getOperande1().valeur() + getOperande2().valeur()); //utilise des méthodes getOperande1() et getOperande2() pour accéder aux opérandes dans les sous-classes.
    }

    public String toString() {
        return getOperande1() + " + " + getOperande2();
    }
}
