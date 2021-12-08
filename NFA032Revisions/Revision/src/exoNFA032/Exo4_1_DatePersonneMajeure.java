package exoNFA032;
import java.util.Date;
import java.util.Scanner;
public class Exo4_1_DatePersonneMajeure {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int jour, mois,annee;
		System.out.println("Entrez le jour : ");
		jour = read.nextInt();
		System.out.println("Entrez le mois : ");
		mois = read.nextInt();
		System.out.println("Entrez l'année : ");
		annee = read.nextInt();
		Date test = new Date(annee-1900, mois+1, jour);
		Date today = new Date();
		Date ilya18ans = new Date(today.getYear()-18,today.getMonth(),today.getDate());
		if(test.before(ilya18ans)){
			System.out.println("La personne est majeure");
		}
		else{
			System.out.println("La personne est mineure");
		}
		read.close();
	}

}
