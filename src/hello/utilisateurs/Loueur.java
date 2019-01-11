package hello.utilisateurs;

import java.util.ArrayList; // classes natives de JAVA
import java.util.HashMap;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.LoueurInterface;

//Interface fonctionnelle
interface GetSize{ //va definir un type GetSize,
	public int getSize(HashMap<Livre, Integer> livres, boolean getStock);//définit une methode GetSide qui retourne un entier et
}

public class Loueur extends Utilisateur implements LoueurInterface{//Loueur hérite attribut de Utilisateur et prend methode d'interface

	//private ArrayList<Livre> books; // classe ArrayList:~Tableau<type de données collectionnées dans cette structure dynamique>
									//<>:specifieur
	private HashMap<Livre, Integer> books; //def du tableau named books : un de type livre, et une valeur int
	
	
	public Loueur() { // constructeur
		//this.books = new ArrayList<Livre>();//on doit instancier la classe ArrayList, specifiée par des livres
		this.books = new HashMap<Livre, Integer>(); // instance de books comme etant un réel de type hashmap
	}
	
	public String booksNumber() { //
		String message = "Nombre de livres avec titres différents : ";
		message += this.books.size(); //message  = message+ ->concatenation
		
		return message;
	}
	
	public int getCollectionSize(boolean asStock) {
	
		GetSize size = (collection, getStock) -> { //fonction lambda à l'interieur d'une methode; size est une var de type GetSize = à une fonction
			if(!getStock) {							//j'utilise une var comme étant un fonction qui accepte 2 param : books et getStock
				return collection.size();
			}else {
				int stock=0;
				for(Livre livre : collection.keySet()) {
					stock += collection.get(livre);
					
				}
				return stock;
			}
		}; //car fonction
		return size.getSize(this.books, asStock); //
	}
	
	
	public String listBooks() {
		String message = "Livres de la collection de " + this.nom + ": \n"; // "\n" : retour à la ligne 
		//boucle sur la collection des livres
		for (HashMap.Entry<Livre, Integer> StockLivre: this.books.entrySet()) { //~for each. le for va parcourir cq element de this.books et va ranger cet element dans livre
										//sortira de la ligne qd il n'y aura plus d'element
			message += StockLivre.getKey().titre() + ": quantité en stock ("+ StockLivre.getValue() +")\n";
		}
		return message;
	}
	
	
	@Override
	public Utilisateur addBook(Livre livre) {//si le livre n'est pas dans la collec, ajouter le livre
		// TODO Auto-generated method stub
		if (this.books.containsKey(livre)) {
			Integer oldValue = this.books.get(livre);
			oldValue = oldValue +1;
			this.books.replace(livre, oldValue);// incremente + 1
		}else {		
			this.books.put(livre,1); //put~add	je recupere la valeur courante (ici 1) et je rajoute +1 = je l'ajoute a la collec
		}
		
		//if (!this.books.contains(livre)) // !: not, ici qui ne contient pas
		//this.books.add(livre); //ajoute un livre grace à array
		return this;
	}
	
	
	@Override
	public Utilisateur loan(Livre livre) { // si clé existe :si pas =0 on peut retirer, on enleve la quatité, si =0 on peut rien faire
		// TODO Auto-generated method stub
		if (this.books.containsKey(livre) && this.books.get(livre) >0) {//  verifie si la clé exsite et si diff de 0
					Integer oldValue = this.books.get(livre);
					oldValue = oldValue -1;					//enleve la qté 
					this.books.replace(livre, oldValue);		
				//}else {
					
			}
		
		return this;
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
