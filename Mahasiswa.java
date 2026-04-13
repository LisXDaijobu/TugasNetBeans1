public class Mahasiswa {
    String npm;
    String nama;
    double ipk;
    int semester;

    public Mahasiswa(String npm, String nama, double ipk, int semester) {
        this.npm = npm;
        this.nama = nama;
        this.ipk = ipk;
        this.semester = semester;
    }

    public void tampilkan() {
        System.out.println("NPM      : " + npm);
        System.out.println("Nama     : " + nama);
        System.out.println("IPK      : " + ipk);
        System.out.println("Semester : " + semester);
    }
}
