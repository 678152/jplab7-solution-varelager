package no.hvl.dat100.varelager;

public class Varelager {

	protected Vare[] varer;
	protected int antall;
	
	public Varelager(int n) {
		
		antall = 0;
		varer = new Vare[n];

	}
	
	public Vare[] getVarer() {
		
		return varer;

	}
	
	public boolean leggTilVare(Vare v) {
		
		boolean sattinn = false;
		
		if (antall < varer.length) {
			varer[antall] = v;
			antall++;
			sattinn = true;
		}
		
		return sattinn;

	}
	
	public boolean leggTil(int varenr, String navn, double pris) {
		
		Vare v = new Vare(varenr,navn,pris);
		
		boolean sattinn = leggTilVare(v);
		
		return sattinn;

	}
	
	public Vare finnVare(int varenr) {
			
		Vare v = null;
		int i = 0;
		while (i<varer.length && (v == null)) {
			
			int vnr = varer[i].getVarenr();
			
			if (vnr == varenr) {
				v = varer[i];
			}
			
			i++;
		}
		
		return v;

	}
	
	private final String SEP = "==============================";
	
	public void printVarelager() {
				
		System.out.println(SEP);
		
		for (Vare v : varer) {
			System.out.println(v.toString());
		}

		System.out.println(SEP);
	}
	
}
