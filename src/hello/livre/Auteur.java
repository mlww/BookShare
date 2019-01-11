/**
 * 
 */
package hello.livre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import hello.livre.exceptions.BirthdateException;

/**
 * @author Dell
 *
 */
public class Auteur {
	private String nom;
	private String prenom;
	private Date naissance;
	
	//constructeur privé
	private Auteur(String nom, String prenom, Date naissance) { //
		this.nom = nom;
		this.prenom = prenom;
		this.naissance = naissance;
	}
	
	//on modifie directement ici car private -> on call le constructeur privé
	public static Auteur getAuteur(String nom, String prenom, Date naissance) throws BirthdateException {
		Date today = new Date(); // verif que la date est plausible
		if (naissance.after(today)) {
			throw new BirthdateException();
		}
		Auteur auteur = new Auteur(nom, prenom, naissance);
		return auteur;
	}
	
	//n'accepte aucun paramtres -> utiliser pour faire la saisie
	public static Auteur getAuteur() throws ParseException, BirthdateException{ 
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Nom de l'auteur : ");//affiche le message
		String nom = scanner.nextLine();//récup la donnée tapée au clavier
		scanner.nextLine(); //réinitialise le buffer (mémoire tampon) d'entrée
		
		System.out.println("Prénom de l'auteur");
		String prenom = scanner.nextLine();
		scanner.nextLine();
		
		System.out.println("Date de naissance : ");
		String naissance = scanner.nextLine();
		
		//convertir la chaine de naissance en Date
		SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd");
		Date date = format.parse(naissance);//on le renomme en date
		
		scanner.nextLine(); // vide le buffer
		scanner.close(); //ferme le buffer d'entrée
		
		return getAuteur(nom,prenom,date);
		
	}
	//Tableau named array qui renvoit du type Auteur, qui contient un tableau de String, 
	public static ArrayList<Auteur> getAuteur(ArrayList<String[]> array) throws BirthdateException, ParseException{
		String nom;
		String prenom;
		String date;
		ArrayList<Auteur> auteurs= new ArrayList<Auteur>();//va écraser le tableau
		for(int i=0;i<array.size();i++) {
			nom=array.get(i)[0]; // i : est la ligne, 0 est la 1ere colonne : ici nom
			prenom=array.get(i)[1];
			date=array.get(i)[2];
			SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd");
			Date date1 = format.parse(date);//on le renomme en date
			auteurs.add(getAuteur(nom,prenom,date1));
			
		}
		return auteurs;
		
	}
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public Auteur setNom(String nom) {
		this.nom = nom;
		return this;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public Auteur setPrenom(String prenom) {
		this.prenom = prenom;
		return this;
	}
	/**
	 * @return the naissance
	 */
	public Date getNaissance() {
		return naissance;
	}
	/**
	 * @param naissance the naissance to set
	 */
	public Auteur setNaissance(Date naissance) {
		this.naissance = naissance;
		return this;
	}
}
