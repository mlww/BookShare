package hello.utilisateurs;

import hello.livre.Livre;

public class CreateUsers { //cette classe n'est pas un objet

	public static void main(String[] args) { // fichier MAIN : point d'entrée dans l'appli
		// TODO Auto-generated method stub
		Utilisateur loueur = CreateUsers.createLoueur(); //utilise methode createLoueur, définie dans classe createUsers, retourne dans une variable loueur un objet de type Utilisateur
		Utilisateur emprunteur = CreateUsers.createEmprunteur();
		Utilisateur emprunteurLoueur = createEmprunteurLoueur(); // package friendly (mm package) pas besoin de CreateUsers. dans les 3 phrases
	
	
	if (loueur instanceof Loueur) { //vérifie quel est le type exact de l'objet
		System.out.println(loueur.nom() + " est un loueur");
	}
	
	if (emprunteur instanceof Loueur) { 
		System.out.println(emprunteur.nom() + " est un loueur");
	}else {
		System.out.println(emprunteur.nom() + " n'est pas un loueur");
	}
	if (emprunteurLoueur instanceof EmprunteurLoueur) {
		System.out.println(emprunteurLoueur.nom() + " est un emprunteur loueur");
	//}else {
		//System.out.println(emprunteurLoueur.nom() + "n'est pas un emprunteur loueur");
		}

	//Creer un livre (on a importé Livre pour avoir ses attributs)
	Livre livre = new Livre();
	livre.titre("Les Misérables")
		.resume("blah blah")
		.nbPages(520);
	((Loueur)loueur).addBook(livre); //recaste loueur en tant que loueur car pour l'instant loueur est un utilisateur
										//on ajoute ce livre dans loueur
	((Loueur)loueur).addBook(livre);
	System.out.println(((Loueur) loueur).booksNumber());
	System.out.println(((Loueur) loueur).listBooks());

	
	
	
	}
	
	private static Utilisateur createLoueur() { //lié a la ligne 7. doit retourner une instance d'un objet Utilisateur 
		return new Loueur() //crée un objet Loueur(instance classe Loueur) qui est dans Utilisateur.java. peut y avoir plrs objets Loueur
				.nom("Aubert") // on applique les methodes de la classe Loueur et range dans chacun des 3 attributs de la classe Loueur
				.prenom("Jean Luc")
				.numAdherent("03254050");
	}
	
	private static Utilisateur createEmprunteur() {
		return new Emprunteur()
				.nom("Talaron")
				.prenom("Delphine")
				.numAdherent("2657871");
	}
	private static Utilisateur createEmprunteurLoueur() {
		return new EmprunteurLoueur()
				.nom("Sakolsancotz")
				.prenom("Nicole")
				.numAdherent("2657871556");
		}

	
}
