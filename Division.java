class Division extends Operation {
   
   
    public Division(Expression op1, Expression op2) {
        super(op1, op2);
    }

  
    public double valeur() throws ArithmeticException{ //déclare le type d'exception
        if (getOperande2().valeur() == 0) {
            throw new ArithmeticException("Vous ne pouvez pas divisez par zero ");
        }
        return getOperande1().valeur() / getOperande2().valeur();
    }

    public String toString() {
        return getOperande1() + " / " + getOperande2();
    }
}

