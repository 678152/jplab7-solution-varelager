package no.hvl.dat100.varelager;

public class VarelagerUtils {

	// anta at tabeller med vare som overføres er fylte tabeller
	
	public static Vare finnBilligste(Vare[] varer) {
		
		Vare billigste = varer[0];
		
		for (int i = 1; i<varer.length; i++) {
			
			if (varer[i].erBilligereEnn(billigste)) {
				billigste = varer[i];
			}
		}
		
		return billigste;

	}
	
	public static double totalPris(Vare[] varer) {		
		
		double total = 0.0;
		
		for (Vare v : varer) {
			total = total + v.getPris();
		}
		
		return total;

	}
	
	public static int[] finnVarenumre(Vare[] varer) {
				
		int[] varenumre = new int[varer.length];
		
		for (int i = 0; i<varer.length;i++) {
			varenumre[i] = varer[i].getVarenr();
		}
		
		return varenumre;
		

	}
	
	public static double[] finnPrisDifferanser(Vare[] varer) {
				
		double[] differenser = new double[varer.length-1];

		for (int i = 0; i<differenser.length; i++) {
			
			differenser[i] = varer[i+1].getPris() - varer[i].getPris();
		}
		
		return differenser;
	}
}
