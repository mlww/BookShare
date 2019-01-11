/**
 * 
 */
package hello.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class AuteurImport {
	private File auteurFile;
	private static final String FIELD_SEP = ";"; //separation quand ";"
	
	private ArrayList<String[]> auteurs;//tableau dynamique named auteurs contenant un tableau de strings
	//faire une instance de la classe pour pouvoir recup des trucs
	public AuteurImport() {
		//Instancier le ArrayList
		this.auteurs= new ArrayList<String[]>(); //j'appelle le constructeur de ArrayList; initialise arraylist
		
		//Instancier la classe File -> créer l'objet auteurFile
		this.auteurFile = new File("c:\\workspace\\auteurs.txt");//uri du doc sur le pc
		if(this.auteurFile.exists()){
			if(auteurFile.canRead()) {
				//System.out.println("C'est bon, on peut bosser avec le fichier");
				this.process();
			}else { 
				System.out.println("Le fichier n'est pas lisible");
			}
			
		} else { 
			System.out.println("Le fichier demandé n'existe pas");
		}
	}
	
	//tableau qui regroupe les auteurs du auteurimport, est un tableau de String 
	public ArrayList<String[]> getAuteur(){
		//System.out.println(this.auteurs.size());
	return this.auteurs; 
	}
	
	/**
	 * @TODO trouver un moyen de compter le nombre de colonnes pour chaque ligne
	 */
	private void process(){//recupere le doc text
		//TODO compter le nombre de colonnes dans une ligne lue
		try {
			Scanner fileScanner = new Scanner(this.auteurFile);
			
			int rowCount = 0;
			while(fileScanner.hasNext()) {//continue tant qu'il y a des infos
				String row = fileScanner.nextLine();//recupere la ligne courante du fichier
				if (rowCount >0) { //enleve la 1ere ligne (indice0)
					String[] cols = row.split(AuteurImport.FIELD_SEP); //variable cols de type tableau de chaine:sépare les colonnes
					//String message ="";									
					//for (int i=0; i < cols.length; i++) {
					//message += cols[i] + "  ";
						//}
					//message += "\n";
					//System.out.println(message);
					this.auteurs.add(cols); //on range le tableau contenant la ligne dans le array list
				}
				rowCount ++;
			}
		} catch (IOException ioe) {
	}
	}
		
}

