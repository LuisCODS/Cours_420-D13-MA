package lecteurFlash;

public abstract class LecteurMedia {
	
	//APPEL
	public void lire()
	{
		choisirLecteurMedia();
		lecteur();
		affichageMessage();
	}
	
	//Tout ce qui est commun doivent être implementés ici(dans la mère).
	void affichageMessage()
	{
		System.out.println("welcome to template media ");	
	}	
	
	//Ce qui est especifique, on l'implement dans les filles.
	public abstract void choisirLecteurMedia();
 	public abstract void lecteur();

	
}//fin
