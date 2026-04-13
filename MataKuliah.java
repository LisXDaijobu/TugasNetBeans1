package akademis;

public class MataKuliah {
    String kodeMk;
    String namaMk;

    public MataKuliah(String kodeMk, String namaMk) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
    }

    public void tampilkan() {
        System.out.println("Kode MK  : " + kodeMk);
        System.out.println("Nama MK  : " + namaMk);
    }
}
