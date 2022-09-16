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
public class Cadre extends Employe {

    private int indice;

    public Cadre(int matricule, String nom, String prenom, LocalDate d, int indice) {
        super(matricule, nom, prenom, d);
        this.indice = indice;
    }

    @Override
    public double getSalaire() {
        int salaire;
        switch (this.getIndice()) {
            case 1:
                salaire = 13000;
                break;
            case 2:
                salaire = 15000;
                break;
            case 3:
                salaire = 17000;
                break;
            case 4:
                salaire = 20000;
                break;
            default:
                throw new AssertionError();
        }
        return salaire;
    }

    /**
     * @return the indice
     */
    public int getIndice() {
        return indice;
    }

    /**
     * @param indice the indice to set
     */
    public void setIndice(int indice) {
        this.indice = indice;
    }

}
