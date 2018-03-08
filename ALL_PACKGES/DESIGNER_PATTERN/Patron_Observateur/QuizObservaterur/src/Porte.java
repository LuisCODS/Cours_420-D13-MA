
public class Porte implements IObservateur {
	
	boolean isOpen ;	
	
	@Override
	public void UpDateMe() {
		setOpen(true);
		System.out.println("PORTE : Fermerture authomatique...");
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}		
}
