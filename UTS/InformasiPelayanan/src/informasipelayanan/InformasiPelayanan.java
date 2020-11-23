package informasipelayanan;

import Entity.Pelanggan;
import Entity.OrangEntity;
import Entity.Petugas;
import Model.PelangganModel;
import Model.PetugasModel;
import java.util.Date;
import java.util.Scanner;


public class InformasiPelayanan {
    
    private static PelangganModel dataPelanggan = new PelangganModel();
    private static PetugasModel dataPetugas = new PetugasModel();
    static Scanner input = new Scanner(System.in);
    static int cek;
 
    public static void main(String[] args) {
        int loop = 0;
        
        do {
            int pilih = 0;
            System.out.println("Selamat Datang Di Aplikasi Informasi Pelayanan"
                    + "\n 1. Login"
                    + "\n 2. Register"
                    + "\n 3. Stop");
            System.out.print("Masukkan Pilihan Anda : ");   
            pilih = input.nextInt();
            
            if (pilih == 1) {
                int pilLogin = 0;
                System.out.print(" 1. Login Pelanggan"
                        + "\n 2. Login Petugas"
                        + "\n Pilih : ");
                pilLogin = input.nextInt();
                if (pilLogin == 1) {
                    loginPelanggan();
                } else if(pilLogin == 2){
                    loginPetugas();
                }
                else{
                    break;
                }
            }
            else if (pilih == 2) {
                int pilRegister = 0;
                System.out.print(" 1. Register Pelanggan"
                        + "\n 2. Register Petugas"
                        + "\n Pilih : ");
                pilRegister = input.nextInt();
                if (pilRegister == 1) {
                    registerPelanggan();
                } else if(pilRegister == 2){
                   registerPetugas();
                }
                else{
                    break;
                }
            }
            else if (pilih == 3){
                break;
            }
            else {
                 System.out.print("Input Salah\n");
            }
        }while (loop != 1);
    }
    
    static void loginPelanggan() {
        System.out.print("Username : ");
        String username = input.next();
        System.out.print("Password : ");
        String password = input.next();
        cek = dataPelanggan.cekData(username, password);
        dataPelanggan.view();
        
        Pelayanan();
        
    }
    
    static void Pelayanan(){    
        int kembalian = 0;
        System.out.print("Pilih Layanan :\n1.Layanan Pijat Biasa\tRp.100k\n2.Layanan Pijat Mantap\tRp.200k\n3.Layanan Pijat plus\tRp.500k\n");
        
        System.out.print("Pilih : ");
        int layanan = input.nextInt();
        
        System.out.print("Bayar : ");
        int bayar = input.nextInt();
        
        if(layanan == 1){
            kembalian = bayar - 100000;
        }else if(layanan == 2){
            kembalian = bayar - 200000;
        }else if(layanan == 3){
            kembalian = bayar - 500000;
        }
        
        
        if(kembalian > 0){
            System.out.print("Kembalian anda = " + kembalian + "\n");
            System.exit(0);
        }
        else if(kembalian < 0){
            System.out.print("Uang anda kurang mohon bekerja keras\n");
            System.exit(0);
        }
        else{
            System.out.print("Uang anda pas terima kasih\n");
            System.exit(0);
        }
        
        
        
        
        
    }
    
    static void loginPetugas() {
        System.out.print("Username : ");
        String username = input.next();
        System.out.print("Password : ");
        String password = input.next();
        
        cek = dataPetugas.cekData(username, password);
        dataPetugas.view();
        
        
    }
    
    
    static void registerPelanggan() {
        System.out.print("Input Username = ");
        String username = input.next();
        System.out.print("Input Nama = ");
        String nama = input.next();
        System.out.print("Input Password = ");
        String pass = input.next();
        System.out.print("Input Alamat = ");
        String alamat = input.next();
        System.out.print("Jenis Kelamin = ");
        String jeniskelamin = input.next();
        System.out.print("Input Tanggal Lahir (dd/mm/yyyy) = ");
        Date tanggal = new Date(input.next());
        System.out.print("Paket Apa = ");
        String paket = input.next();
        dataPelanggan.insertPelanggan(new Pelanggan(paket, nama, pass, alamat, jeniskelamin, tanggal, username));
        
        
    }
    
    static void registerPetugas() {
        System.out.print("Input Username = ");
        String username = input.next();
        System.out.print("Input Nama = ");
        String nama = input.next();
        System.out.print("Input Password = ");
        String pass = input.next();
        System.out.print("Input Alamat = ");
        String alamat = input.next();
        System.out.print("Jenis Kelamin = ");
        String jeniskelamin = input.next();
        System.out.print("Input Tanggal Lahir (dd/mm/yyyy) = ");
        Date tanggal = new Date(input.next());
        System.out.print("Jabatan anda = ");
        String jabatan = input.next();
        dataPetugas.insertPetugas(new Petugas(nama, pass, alamat, jeniskelamin, tanggal, username, jabatan));
    }
}
