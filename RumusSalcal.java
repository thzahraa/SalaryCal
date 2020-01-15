import java.util.Scanner;

public class RumusSalcal{
	public static void main(String[] args) {
		double gaji1=3500000.0;
		double tunjangan = 550000.0;
		double bjabatan;
    	double netto,pph21,pphtotal;
	    double bpjs, pengurang;
	    double total, total2;
	    double iuran = 100000;


	    //pph21
	    bjabatan = ((gaji1) * 5)/100;
	    pengurang = bjabatan + iuran;

	    netto = gaji1 - pengurang;
	    pph21 = netto + tunjangan;
	    pphtotal = (gaji1 + tunjangan) - pph21;
		System.out.print("Gaji Bulan  :  \n");
		System.out.print(pphtotal + " \n");
	   
	    //bpjs
	    bpjs = ((gaji1 + tunjangan) * 4)/100;
		System.out.print("Biaya BPJS Kesehatan  : \n");
		System.out.print(bpjs + " \n");
	  
	    //net salary
	    total = pphtotal + bpjs;
		total2 = (gaji1 + tunjangan) - total;
		System.out.print("Total Gaji Bersih : \n");
		System.out.print(total2 + " \n");
	        
	          

	}
}