package vihicule;

public class test {
	
	public static void main(String[] args) {
	
	FactoryVehicule f1=new factoryscooterelectric();
	FactoryVehicule f2=new factoryscooteressence();
	FactoryVehicule f3=new factoryvoitureessence();
	FactoryVehicule f4=new factoryvoitureelectric();
	
	f1.Commandervehicule();
	f2.Commandervehicule();
	f3.Commandervehicule();
	f4.Commandervehicule();
	
	}
	

}
