import java.util.Scanner;

public class KategoriBarang {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		String inp = "";
		String kategori;
		int kategoriInt;
		
		System.out.println("Selamat datang ! Silahkan masukkan nama barang :");
		
		while (!inp.equals("selesai")) {
			inp = input.nextLine();
			
			if (!inp.equals("selesai") && inp.length() > 0) {
				kategoriInt = encode(inp);
				if (0 <= kategoriInt && kategoriInt <= 4) kategori = "Lucu";
				else if (5 <= kategoriInt && kategoriInt <= 10) kategori = "Unik";
				else kategori = "Langka";
				
				System.out.println(inp + " adalah barang " + kategori);
			}
		}
		
		System.out.println("Terimakasih sudah belanja di QuantaMart!");
	}
	
	static int encode (String arg) {
		double res = 0;
		for (int i = 0; i < arg.length(); i++) {
			res += Math.floor(arg.charAt(i) * Math.PI);
		}
		
		return (int) res % 15;
	}
}