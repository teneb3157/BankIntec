package Entites;

import java.util.Date;

public class ComptePayant extends Compte {
    public ComptePayant(int code, int nbCompte, float solde, Date createdDate, Date updatedDate) {
        super(code, nbCompte, solde, createdDate, updatedDate);
    }

    public ComptePayant() {
    }

}
