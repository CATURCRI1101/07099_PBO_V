
package Model;

import Entity.Petugas;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class PetugasModel implements Interface{
    private ArrayList<Petugas> PetugasArrayList;
    
    public PetugasModel() {
        PetugasArrayList = new ArrayList<Petugas>();
    }
    
    public void insertPetugas(Petugas Petugas) {
        PetugasArrayList.add(Petugas);
    }
    
    public void view() {
        for (Petugas Petugas : PetugasArrayList) {
            System.out.println("========================================================");
            System.out.println(" Username : " + Petugas.getUsername()
                    + "\n Nama : " + Petugas.getNama()
                    + "\n Alamat : " + Petugas.getAlamat()
                    + "\n Jenis Kelamin : " + Petugas.getJenisKelamin()
                    + "\n Jabatan : " + Petugas.getJabatan()
                    + "\n Tanggal Lahir : " + new SimpleDateFormat("dd-MM-yyyy").format(Petugas.getTanggalLahir()));
            System.out.println("========================================================");
            System.out.println();
        }
    }
    
    public int cekData(String username, String password) {
        int loop = 0;
        for (Petugas Petugas : PetugasArrayList) {
            if (Petugas.getUsername() == username && Petugas.getPassword().equals(password)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
    
    
    public Petugas PetugasArrayList(int index) {
        return PetugasArrayList.get(index);
    }
    
}
