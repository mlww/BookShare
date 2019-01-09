package hello.utilisateurs;

import java.util.ArrayList; // classes natives de JAVA

import hello.livre.Livre;
import hello.utilisateurs.interfaces.LoueurInterface;

public class Loueur extends Utilisateur implements LoueurInterface{//Loueur hérite attribut de Utilisateur et prend methode d'interface

	private ArrayList<Livre> books; // classe ArrayList:~Tableau<type de données collectionnées dans cette structure dynamique>
									//<>:specifieur
	
	
	public Loueur() { // constructeur
		this.books = new ArrayList<Livre>();//on doit instancier la classe ArrayList, specifiée par des livres
	}
	
	public String booksNumber() { //
		String message = "Nombre de livres : ";
		message += this.books.size(); //message  = message+ ->concatenation
		
		return message;
	}
	
	public String listBooks() {
		String message = "Livres de la collection de " + this.nom + ": \n"; // "\n" : retour à la ligne 
		//boucle sur la collection des livres
		for (Livre livre: this.books) { //~for each. le for va parcourir cq element de this.books et va ranger cet element dans livre
										//sortira de la ligne qd il n'y aura plus d'element
			message += livre.titre() + "\n";
		}
		return message;
	}
	
	
	@Override
	public Utilisateur addBook(Livre livre) {
		// TODO Auto-generated method stub
		if (!this.books.contains(livre)) // !: not, ici qui ne contient pas
		this.books.add(livre); //ajoute un livre grace à array
		return this;
	}

	@Override
	public Utilisateur loan(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur calculeCotisation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur toEmprunteur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur toEmprunteurLoueur() {
		// TODO Auto-generated method stub
		return null;
	}

}
