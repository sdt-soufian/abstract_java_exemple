/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercice3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author soufian
 */
public class Exercice3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ouvrier ov1 = new Ouvrier(120, "Nejam", "med", LocalDate.of(1997, 07, 17), LocalDate.of(2017, 1, 13));
        Cadre cadre = new Cadre(100, "l'harrak", "Oum", LocalDate.of(1996, 03, 12), 2);
        Patron patron = new Patron(1, "SEDATI", "Soufian", LocalDate.of(1986, 07, 07), 500000, 60);
        
        System.out.println(ov1.getSalaire());
        System.out.println(cadre.getSalaire());
        System.out.println(patron.getSalaire());
    }

}
