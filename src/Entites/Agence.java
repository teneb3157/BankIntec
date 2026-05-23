package Entites;

public class Agence {
    private int numAgence;
    private String nom;
    private String adresse;
    private String contact;
    private String email;
    private int nbpersonne;

    public Agence(int numAgence, String nom, String adresse, String contact, String email, int nbpersonne) {
        this.numAgence = numAgence;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
        this.email = email;
        this.nbpersonne = nbpersonne;
    }

    public Agence() {
    }

    public int getNumAgence() {
        return numAgence;
    }

    public void setNumAgence(int numAgence) {
        this.numAgence = numAgence;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNbpersonne() {
        return nbpersonne;
    }

    public void setNbpersonne(int nbpersonne) {
        this.nbpersonne = nbpersonne;
    }
}

