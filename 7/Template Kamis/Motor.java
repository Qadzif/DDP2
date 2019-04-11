public class Motor extends Kendaraan {

	// Motor constructor
	public Motor (String nama) {
		super(nama);
	}
	
	// return biaya for pergi using this class object
	public int getBiaya (int jarak) {
		return jarak * 5000;
	}
}