public class Pesawat extends Kendaraan {

	// Pesawat constructor
	public Pesawat (String nama) {
		super(nama);
	}
	
	// return biaya for pergi using this class object
	public int getBiaya (int jarak) {
		return jarak * 1000000;
	}
}