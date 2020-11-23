/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Pelanggan extends OrangEntity{
    
    private String Paket;

    public Pelanggan(String Paket, String Nama, String Password, String Alamat, String JenisKelamin, Date TanggalLahir,  String Username) {
        super(Nama, Password, Alamat, JenisKelamin, TanggalLahir, Username);
        this.Paket = Paket;
    }

    public void setPaket(String Paket) {
        this.Paket = Paket;
    }

    public String getPaket() {
        return Paket;
    }
    
}
