package jana60;

import java.util.Scanner;

public class JavaBigliettoTreno {

	public static void main(String[] args) {
		// Calcolo prezzo biglietto :D
		double km;
		int anni;
	    double sconto;
	    
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserisci i KM passeggero: ");
	    km = scan.nextDouble();
		
	    System.out.print("Inserisci eta' passeggero: ");
	    anni = scan.nextInt();
	    
	    scan.close();
	    
	    double prezzo = km * 0.21 ;
	    
	    if (anni < 18) {
		   sconto = prezzo - ((prezzo / 100)* 20);
		   System.out.println("Il costo del biglietto e di: " + sconto + "€");
		
	    }
	    else if (anni > 65) {
	    	sconto = prezzo - ((prezzo / 100)* 40);
	    	System.out.println("Il costo del biglietto e di: " + sconto + "€");
		}
	    
	    else {
		System.out.println("Il costo del biglietto e di: " + prezzo + "€");
		}
	    
	    
	}

}
