package Entites;

import java.util.Date;

public class CompteEpargne  extends Compte{
    private float taux;

    public CompteEpargne(float taux) {
        this.taux = taux;
    }

    public CompteEpargne() {
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }

    public CompteEpargne(int code, int nbCompte, float solde, Date createdDate, Date updatedDate) {
        super(code, nbCompte, solde, createdDate, updatedDate);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
