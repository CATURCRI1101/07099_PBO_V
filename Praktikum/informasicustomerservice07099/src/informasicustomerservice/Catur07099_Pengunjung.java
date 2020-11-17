package informasicustomerservice;

import java.util.Date;

public class Catur07099_Pengunjung {
    String Catur07099_NamaPelanggan,noantrian;
    //float debit; float debit, float tunai, 
    //float tunai;
    Date TanggalPembayaran;
    int indexinformasi;
    //int indexPegawai;int indexPegawai
    
    
    public Catur07099_Pengunjung(String Catur07099_NamaPelanggan, String noantrian,Date TanggalPembayaran,
            int indexinformasi) {
    this.Catur07099_NamaPelanggan              = Catur07099_NamaPelanggan;
    this.noantrian         = noantrian;
    //this.debit             = debit;
   // this.tunai             = tunai;
    this.TanggalPembayaran = TanggalPembayaran;
    this.indexinformasi    = indexinformasi;
    //this.indexPegawai      = indexPegawai;
    }

    String getNama() {
        return this.Catur07099_NamaPelanggan;
    }
    

    String getNoantrian() {
        return this.noantrian;
    }

   /* float getDebit() {
        return this.debit;
    }

    float getTunai() {
        return this.tunai;
    }
    */
    Date getTanggalPembayaran() {
        return this.TanggalPembayaran;
    }
    int getindexinformasi() {
        return this.indexinformasi;
    }
    /*int getindexPegawai () {
        return this.indexPegawai;
    }
*/

    
    
}
