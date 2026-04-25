package Entites;

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
}
