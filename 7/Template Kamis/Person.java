public class Person {
    private String nama;
    private Kendaraan kendaraan;

    // TO DO constructor person
    public Person(String nama, Kendaraan kendaraan) {
        this.nama = nama;
		this.kendaraan = kendaraan;
    }

    // TO DO return formatted string
	// from asal to tujuan with cost
    public String pergi(String asal, String tujuan, int jarak) {
        return String.format("%s pergi dari %s ke %s naik %s dengan biaya %d", this.nama, asal, tujuan, this.kendaraan.getNama(), this.kendaraan.getBiaya(jarak));
    }

    // TO DO set this person kendaraan
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // TO DO return this person nama
    public String getNama() {
        return this.nama;
    }
}