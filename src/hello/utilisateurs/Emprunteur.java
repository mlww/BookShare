package hello.utilisateurs;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.EmprunteurInterface;

public class Emprunteur extends Utilisateur implements EmprunteurInterface {

	@Override
	public Utilisateur facturation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur createBookBorrowing(Loueur loueur, Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur returnBook(Loueur loueur, Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

}
