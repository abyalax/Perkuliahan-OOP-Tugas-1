package data;

public class Pegawai {
    private String nama;
    private String posisi;
    private Long gaji;

    public Pegawai(String nama, String posisi) {
        this.nama = nama;
        this.posisi = posisi;
    }

    public String getNama() {
        return nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public Long getGaji() {
        switch (this.posisi) {
            case "Designer":
                this.gaji = 5000000L;
                break;
            case "Programmer":
                this.gaji = 6000000L;
                break;
            case "Tester":
                this.gaji = 7000000L;
                break;
            case "Project Manager":
                this.gaji = 8000000L;
                break;
            default:
                System.out.println("No found this position");
                break;
        }
        return gaji;
    }
}
