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
public class Patron extends Employe {
    private double chiffreAffaire;
    private double pourcentage; 

    public Patron(int matricule, String nom, String prenom, LocalDate d, double chaiffre, double x) {
        super(matricule, nom, prenom, d);
        this.chiffreAffaire = chaiffre;
        this.pourcentage = x;
    }

    @Override
    public double getSalaire() {
        return this.getChiffreAffaire()*this.getPourcentage()/100;
    }

    /**
     * @return the chiffreAffaire
     */
    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    /**
     * @param chiffreAffaire the chiffreAffaire to set
     */
    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    /**
     * @return the pourcentage
     */
    public double getPourcentage() {
        return pourcentage;
    }

    /**
     * @param pourcentage the pourcentage to set
     */
    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }
    
}
