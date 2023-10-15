package service;

public class testBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double montant = 123.4;
		BanqueService bs = new BanqueService(montant);
		System.out.println(bs.conversion(montant));
	}

}
