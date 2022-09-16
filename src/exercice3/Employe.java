/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercice3;

import java.time.LocalDate;

/**
 *
 * @author soufian
 */
public abstract class Employe {
    private int matricule;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    
    public Employe(int matricule, String nom, String prenom, LocalDate d){
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.dateNaissance = d;
    }

    /**
     * @return the matricule
     */
    public int getMatricule() {
        return matricule;
    }

    /**
     * @param matricule the matricule to set
     */
    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the dateNaissance
     */
    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    /**
     * @param dateNaissance the dateNaissance to set
     */
    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    
    public void affichage(){
        System.out.println("Nom "+this.nom+" prnom : "+this.prenom+" matricule : "+this.matricule+" date : "+this.dateNaissance);
    }
    
    public abstract double getSalaire();
}
