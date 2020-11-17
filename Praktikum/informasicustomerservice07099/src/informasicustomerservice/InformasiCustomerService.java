package informasicustomerservice;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class InformasiCustomerService {
    static ArrayList <Catur07099_Pengunjung> dataPengunjung   = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
  
    public static void main(String args[]) {
        System.out.println("Selamat datang di Layanan Jaringan");
        int pil;
        int indexdat;
        do {
            System.out.println("");
            System.out.println("1. Input");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Hapus");
            System.out.println("5. exit");
            System.out.println("Pilih =");
            pil = input.nextInt();
            switch (pil) {
                case 1:
                    add();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                     update();
                     break;
                case 4:
                     delete();
                     break;
              }
        }while(pil != 5);

    }
     static void add(){
         System.out.print("input nama pelanggan = ");
         String Catur07099_NamaPelanggan = input.next();
         System.out.print("input Tgl pembayraan (mm/dd/yyyy) = ");
         Date TanggalPembayaran = new Date(input.next());
         System.out.print("input No Antrian = ");
         String noantrian = input.next();
           for(int i=0;i<Catur07099_pusatinformasi.pusatinformasi.length;i++){
             System.out.println(i+". "+Catur07099_pusatinformasi.pusatinformasi[i]);
         }
         System.out.print("input paket pusatinformasi = ");
         int indexinformasi = input.nextInt();
        
         dataPengunjung.add(new Catur07099_Pengunjung(Catur07099_NamaPelanggan,noantrian,TanggalPembayaran,indexinformasi));
     }
     
     static void view(){
         int index=0;
        for(int i=0; i<dataPengunjung.size();i++){
            index++;
            System.out.println("");
            System.out.println("=== DATA PENGUNJUNG ===");
   
            System.out.println("Nama Pelanggan : " + dataPengunjung.get(i).getNama());
            System.out.println("Tanggal Pembayaran : "+ new SimpleDateFormat("dd-MM-yyyy").format(dataPengunjung.get(i).getTanggalPembayaran()));
            System.out.println("No Antrian : "+ dataPengunjung.get(i).getNoantrian());
            System.out.println("Informasi : "+ Catur07099_pusatinformasi.pusatinformasi[dataPengunjung.get(i).indexinformasi]);
        }
     }
     
      static void update(){
        for(int i=0; i<dataPengunjung.size();i++)
        {
            System.out.println(i+" Nama Pengunjung = "+dataPengunjung.get(i).getNama());
        }
        System.out.print("Pilih Nomor Nama Pengunjung : ");
        int urut = input.nextInt();
        
        System.out.print("input nama pelanggan = ");
         String Catur07099_NamaPelanggan = input.next();
         System.out.print("input Tgl pembayraan (mm/dd/yyyy) = ");
         Date TanggalPembayaran = new Date(input.next());
         System.out.print("input No Antrian = ");
         String noantrian = input.next();
           for(int i=0;i<Catur07099_pusatinformasi.pusatinformasi.length;i++){
             System.out.println(i+". "+Catur07099_pusatinformasi.pusatinformasi[i]);
         }
         System.out.print("input paket pusatinformasi = ");
         int indexinformasi = input.nextInt();
         dataPengunjung.set(urut, new Catur07099_Pengunjung(Catur07099_NamaPelanggan,noantrian,TanggalPembayaran,indexinformasi));
     }
     static void delete()
     
     {
         for(int i=0; i<dataPengunjung.size();i++){
            System.out.println(i+" Nama Pengunjung = "+dataPengunjung.get(i).getNama());
        }
        System.out.print("Pilih Nomor Nama Pengunjung : ");
        int urut = input.nextInt();
        if(urut>=0 && urut<=dataPengunjung.size())
        
        {dataPengunjung.remove(urut);
        System.out.print("REMOVED !!\n");
        }
        else{
            System.out.print("data kosong : ");
        }
     }
}
