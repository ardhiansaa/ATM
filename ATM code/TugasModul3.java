package Modul3;

import java.util.Scanner;
public class TugasModul3 {
    public static void main(String[] args) {
        boolean running = true;
        int pass = 123456;
        Scanner p = new Scanner(System.in);
        String jawab;
        Scanner scan = new Scanner(System.in);
        int Saldo = 3000;
        int TarikTunai;
        int SetorTunai;
        Scanner s = new Scanner(System.in);

        System.out.println("Selamat Datang Di Bank Jali");
        System.out.println("Silahkan Masukan PIN Anda");
        System.out.print("PIN :  ");
        pass = scan.nextInt();


        if ( pass== 123456)
            {while(running)
                {
                    System.out.println("*======ATM Bank Jali======*");
                    System.out.println("Pilih 1 Untuk Tarik Tunai");
                    System.out.println("Pilih 2 Untuk Setor Tunai");
                    System.out.println("Pilih 3 Untuk Cek Saldo");
                    System.out.println("Pilih 4 Untuk Keluar");
                    System.out.print("Pilih Perintah yang Ingin Anda Jalankan: ");
                    int n = s.nextInt();
                    switch(n)
                    {
                        case 1:
                            System.out.print("Masukkan Jumlah Uang yang Ingin Anda Ambil: ");
                            TarikTunai = s.nextInt();
                            if(Saldo >= TarikTunai)
                            {
                                Saldo = Saldo - TarikTunai;
                                System.out.println("==================================");
                                System.out.println("Silahkan Ambil Uang Anda");
                                System.out.println("Sisa Saldo Anda Tinggal: " + Saldo);
                                System.out.println("==================================");
                                break;
                            }
                            else
                            {
                                System.out.println("========================");
                                System.out.println("Saldo Tidak Mencukupi");
                                System.out.println("========================");
                            }
                            System.out.println("");
                            break;

                        case 2:
                            System.out.print("Masukkan Jumlah Uang yang Ingin Anda Setorkan: ");
                            SetorTunai = s.nextInt();
                            Saldo = Saldo + SetorTunai;
                            System.out.println("==================================");
                            System.out.println("Uang Anda Berhasil Disetorkan");
                            System.out.println("Saldo Anda Menjadi: " + Saldo);
                            System.out.println("==================================");
                            System.out.println("Ingin Melakukan Transaksi Lain?");
                            System.out.print("Jawab [ya/tidak] : ");
                            jawab = scan.nextLine();
                            if(jawab.equalsIgnoreCase("tidak")){running=false;}
                            System.out.println("Terima Kasih");
                            break;

                        case 3:
                            System.out.println("Saldo Anda : "+Saldo);
                            System.out.println("Ingin Melakukan Transaksi Lain?");
                            System.out.print("Jawab [ya/tidak] : ");
                            jawab = scan.nextLine();
                            if(jawab.equalsIgnoreCase("tidak")){running=false;}
                            System.out.println("Terima Kasih");
                            break;

                        case 4:
                            System.exit(0);

                        default:
                            System.out.println("Input Tidak Sesuai");
                            System.out.println(" ");
                    }
                }
            }
        else
            System.out.println("PIN Salah");
    }
}
