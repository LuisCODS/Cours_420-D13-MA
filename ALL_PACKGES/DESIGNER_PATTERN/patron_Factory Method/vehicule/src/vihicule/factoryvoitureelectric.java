package vihicule;

public class factoryvoitureelectric extends factoryvoiture {
	factoryvoitureelectric(){}
	
	protected Vehicule factorymethod() {
		System.out.println("voiture electric");
		
		return new VoitureElectric();
	}

}
