/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;
/**
 *
 * @author ACER
 */
public class stos {
    private int wskaźnik_stosu=0;
    private Object [] tablica ;

    public stos(int rozmiar) {
        this.tablica=new Object[rozmiar];
    }

     public void push(int wartosc) {
         if (wskaźnik_stosu<tablica.length){
         this.tablica[wskaźnik_stosu] = wartosc;
         this.wskaźnik_stosu = this.wskaźnik_stosu + 1;
     }
         else{
             System.out.println("stos jest pełny");
         }
     for ( int i=0; i<tablica.length ;i++){
         System.out.println(tablica[i]);
     }
     }
        public void pop() {
             if (wskaźnik_stosu==0){
                 System.out.println("błąd stos jest pusty");
             }
             else{
                
            this.wskaźnik_stosu = this.wskaźnik_stosu - 1;
         for ( int i=0; i<wskaźnik_stosu ;i++){
         System.out.println(tablica[i]);
     }
    }
        }
}
