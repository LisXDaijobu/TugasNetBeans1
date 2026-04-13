import akademis.MataKuliah;

public class Main {
    public static void main(String[] args) {

        // Object Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("2410010341", "Muhammad Rizky Khalis", 3.25, 4);
        Mahasiswa mhs2 = new Mahasiswa("2023002", "Budi Santoso", 3.50, 4);

        System.out.println("=== Data Mahasiswa ===");
        mhs1.tampilkan();
        System.out.println("---------------------");
        mhs2.tampilkan();

        System.out.println();

        // Object MataKuliah
        MataKuliah mk1 = new MataKuliah("IF101", "Pemrograman Dasar");
        MataKuliah mk2 = new MataKuliah("IF202", "Struktur Data");

        System.out.println("=== Data Mata Kuliah ===");
        mk1.tampilkan();
        System.out.println("---------------------");
        mk2.tampilkan();
    }
}
