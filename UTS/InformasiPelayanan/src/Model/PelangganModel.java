/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Entity.Pelanggan;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class PelangganModel implements Interface {
    private ArrayList<Pelanggan> PelangganArrayList;
    
    public PelangganModel() {
        PelangganArrayList = new ArrayList<Pelanggan>();
    }
    
    public void insertPelanggan(Pelanggan Pelanggan) {
        PelangganArrayList.add(Pelanggan);
    }
    
    public void view() {
        for (Pelanggan Pelanggan : PelangganArrayList) {
            System.out.println("========================================================");
            System.out.println(" Username : " + Pelanggan.getUsername()
                    + "\n Nama : " + Pelanggan.getNama()
                    + "\n Alamat : " + Pelanggan.getAlamat()
                    + "\n Jenis Kelamin : " + Pelanggan.getJenisKelamin()
                    + "\n Tanggal Lahir : " + new SimpleDateFormat("dd-MM-yyyy").format(Pelanggan.getTanggalLahir()));
            System.out.println("========================================================");
            System.out.println();
        }
    }
    
    public int cekData(String username, String password) {
        int loop = 0;
        for (Pelanggan Pelanggan : PelangganArrayList) {
            if (Pelanggan.getUsername() == username && Pelanggan.getPassword().equals(password)) {
                System.out.print("Berhasil Login\n");
            } else {     
                break;
            }
        }
        return loop;
    }
    
    
    public Pelanggan PelangganArrayList(int index) {
        return PelangganArrayList.get(index);
    }
}
