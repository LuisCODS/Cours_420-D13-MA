package posteCanada;

public interface Isubject {
	public void subscribe(IObservateur observer);
	public void unsubscribe(IObservateur observer);
	public void notifyobservers();

}
