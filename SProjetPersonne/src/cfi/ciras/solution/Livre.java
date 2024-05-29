package cfi.ciras.solution;

import java.util.Scanner;

public class Livre {

	private int ISBN;
	private String titre;
	private Auteur[] AUTH = new Auteur[4];
	String A, B;
	int E, R, T;
	Scanner Console = new Scanner(System.in);

	public Livre(int ISBN, String titre, int T) {

		this.ISBN = ISBN;
		this.titre = titre;
		this.T = T;
		try {

			for (int i = 0; i < T; i++) {
				System.out.println("Entrer votre Nom: ");
				A = Console.next();
				System.out.println("Entrer votre Prenom: ");
				B = Console.next();
				System.out.println("Entrer votre Age: ");
				E = Console.nextInt();
				System.out.println("Entrer votre Numero: ");
				R = Console.nextInt();
				AUTH[i] = new Auteur(A, B, E, R);

			}

		} catch (AgeExecption Execept) {

			System.out.println(Execept);
			System.exit(-1);
		}
	}

	public

			void AfficheLivre() {
		System.out.println(" Votre ISBN est: " + this.ISBN + " " + "ET de titre de livre " + " " + this.titre + " "
				+ "Ayant des auteurs au nombre de: ");
		for (int i = 0; i < T; i++) {

			AUTH[i].AffichePersonne();
		}
	}

}