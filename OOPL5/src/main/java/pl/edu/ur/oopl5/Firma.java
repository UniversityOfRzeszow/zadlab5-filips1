/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Firma {
    Scanner odczyt = new Scanner(System.in);
    public Pracownik[] pracownik = new Pracownik[100];
    



public void pokaż(){

		for (int i = 0; i < pracownik.length; i++) {
			if (pracownik[i] != null) pracownik[i].pokazDane();
		}
	}

    public void e(int a) {
        
         System.out.println("Podaj imię: ");
            pracownik[a].imie = odczyt.next();
            System.out.println("Podaj nazwisko:");
            pracownik[a].nazwisko = odczyt.next();
            System.out.println("Podaj wiek: ");
           pracownik[a].wiek = odczyt.nextInt();
            System.out.println("Podaj stanowisko: ");
           pracownik[a].stanowisko = odczyt.next();
              pracownik[a] = new Pracownik(pracownik[a].imie,pracownik[a].nazwisko, pracownik[a].wiek, pracownik[a].stanowisko );
        
    }}