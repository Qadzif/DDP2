public class Mobil extends Kendaraan {
	
	// Mobil constructor
	public Mobil (String nama) {
		super(nama);
	}
	
	// return biaya for pergi using this class object
	public int getBiaya (int jarak) {
		return jarak * 10000;
	}
}