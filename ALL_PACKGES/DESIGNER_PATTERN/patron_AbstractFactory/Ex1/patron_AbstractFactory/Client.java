package patron_AbstractFactory;

public class Client {

	public static void main(String[] args) {

		Voiture vl = new TestFactory().FavriqueVoiture("luxe");
		System.out.println(vl.getRoue().getClass());
		System.out.println(vl.getSon().getClass());

		System.out.println("_________________________________________________");
		
		Voiture v2 = new TestFactory().FavriqueVoiture("populaire");
		System.out.println(v2.getRoue().getClass());
		System.out.println(v2.getSon().getClass());

	}

}
