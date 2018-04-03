package vihicule;

public class factoryscooterelectric extends Factoryscooter{
	factoryscooterelectric(){}

	protected Vehicule factorymethod() {
		System.out.println("scooter electric");
		return new ScooterElectric();
	
}
	

}
