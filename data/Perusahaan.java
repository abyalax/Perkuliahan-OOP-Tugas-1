package data;

import java.util.ArrayList;
import utils.Utils;

public class Perusahaan {
    private ArrayList<Pegawai> pegawai;
    private String namaPerusahaan;
    private Long saldoPerusahaan;

    public Perusahaan(String namaPerusahaan, Long saldoPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
        this.saldoPerusahaan = saldoPerusahaan;
        this.pegawai = new ArrayList<Pegawai>();
        System.out.println("Perusahaan " + namaPerusahaan + " berhasil dibuat.\n");
    }

    public String getNamaPerusahaan() {
        return this.namaPerusahaan;
    }

    public String getSaldoPerusahaan() {
        return Utils.formatCurrency(this.saldoPerusahaan);
    }

    public void tambahPegawai(Pegawai pegawai) {
        this.pegawai.add(pegawai);
        System.out.println("Pegawai " + pegawai.getNama() + " telah ditambahkan.");
    }

    public void printPegawai() {
        for (Pegawai pegawai : this.pegawai) {
            System.out.println(pegawai.getNama() + " - " + pegawai.getPosisi());
        }
    }

    public void gajiPegawai(String namaPegawai, Long gaji) {
        boolean pegawaiDitemukan = false;
        
        for (Pegawai pegawai : pegawai) {
            if (pegawai.getNama().equals(namaPegawai)) {
                pegawaiDitemukan = true;
    
                if (saldoPerusahaan >= gaji) {
                    saldoPerusahaan -= gaji; 
                    System.out.println("Gaji sebesar " + Utils.formatCurrency(gaji) + " telah diberikan kepada " + namaPegawai);
                } else {
                    System.out.println("Saldo perusahaan tidak cukup untuk menggaji " + namaPegawai);
                }
                break;
            }
        }
    
        if (!pegawaiDitemukan) {
            System.out.println("Pegawai dengan nama " + namaPegawai + " tidak ditemukan.");
        }
    }


}
