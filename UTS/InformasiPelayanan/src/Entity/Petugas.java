package Entity;

import java.util.Date;

public class Petugas extends OrangEntity {
    private String password;
    private String Jabatan;
    
    public Petugas(String Nama, String Password, String Alamat, String JenisKelamin, Date TanggalLahir,  String Username, String Jabatan){
        super(Nama, Password, Alamat, JenisKelamin, TanggalLahir, Username);
        this.password = password;
        this.Jabatan = Jabatan;
    }
    
    public void setJabatan(){
        this.Jabatan = Jabatan;
    }
    
    public String getJabatan() {
        return Jabatan;
    }
    
}
