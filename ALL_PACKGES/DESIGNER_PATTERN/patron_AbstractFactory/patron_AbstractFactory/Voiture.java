package patron_AbstractFactory;

public class Voiture {

	Roue roue;
	Son son;
	
	public void setRoue(Roue roue) {
		this.roue = roue;
	}
	public void setSon(Son son) {
		this.son = son;
	}
	public Roue getRoue() {
		return roue;
	}
	public Son getSon() {
		return son;
	}	
	
	
}
