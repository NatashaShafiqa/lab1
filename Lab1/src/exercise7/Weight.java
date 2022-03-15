package exercise7;

public class Weight {

	double mass;
	
	public Weight(double mass) {
		this.mass = mass;
	}
	
	void setMass(double mass) {
		this.mass = mass;
	}
	
	public void weightCalculation() {
		
		double earthWeight = mass * 9.81;
		double marsWeight = mass * 3.71;
		
		System.out.println("The mass is  "+ mass +"kg \nWeight on Earth: " + earthWeight + "N\nWeight on Mars: "+ marsWeight +" N\n");
	}
}
