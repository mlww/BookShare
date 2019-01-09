/**
 * 
 */
package hello;

/**
 * @author Dell
 *
 */
public class Emprunteur extends Utilisateur {

	private int nbLivres;
	private int duree;
	
	/* (non-Javadoc)
	 * @see hello.Utilisateur#setNbLivres(int)
	 */
	@Override
	protected Loueur setNbLivres(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.Utilisateur#getNbLivres()
	 */
	@Override
	protected int getNbLivres() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see hello.Utilisateur#getCotisation()
	 */
	@Override
	protected Double getCotisation() {
		// TODO Auto-generated method stub
		return null;
	}
public Emprunteur() {
	super();
	this.nbLivres = 5;
	this.duree =15;
}
	public Emprunteur(String nom, String prenom, String numAdherent) {
		super(nom,prenom,numAdherent);
	this.nbLivres =5;
	this.duree = 15;
	}
}
	
	
	

