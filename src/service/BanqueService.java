package service;

public class BanqueService {
	double montant;
	public BanqueService(double montant){
		this.montant=montant;
		
	}
	public double conversion(double montant) {
		return montant*3.3;
	}
	

}
