package Entites;

import java.util.Date;

public class Compte {
    private int code;
    private int nbCompte;
    private float solde;
    private Date CreatedDate;
    private Date updatedDate;

    public Compte(int code, int nbCompte, float solde, Date createdDate, Date updatedDate) {
        this.code = code;
        this.nbCompte = nbCompte;
        this.solde = solde;
        CreatedDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public Compte() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getNbCompte() {
        return nbCompte;
    }

    public void setNbCompte(int nbCompte) {
        this.nbCompte = nbCompte;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date createdDate) {
        CreatedDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    public void verser(float mt){
        solde+=mt;
    }
    public void retirer(float mt){
        if(mt<solde) solde-=mt;
    }
    public String toString(){
        return("Code="+code+" Solde="+solde);
    }

}
