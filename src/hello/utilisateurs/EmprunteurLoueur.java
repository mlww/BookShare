package hello.utilisateurs;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.EmprunteurInterface;
import hello.utilisateurs.interfaces.LoueurInterface;

public class EmprunteurLoueur extends Utilisateur implements EmprunteurInterface, LoueurInterface {

	@Override
	public Utilisateur addBook(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur loan(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur calculeCotisation() {
		// TODO Auto-generated method stub
		return null;
	}

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
