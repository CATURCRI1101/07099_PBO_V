
package Entity;

import java.util.Date;

public abstract class OrangEntity {

    protected String Nama, Password, Alamat, JenisKelamin, Username;
    protected Date TanggalLahir;

    public OrangEntity(String Nama, String Password, String Alamat, String JenisKelamin, Date TanggalLahir, String Username) {
        this.Nama = Nama;
        this.Password = Password;
        this.Alamat = Alamat;
        this.JenisKelamin = JenisKelamin;
        this.TanggalLahir = TanggalLahir;
        this.Username = Username;
    }

    public String getNama() {
        return Nama;
    }

    public String getPassword() {
        return Password;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public Date getTanggalLahir() {
        return TanggalLahir;
    }

    public String getUsername() {
        return Username;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public void setTanggalLahir(Date TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }
}
