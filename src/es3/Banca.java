package es3;

import es3.entities.ContoCorrente;
import es3.entities.ContoOnLine;
import es3.exceptions.BancaExceptions;

public class Banca {
    public static void main(String args[]) {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);
        System.out.println("Saldo conto:" + conto1.restituisciSaldo());
        try {
            conto1.preleva(21000);
            System.out.println("Saldo conto:" + conto1.restituisciSaldo());
        } catch (BancaExceptions e) {
            System.out.println("Errore durante il prelievo: " + e.getMessage());
//            e.printStackTrace();
        }
        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 1500.0, 1500);
        conto2.stampaSaldo();
        try {
            conto2.preleva(1400);
            conto2.preleva(1400);
            conto2.stampaSaldo();
        } catch (BancaExceptions e) {
            System.out.println("Errore durante il prelievo: " + e.getMessage());
//            e.printStackTrace();
        }
    }
}
