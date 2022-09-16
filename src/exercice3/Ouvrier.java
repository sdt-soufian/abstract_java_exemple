/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercice3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author soufian
 */
public class Ouvrier extends Employe {
    private LocalDate dateEntreeSociete;
    private static int SMIG = 2500;
    private double salaire;
    
    public Ouvrier(int matricule, String nom, String prenom, LocalDate d, LocalDate dateEntree){
        super(matricule, nom, prenom, d);
        this.dateEntreeSociete = dateEntree;
    }

    @Override
    public double getSalaire() {
        LocalDateTime now = LocalDateTime.now();
        LocalDate dateEntree = this.dateEntreeSociete;  
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dEntreeFormat = LocalDate.parse(dtf.format(dateEntree), DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate dNow = LocalDate.parse(dtf.format(now), DateTimeFormatter.ISO_LOCAL_DATE);
        Period p = Period.between(dNow, dEntreeFormat);
        int anciennete = Math.abs(p.getYears());
        System.out.println(anciennete);
        this.salaire = SMIG + (anciennete)*100;                                          //Salaire = SMIG + (Ancienneté en année)*100.
        if(this.salaire < SMIG*2){
            return this.salaire;
        }else{
            return SMIG;
        }
    }
    /**
     * @return the dateEntreeSociete
     */
    public LocalDate getDateEntreeSociete() {
        return dateEntreeSociete;
    }

    /**
     * @param dateEntreeSociete the dateEntreeSociete to set
     */
    public void setDateEntreeSociete(LocalDate dateEntreeSociete) {
        this.dateEntreeSociete = dateEntreeSociete;
    }
    
}
