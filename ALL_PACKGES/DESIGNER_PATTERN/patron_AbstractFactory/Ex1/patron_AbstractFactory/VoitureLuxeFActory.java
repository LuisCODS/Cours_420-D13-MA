package patron_AbstractFactory;

public class VoitureLuxeFActory implements IvoitureFactory{

	@Override
	public Roue FabriquerRour() {
		return new RoueEnAlliage();
	}

	@Override
	public Son FabriquerSon() {
		return new CDPlayer();
	}	
	
}
	