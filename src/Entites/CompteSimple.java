package Entites;

import java.util.Date;

public class CompteSimple extends Compte {
    private float decouvert;

    public CompteSimple(float decouvert) {
        this.decouvert = decouvert;
    }

    public CompteSimple() {
    }

    public float getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(float decouvert) {
        this.decouvert = decouvert;
    }

    @Override
    public void verser(float mt) {
        super.verser(mt);
    }

    @Override
    public void retirer(float mt) {
        super.retirer(mt);
    }
}
