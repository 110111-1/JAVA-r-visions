package exoNFA032;
import java.util.Scanner;
public class Exo1_1_PrixBilletAutocar {
	public static int indiceVille(String[] lesVilles, String ville){
		for (int i = 0; i < lesVilles.length; i++) {
			if(lesVilles[i].equals(ville)){
				return i;
			}
		}
		throw new IllegalArgumentException("Erreur de saisie");
	}
	public static double prixTrajet(String[]gare, Double[] prix, String ville1, String ville2){
		double prixTrajet = 0;
		int v1, v2, debut, fin;
		v1 = indiceVille(gare,ville1);
		v2 = indiceVille(gare,ville2);
		if(v1<v2){
			debut = v1;
			fin = v2;
		}
		else{
			debut = v2;
			fin = v1;
		}
		for (int i = debut; i < fin; i++) {
			prixTrajet = prixTrajet + prix[i];
		}
		return prixTrajet;
	}
	public static void main(String[]args){
		String[] gare = {"Vierzon", "Salbris", "Nouans", "Lamotte-Beuvron", "La Fert� Saint-Aubin", "Orl�ans"};
		Double[] prix = {3.2,1.8,2.3,4.2,5.0};
		Scanner read = new Scanner(System.in);
		for (int i = 0; i < gare.length; i++) {
			System.out.print(gare[i]+" | ");
		}
		System.out.println();
		System.out.print("Entrer la gare de d�part : ");
		String d�part = read.nextLine();
		System.out.print("Entrez la gare d'arriv�e : ");
		String arriv�e = read.nextLine();
		read.close();
		System.out.println("Le prix du trajet est de : "+prixTrajet(gare, prix, d�part, arriv�e));
	}
}
