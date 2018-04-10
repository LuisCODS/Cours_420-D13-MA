package vihicule;

public class factoryvoitureessence extends factoryvoiture {

	factoryvoitureessence(){}
	protected Vehicule factorymethod() {
		System.out.println("voiture essence");
		return new VoitureEssence();
	}

}
