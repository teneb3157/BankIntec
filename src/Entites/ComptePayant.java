package Entites;

import java.util.Date;

public class ComptePayant extends Compte {
    public ComptePayant(int code, int nbCompte, float solde, Date createdDate, Date updatedDate) {
        super(code, nbCompte, solde, createdDate, updatedDate);
    }

    public ComptePayant() {
    }

    @Override
    public int getCode() {
        return super.getCode();
    }

    @Override
    public void verser(float mt) {
        super.verser(mt);
    }

    @Override
    public void retirer(float mt) {
        super.retirer(mt);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
