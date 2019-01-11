package hello.utilisateurs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import hello.livre.Auteur;
import hello.livre.Livre;
import hello.livre.exceptions.BirthdateException;
import hello.tools.AuteurImport;

public class CreateUsers { //cette classe n'est pas un objet

	public static void main(String[] args) throws ParseException, BirthdateException { // fichier MAIN : point d'entrée dans l'appli
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
	}

	//Creer un livre (on a importé Livre pour avoir ses attributs)
	Livre livre = new Livre();
	livre.titre("Les Misérables")
		.resume("blah blah")
		.nbPages(520);
	((Loueur)loueur).addBook(livre); //recaste loueur en tant que loueur car pour l'instant loueur est un utilisateur
										//on ajoute ce livre dans loueur
	((Loueur)loueur).addBook(livre);
	((Loueur)loueur).addBook(livre);
	((Loueur)loueur).addBook(livre);
	((Loueur)loueur).loan(livre);
	//System.out.println(((Loueur) loueur).booksNumber());
	//System.out.println(((Loueur) loueur).listBooks());
	
	
	//2eme livre
	Livre livre2 = new Livre();
	livre2.titre("Troisième Humanité")
		.resume("blah blah blah")
		.nbPages(400);
	((Loueur)loueur).addBook(livre2);
	((Loueur)loueur).addBook(livre2);
	((Loueur)loueur).loan(livre2);
	System.out.println(((Loueur) loueur).booksNumber());
	System.out.println(((Loueur) loueur).listBooks());
	
	//Creation auteur
	/** use case 1 à la main
	SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd");
	Date date = format.parse("1960-05-09");
	Auteur auteur1 = Auteur.getAuteur("Werber", "Bernard", date);
	
	System.out.println(auteur1.getNom() + " " + auteur1.getPrenom() + " né le " + auteur1.getNaissance() );
	
	
	//use case 2 : par la ligne de commmande
/**	try { //essaye de faire quelque chose. 
		Auteur auteur2 = Auteur.getAuteur();
		System.out.println(auteur2.getNom() + " " + auteur2.getPrenom() + " né le " + auteur2.getNaissance() );
	}catch (ParseException parseException) { //si une exception est levée le catch va l'intercepter
		System.out.println("La date de naissance est incorrecte");
		System.out.println(parseException.getLocalizedMessage());
	} catch (BirthdateException naissance) {
		System.out.println(naissance.getMessage());}*/
		
	
	//Auteur asimov = Auteur.getAuteur();
	
	//Créer les auteurs à partir d'un fichier délimité : on fait une instance
	AuteurImport auteurs = new AuteurImport();
//	  System.out.println(auteurs.getAuteur().get(2)[1]);
	//Affiche les auteurs de la Array venant de auteur
	  System.out.println(Auteur.getAuteur(auteurs.getAuteur()).get(1).getNom() + "  " + Auteur.getAuteur(auteurs.getAuteur()).get(0).getPrenom()) ;
	}
	
	//Version JL de la methode écrite dans auteur
			/**for (String[] unAuteur : auteurs.getAuteurs()){
			 * try{
			 * 	SimpleDateFormat leFormat = new SimpleDateFormat("yyyy-MM-dd");
			 *Date laDate = format.parse(unAuteur[2]);
			 *(ListeAuteurs.add(Auteur.getAuteur(unAuteur[0],unAuteur[1],laDate)); //retourne une instance d'un nouvel auteur
			 *}catch (Exception e){}
			 */
	
	
	
	
	//methodes en dehors du Main
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
