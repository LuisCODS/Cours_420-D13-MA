package payement_Strategy;

public class PayementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Commande cmd = new Commande(1, new CarteCredit());
		cmd.doPayement();
		
	}

}
