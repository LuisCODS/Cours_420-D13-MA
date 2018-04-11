package payement_Strategy;

public class Commande {

	private int Id;
	private Payement payement;
	
	
	public Commande(int id, Payement payement) 
	{
		this.Id=id;
		this.payement = payement;
	}
	
	public void doPayement()
	{
		payement.Payer();
	}

}
