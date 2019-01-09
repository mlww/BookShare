package hello.utilisateurs;

abstract public class Utilisateur {
		protected String nom;
		protected String prenom;
		protected String numAdherent;
		
		//setter
		public Utilisateur nom (String nom) { // dans la classe utiisateur :le nom
			this.nom = nom; //on lui donne une valeur
			return this; //va retourner un objet de type utilisateur
	}
		//getter
		public String nom() { // va me chercher la valeur de l'attribut de ce nom qui est ch de carac
			return this.nom;
		}
		
		public Utilisateur prenom(String prenom) {
			this.prenom = prenom;
			return this;
		}
		
		public String prenom() {
			return this.prenom;
		}
		
		public Utilisateur numAdherent(String numAdherent){
		this.numAdherent = numAdherent;
		return this;}
		
		public String numAdherent() {
			return this.numAdherent;
		}
		
}
