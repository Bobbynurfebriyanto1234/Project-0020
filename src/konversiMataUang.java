	import java.util.Scanner;

	public class konversiMataUang {

	    public static void main(String[] args) {
	        Scanner masukan = new Scanner(System.in);
	        float rupiah, dolar;
	        System.out.print("Masukan Dolar Anda = ");
	        dolar = masukan.nextFloat();
	        rupiah = (float) (dolar*14000);
	        
	        System.out.println();
	        System.out.println("Hasil Kurs = ");
	        System.out.println("Rupiah = " + rupiah);
	        System.out.println("Dolar = " + dolar);
	        //
	    }
	}

