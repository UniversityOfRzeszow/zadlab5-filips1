package pl.edu.ur.oopl5;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO zad 3, 5, 6
        
        int n;
        int x;
        Scanner odczyt = new Scanner(System.in);
                System.out.println("podaj wielkość tablicy");
                n = odczyt.nextInt();
        stos stos=new stos(n);
        System.out.println("podaj wartość");
        x = odczyt.nextInt();
        stos.push(x);
        System.out.println("podaj wartość");
         x = odczyt.nextInt();
        stos.push(x);
        System.out.println("podaj wartość");
         x = odczyt.nextInt();
        stos.push(x);
        System.out.println("podaj wartość");
         x = odczyt.nextInt();
        stos.push(x);
        System.out.println(" 1 raz pop");
        stos.pop();
         System.out.println(" 2 raz pop");
        stos.pop();
        System.out.println(" 3 raz pop");
        stos.pop();

        Firma firma = new Firma();
        
        System.out.println("Podaj ilu pracownikow chcesz dodac:");
        int a = odczyt.nextInt();
        for (int i = 0; i < a; i++) {
                            firma.e(a);
                        }
         System.out.println("Wypisanie pracowników");
         firma.pokaż();
}
}