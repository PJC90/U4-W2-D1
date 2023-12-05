package es3.entities;

import es3.entities.ContoCorrente;
import es3.exceptions.BancaExceptions;

public class ContoOnLine extends ContoCorrente {
    double maxPrelievo;
    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }
    public void stampaSaldo() {
        System.out.println("Titolare: " + titolare + "- Saldo: " + saldo + "- Num movimenti: " + nMovimenti + " - Massimo movimenti: "
                + maxMovimenti + "- Massimo prelievo possibile: " + maxPrelievo);
    }
    public void preleva(double x) throws BancaExceptions {
        if (x <= maxPrelievo) {
            super.preleva(x);
        }else{
            throw new BancaExceptions("Il prelievo non è disponibile");
        }
    }
}