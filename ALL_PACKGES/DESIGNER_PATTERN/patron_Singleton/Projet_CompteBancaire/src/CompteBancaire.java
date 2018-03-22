import java.util.ArrayList;

public class CompteBancaire implements IObservable {

	double Sold;
	int numero;	
	ArrayList<IObservateur> observables = new ArrayList<IObservateur>();
	
	@Override
	public void Add(IObservateur o)
	{
		observables.add(o);
	}
	@Override
	public void Remove(IObservateur o) 
	{
		observables.remove(o);
	}
	@Override
	public void Notify() 
	{
		for (IObservateur obs : observables) {
			obs.UpDateMe(this);	
		}	
	}
	
	public double getSold() {
		return Sold;
	}
	public void setSold(double sold) {
		Sold = sold;
	}
}
