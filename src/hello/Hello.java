/**
 * 
 */
package hello;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import hello.livre.Auteur;
import hello.livre.Livre;
import hello.livre.exceptions.BirthdateException;

/**
 * @author Dell
 *
 */
public class Hello {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException { //tableau de chaine de nom de args
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		
		Utilisateur moi = new Loueur();
		moi.setNom( "Tartempion");
		moi.setPrenom("Jules");
		moi.setNumAdherent("5722001");
		
		System.out.println("Utilisateur : " + moi.getNom());

		//avec constructeur ayant 3 param
		Utilisateur lui = new Loueur("Bond", "James", "007");
		
		System.out.println("Utilisateur : " + lui.getNom());
		
		//Cotisation cotisation = new Cotisation();
		Utilisateur alien = new Loueur();
		alien
		.nom("ET")
		.prenom("Dvorak")
		.numAdherent("565666"); 
	    //.setNbLivres(35)
        //.setCotisation(cotisation);
		((Loueur)alien).nbLivres(35); // cast de alien qui est Utilisateur, pour le transformer en Loueur (et utiliser ses attributs)


       //  System.out.println("retour maison : " + alien.getNom() + " " + alien.getPrenom() + " La cotisation est: " + alien.getCotisation());
		System.out.println(alien.getNom() + "  " + alien.getPrenom() + " La cotisation est : " + ((Loueur)alien).calculeCotisation());
	
		//1ere façon
		Livre lesFourmis = new Livre("Les Fourmis", "Super livre", 450 );
		System.out.println("Livre : " + lesFourmis.titre() + " : " + lesFourmis.resume());
		
		//2eme façon
		Livre artGuerre= new Livre();
		artGuerre
		.titre("L'art de la Guerre")
		.resume("Premier traité de l'art de la guerre")
		.nbPages(600);
		System.out.println("Livre 2 : " + artGuerre.titre() + " : " + artGuerre.resume() + " - " + artGuerre.nbPages() + "pages");
		
		
		//Auteur
		@SuppressWarnings("deprecation")
		SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd");
		Date date = format.parse("1960-05-09");
		Auteur werber;
		try {
			werber = Auteur.getAuteur("Werber", "Bernard", date);
			System.out.println("Auteur: " + werber.getNom() + " " + werber.getPrenom()+ " né le " + werber.getNaissance());
		} catch (BirthdateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
