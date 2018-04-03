package vihicule;

public class factoryscooteressence extends Factoryscooter{
	
	factoryscooteressence(){}
	protected Vehicule factorymethod() {
		
		System.out.println("scooter essence");
		return new ScooterEssence();
	
}

}
