package patron_AbstractFactory;

public class TestFactory {

	
	public static Voiture FavriqueVoiture(String type)
	{				
			IvoitureFactory ivf = null;
			
			switch (type)
			{
				case "luxe":	
					ivf = new VoitureLuxeFActory();
					break;
				case "populaire":	
					ivf = new VoiturePopulaireFactory();
					break;
			}
			Voiture v = new Voiture();
			v.setRoue(ivf.FabriquerRour());
			v.setSon(ivf.FabriquerSon());
			return v;
	}	
	
}
