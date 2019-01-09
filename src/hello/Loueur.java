/**
 * 
 */
package hello;


import hello.service.Parametre;

/**
 * @author Dell
 *
 */
public class Loueur extends Utilisateur {

	/**
	 * 
	 */
	private int nbLivres;
	private double cotisation; 

	

	public Loueur() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param numAdherent
	 */
	public Loueur(String nom, String prenom, String numAdherent) {
		super(nom, prenom, numAdherent);
		// TODO Auto-generated constructor stub
	}
	  public int getNbLivres() {
	        return nbLivres;
	    }

	    public Loueur setNbLivres(int nbLivres) {
	        this.nbLivres = nbLivres;
	        return this;
	    }

	    public Double getCotisation() {
	        return cotisation;
	    }

	  /*  public Loueur setCotisation(Cotisation cotisation) {
	        Double cot = 0.;
	        cot = cotisation.getCoutHT();
	       // System.out.println(cot);

	        if (this.nbLivres >= cotisation.getNbMin()) {
	            cot =  (cot - (cotisation.getRemise() * 0.01*cot));
	           // System.out.println(cot);
	        }
	        cot = cot + (cot * cotisation.getTva()*0.01);
	        System.out.println(cot);
	        this.cotisation = cot;
	        return this;
	    }**/
	    public int nbLivres() {//rentré a la main dans Hello - attribut de Loueur, donc entré que qd on crée un nouveau Loueur
	    	return this.nbLivres; //getter
	    			}
	    public Loueur nbLivres(int nbLivres) { //recupere dans Hello le chiffre tapé
	    	this.nbLivres=nbLivres;//setter
	    	return this;
	    			}
	    public double calculeCotisation() {
	        if(this.nbLivres < Parametre.NB_LIVRES_MINI) {
	            this.cotisation=Parametre.MONTANT_COTISATION;
	        }else {
	            this.cotisation=Parametre.MONTANT_COTISATION - (Parametre.MONTANT_COTISATION*Parametre.TX_REMISE);
	        }
	        return this.cotisation;
	    }









	}
