package hdr;

public class PayementEmployee implements IObservateur{
	public void update(Employe e, String message)
	{
		System.out.println("le departement financier est notifie");
		System.out.println(message +" : " +e.getName()+e.getSalaire().getSalaryParHeure());
	}

}
