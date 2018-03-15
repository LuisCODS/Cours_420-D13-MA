package patron_AbstractFactory;

public class VoiturePopulaireFactory implements IvoitureFactory{

	@Override
	public Roue FabriquerRour() {
		return new RoueSimple();
	}
	@Override
	public Son FabriquerSon() {
		return new AudioCassete() ;
	}	
	
}
