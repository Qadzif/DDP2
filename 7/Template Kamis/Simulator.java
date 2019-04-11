public class Simulator {
    public static void main(String[] args) {
        /* TO DO ..... */ Mobil mobil = new Mobil("GO-CAR");
        /* TO DO ..... */ Motor motor = new Motor("GO-JEK");
        /* TO DO ..... */ Pesawat pesawat = new Pesawat("GO-PLANE");

        Person dafa = new Person("Dafa", motor);
        Person emma = new Person("Emma", mobil);

        System.out.println(dafa.pergi("Kutek", "Pacil", 10));
        System.out.println(emma.pergi("Jakarta", "Bandung", 150));

        dafa.setKendaraan(pesawat);
        System.out.println(dafa.pergi("Kutek", "Pacil", 10));

    }
}