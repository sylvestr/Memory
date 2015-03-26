
public class Tableau {
	int taille;
	int []contenu;
	int tailleactu;
	int grant;
	
	

public Tableau(int taille) {
		this.taille = taille;
		this.tailleactu = 0;
		this.contenu = new int [taille];
		
	}

public void empiler(int x) {
	
	if (this.tailleactu != this.taille){
		contenu[tailleactu] = x;
		this.tailleactu = tailleactu+1;
	}
}

public int depiler(){
	if (this.tailleactu != 0){
		
		this.tailleactu = tailleactu-1;
		return contenu[tailleactu+1];
	}
	return this.tailleactu;
}

public boolean full(){
	return (this.tailleactu == this.taille);
}

public boolean vide(){
	return (this.tailleactu == 0);
}

}

